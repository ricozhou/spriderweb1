package com.sprider.board.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sprider.board.dao.CommentMapper;
import com.sprider.board.entity.Comment;
import com.sprider.board.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Resource
	CommentMapper commentMapper;

	public int insert(Comment comment) {
		return commentMapper.insert(comment);
	}

	public int delete(int id) {
		return commentMapper.delete(id);
	}

}
