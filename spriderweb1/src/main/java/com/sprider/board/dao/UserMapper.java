package com.sprider.board.dao;

import org.apache.ibatis.annotations.Param;

import com.sprider.board.entity.User;

public interface UserMapper {
	User select(@Param("name") String name);

	int userNameExits(@Param("name") String name);

	int accountValid(User user);

	int insert(User user);
}
