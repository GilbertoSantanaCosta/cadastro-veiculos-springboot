package com.controlefluxo.veiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.controlefluxo.veiculos.domain.User;
import com.controlefluxo.veiculos.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	
	public List<User> findAll(){
		
		List<User> obj = userRepository.findAll();
		
		return obj;
	}
	
	public User insert(User user) {
		
		User obj = user;
		obj.setSenha(pe.encode(user.getSenha()));
		userRepository.save(obj);
		
		return obj;
			
	}
	
	
}
