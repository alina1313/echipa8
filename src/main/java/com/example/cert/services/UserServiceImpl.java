package com.example.cert.services;
import com.example.cert.model.User;
import com.example.cert.repository.*;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public abstract class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}



	

}
