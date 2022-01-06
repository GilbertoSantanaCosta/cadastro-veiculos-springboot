package com.controlefluxo.veiculos.resources;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.controlefluxo.veiculos.domain.User;
import com.controlefluxo.veiculos.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

	@Autowired
	public UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		List<User> obj = userService.findAll();
		
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@Validated @RequestBody User user) {
		
		User obj = userService.insert(user);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{rg}").buildAndExpand(obj.getRg())
				.toUri();
		
		return ResponseEntity.created(uri).build();
	}
}
