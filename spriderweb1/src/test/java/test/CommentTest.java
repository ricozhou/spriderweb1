package test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sprider.board.entity.Comment;
import com.sprider.board.service.CommentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/spring-mybatis.xml" })
public class CommentTest {
	@Resource
	CommentService commentservice;

	/*
	 * @Test public void testFindList(){ List<Post> list =
	 * commentservice.findList(); for (Post post : list) {
	 * System.out.println(post.getAuthorName()); } }
	 */
	@Test
	public void testAdd() {
		Comment comment = new Comment();
		comment.setcContent("good");
		comment.setcAuthorName("sommer");
		comment.setPostId(2);
		int res = commentservice.insert(comment);
		System.out.println(res);

	}
}
