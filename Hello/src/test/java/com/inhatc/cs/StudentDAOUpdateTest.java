package com.inhatc.cs;
import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.StudentVO;
import com.inhatc.persistence.StudentDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class StudentDAOUpdateTest {
	@Inject
	private StudentDAO dao;	
	@Test
	public void testUpdateStudent() throws Exception{
		StudentVO vo = new StudentVO();
		vo.setId("201844092");
		vo.setName("이진호2");
		vo.setAdress("용현동 69");
		vo.setPhone("010Update2");
		vo.setEmail("Update2@naver.com");
		dao.updateStudent(vo);
	}
}
