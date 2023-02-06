package com.user.controller;

import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.exception.UserNotFoundException;
import com.user.model.UserDetail;
import com.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
		
	@GetMapping("/")
	public String getAll(Model model) {
	
		ArrayList<UserDetail> listOfuser = userService.getAll();
		model.addAttribute("listOfuser", listOfuser);
		return "user";
	}

	@GetMapping("/{id}")
	public String getAll(@PathVariable("id") int id, Model model) throws UserNotFoundException {
		UserDetail user = userService.getById(id);
		if(user.getFirstName()==null || user.getFirstName()=="" )
		throw new UserNotFoundException("user not found!!"+ id);
		model.addAttribute("user", user);
		return "userbyid";
	}

	@GetMapping("/adduser")
	public String addPage(Model model) {
		return "adduser";
	}

	@PostMapping("/save")
	public String save(@RequestParam("fname") String fname,@RequestParam("lname") String lname,@RequestParam("email") String email,@RequestParam("dob") String dob,Model model) {
		UserDetail userDetail = new UserDetail(0, fname, lname, email, dob);
		int i = userService.save(userDetail);
		
		return "redirect:/user/";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") int id ,Model model) {
		UserDetail user = userService.getById(id);
		model.addAttribute("firstName", user.getFirstName());
		model.addAttribute("lastName", user.getLastName());
		model.addAttribute("email", user.getEmail());
		model.addAttribute("dob", user.getDob());
		model.addAttribute("id",user.getId());
		return "update";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id ,Model model) {
		userService.delete(id);
		//model.addAttribute("listOfuser", listOfuser);
		return "redirect:/user/";
	}
	
	@PostMapping("/updateUser")
	public String updateUser(@RequestParam("fname") String fname,@RequestParam("lname") String lname,@RequestParam("email") String email,@RequestParam("dob") String dob,@RequestParam("id") int id,Model model) {
		UserDetail user = userService.getById(id);
		user.setFirstName(fname);
		user.setLastName(lname);
		user.setEmail(email);
		user.setDob(dob);
		int i = userService.update(id,user);
		//model.addAttribute("listOfuser", listOfuser);
		return "redirect:/user/";
	}

	
	
}
