package com.sprider.board.dao;

import org.apache.ibatis.annotations.Param;

import com.sprider.board.entity.Comment;

public interface CommentMapper {

	int insert(Comment comment);

	int delete(@Param("id") int id);

}
