package com.sprider.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sprider.board.dao.PostMapper;
import com.sprider.board.entity.Post;
import com.sprider.board.service.PostService;

@Service
public class PostServiceImpl implements PostService{

	@Resource
	PostMapper postMapper;
	
	public List<Post> findList() {
		return postMapper.findList();
	}

	public List<Post> postByUser(String userName) {
		return postMapper.postByUser(userName);
	}

	public int insert(Post post) {
		return postMapper.insert(post);
	}

	public int delete(int id) {
		return postMapper.delete(id);
	}

	public int like(int id) {
		return postMapper.like(id);
	}

	public int dislike(int id) {
		return postMapper.dislike(id);
	}

}
