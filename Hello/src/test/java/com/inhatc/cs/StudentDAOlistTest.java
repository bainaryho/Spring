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


public class StudentDAOlistTest {
	@Inject
	private StudentDAO dao;
	
	@Test
	public void listCountStudent() throws Exception{
		System.out.println(dao.listCount());
	}
	
	@Test
	public void listStudent() throws Exception{
		System.out.println(dao.listAll());
	}
}