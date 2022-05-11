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

public class BoardDAOupdateTest {
	@Inject
	private BoardDAO dao;	
	@Test
	public void testUpdateStudent() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setBno(1);
		vo.setTitle("��λ�Update");
		vo.setContent("������õUpdate");
		vo.setWriter("010Update");
		dao.update(vo);
	}
}
