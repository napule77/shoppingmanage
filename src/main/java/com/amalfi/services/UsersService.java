package com.amalfi.services;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amalfi.entity.Users;
import com.amalfi.exception.UserException;
import com.amalfi.repository.UserRepository;
import com.amalfi.utility.JwtUtil;
import com.amalfi.utility.ToMD5;

@Service
public class UsersService {

	@Autowired
	UserRepository userRepo;

	public Users findByEmail(String email) {
		return userRepo.findByemail(email);
	}

	public Users findByLogin(String email, String password) throws UserException {
		try {
			String pwd5 = ToMD5.MD5(password);
			return userRepo.findByEmailAndPassword(email, pwd5);
		} catch (Exception e) {
			throw new UserException(e.getMessage());
		}
	}

	public Users insertUtenza(Users user) throws UserException {
		try {
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			String token = JwtUtil.generateToken(user.getEmail());
			Users u = new Users();
			u.setAbilitato(false);
			u.setCognome(user.getCognome());
			u.setDatacreazione(sf.parse(sf.format(new Date())));
			u.setDataricezionetoken(null);
			u.setEmail(user.getEmail());
			u.setNome(user.getNome());
			String pwd5 = ToMD5.MD5(user.getPassword());
			u.setPassword(pwd5);
			u.setToken_received(token);
			u.setToken_send(null);
			return userRepo.save(u);
		} catch (Exception e) {
			throw new UserException(e.getMessage());
		}
	}

}
