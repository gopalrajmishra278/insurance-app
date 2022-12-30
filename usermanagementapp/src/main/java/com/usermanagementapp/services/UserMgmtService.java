package com.usermanagementapp.services;

import java.util.Map;

import org.springframework.security.core.userdetails.User;

public interface UserMgmtService {
	
	public String checkEmail(String email);
	
	public Map<Integer, String> getCountries();
	
	public Map<Integer, String> getStates(Integer countryId);
	
	public Map<Integer, String> getCities(Integer stateId);
	
	public String registerUser(User user);
	
	public String unlockAccount(UnlockAccForm accForm);
	
	public String login(LoginForm loginForm);
	
	public String forgotPwd(String email);
	
	
	
}
