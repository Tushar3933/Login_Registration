package com.login_registration.service;

import com.login_registration.entity.User;

public interface UserService {

	public User saveUser(User user);

	public void removeSessionMessage();

}