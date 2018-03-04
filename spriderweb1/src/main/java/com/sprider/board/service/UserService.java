package com.sprider.board.service;

import com.sprider.board.entity.User;

public interface UserService {
	User select(String name);

	int userNameExits(String name);

	boolean accountValid(User user);

	int insert(User user);
}
