package com.ing.service;

import com.ing.dto.LoginResponseDto;
import com.ing.dto.LoginDto;

public interface LoginService {
	
	public LoginResponseDto processLogin(LoginDto loginRequest);

}
