package com.sprider.board.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sprider.board.dao.UserMapper;
import com.sprider.board.entity.User;
import com.sprider.board.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	public User select(String name) {
		return userMapper.select(name);
	}

	public int userNameExits(String name) {
		return userMapper.userNameExits(name);
	}

	public boolean accountValid(User user) {
		return userMapper.accountValid(user) > 0;
	}

	public int insert(User user) {
		return userMapper.insert(user);
	}

}
