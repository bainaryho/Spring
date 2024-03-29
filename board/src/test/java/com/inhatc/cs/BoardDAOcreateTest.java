package com.inhatc.cs;

import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class BoardDAOcreateTest {
	@Inject
	private BoardDAO dao;
	
	@Test
	public void testInsertStudent() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setTitle("임시 제목");
		vo.setContent("임시 내용");
		vo.setWriter("이진호테스트");
		dao.create(vo);
	}
}