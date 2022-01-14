package com.controlefluxo.veiculos.security;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.controlefluxo.veiculos.domain.enums.Profile;




public class UserSS implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String login;
	private String password;
	private Collection<? extends GrantedAuthority> authorities;
	
	public UserSS(Integer id, String login, String password, Set<Profile> profile ) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.authorities = profile.stream().map(x -> new SimpleGrantedAuthority(x.getDescription())).collect(Collectors.toList());
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return login;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean hasRole(Profile profile) {
		return getAuthorities().contains(new SimpleGrantedAuthority(profile.getDescription()));
		
	}
}
