package com.user.exception;

import java.sql.SQLSyntaxErrorException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(SQLSyntaxErrorException.class)
	public String handleSQLSyntaxErrorException(HttpServletRequest req,Exception ex,Model model) {
		model.addAttribute("error", "SQLSyntaxErrorException");
		model.addAttribute("errorStack", ex.getStackTrace().toString());
		return "error";
	}
	
	@ExceptionHandler(Exception.class)
	public String handleException(HttpServletRequest req,Exception ex,Model model) {
		model.addAttribute("error", ex.getMessage());
		model.addAttribute("errorStack", ex);
		return "error";
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public String handleUserNotFoundException(HttpServletRequest req,Exception ex,Model model) {
		model.addAttribute("error", ex.getMessage());
		model.addAttribute("errorStack", ex);
		return "error";
	}

}
