package com.controlefluxo.veiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.controlefluxo.veiculos.domain.User;
import com.controlefluxo.veiculos.repositories.UserRepository;
import com.controlefluxo.veiculos.security.UserSS;




@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		User user = repo.findByLogin(login);
		if (user == null) {
			throw new UsernameNotFoundException(login);
		}
		return new UserSS(user.getId(), user.getLogin(), user.getPassword(), user.getProfile());
	}
}