package com.cg.restful_ws.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.restful_ws.UserRepository;
import com.cg.restful_ws.io.entity.UserEntity;
import com.cg.restful_ws.service.UserService;
import com.cg.restful_ws.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto createUser(UserDto user) {
		
		UserEntity storedUserDetails = userRepository.findByEmail(user.getEmail());
		
		if(storedUserDetails != null) throw new RuntimeException("Account already exists");

		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);

		userEntity.setEncryptedPassword("test");
		userEntity.setUserId("testUserId");

		storedUserDetails = userRepository.save(userEntity);

		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);

		return returnValue;
	}
}
