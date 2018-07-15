package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.userDetails;

// @Controller
@RestController
public class userController {
	
	@Autowired
	UserRepo userRepo;
	
	@RequestMapping("/homePage")
	@ResponseBody
	public String defaultRoute() {
		return "Default Page";
	}
	
	@PostMapping("/user")
	public userDetails saveUser(@RequestBody userDetails userDetail) {
	System.out.println("calling the addDetails"+userDetail);
		userRepo.save(userDetail);
		return userDetail;
	}
	
	@PutMapping("/user")
	public userDetails updateUser(@RequestBody userDetails userDetail) {
	System.out.println("calling the addDetails"+userDetail);
		userRepo.save(userDetail);
		return userDetail;
	}
	
	@DeleteMapping("/user/{userId}")
	public String deleteUser(@PathVariable int userId) {
		userRepo.deleteById(userId);
		return "deleted";
	}
	
	@GetMapping("/user")
//	@ResponseBody
	public ArrayList<userDetails> getAllDetails(){
		ArrayList<userDetails> list = (ArrayList<userDetails>) userRepo.findAll();
		System.out.println("=" +userRepo.findByuserIdGreaterThan(1002));
		System.out.println("*****" +userRepo.sortByUserId("vivin"));
		System.out.println(list);
		return list;
	}
	
	@RequestMapping("/user/{userId}")
	public Optional<userDetails> getDetailsById(@PathVariable int userId) {
	System.out.println("calling the getDetailsById"+userId);		
		Optional<userDetails> list  = userRepo.findById(userId);
		return list;
	}
	
	
	
	


}
