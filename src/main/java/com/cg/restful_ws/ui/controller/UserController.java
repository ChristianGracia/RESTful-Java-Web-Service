package com.cg.restful_ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.restful_ws.ui.model.response.UserRest;

@RestController
@RequestMapping("users")
public class UserController {
	
	@GetMapping
	public String getUser()
	{
		return "TODO";
	}
	
	@PostMapping
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) 
	{
		return "TODO";
	}
	
	@PutMapping
	public String updateUSer()
	{
		return "TODO";
	}
	
	@DeleteMapping
	public String deleteUser()
	{
		return "TODO";
	}
	
	

}
