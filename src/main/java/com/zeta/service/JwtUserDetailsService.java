package com.zeta.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.zeta.sample.mapper.MbrRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	MbrRepository mbr;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("received id:" + username);
		BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder(10);
		String encryptPw = bcryptPasswordEncoder.encode(mbr.findByMbrId(username).getMbrPw());

		if (mbr.findByMbrId(username).getMbrId().equals(username)) {
			return new User(username, encryptPw, new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}