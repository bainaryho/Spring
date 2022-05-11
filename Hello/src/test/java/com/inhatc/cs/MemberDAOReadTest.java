package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.MemberVO;
import com.inhatc.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})


public class MemberDAOReadTest {
	@Inject
	private MemberDAO dao;
	
	@Test
	public void readMember() throws Exception{
		System.out.println(dao.readMember("user0"));
	}
	/*
	@Test
	public void readMember2() throws Exception{
		System.out.println(dao.readMember2("user0","0000"));
	}*/
}
