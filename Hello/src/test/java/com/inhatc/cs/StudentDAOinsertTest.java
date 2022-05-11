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


public class StudentDAOinsertTest {
	@Inject
	private StudentDAO dao;
	@Test
	public void testStudentMember() throws Exception{
		StudentVO vo = new StudentVO();
		vo.setId("202200000");
		vo.setName("보루에서학생테스트");
		vo.setAdress("용현동");
		vo.setPhone("010ㅁㅁㅁㅁ9507");
		vo.setEmail("20@inhatc.ac.kr");
		dao.insertStudent(vo);
	}
}
