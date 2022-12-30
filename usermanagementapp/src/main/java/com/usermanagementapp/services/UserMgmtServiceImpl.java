package com.usermanagementapp.services;

import java.util.Map;

import org.springframework.security.core.userdetails.User;

public class UserMgmtServiceImpl implements UserMgmtService{

	@Override
	public String checkEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getCountries() {
		return null;
	}

	@Override
	public Map<Integer, String> getStates(Integer countryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getCities(Integer stateId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String registerUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String unlockAccount(UnlockAccForm accForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String login(LoginForm loginForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String forgotPwd(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
