package com.user.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.UserDetail;
import com.user.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;

	public ArrayList<UserDetail> getAll() {
		ArrayList<UserDetail>  listOfuser=  (ArrayList<UserDetail>) userRepo.findAll();
		return listOfuser;
	}

	public UserDetail getById(int id) {
		UserDetail user = userRepo.findById(id);
		return user;
	}

	public int save(UserDetail userDetail) {
		int i = userRepo.save(userDetail);
		return i;
	}

	public int update(int id,UserDetail user) {
		int i = userRepo.update(id,user);
		return 0;
	}
	
	public int delete(int id) {
		int i = userRepo.delete(id);
		return 0;
	}
	
	
	
}
