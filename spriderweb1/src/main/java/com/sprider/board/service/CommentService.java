package com.sprider.board.service;

import com.sprider.board.entity.Comment;

public interface CommentService {
	int insert(Comment comment);

	int delete(int id);
}
