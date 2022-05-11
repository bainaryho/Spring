package com.inhatc.cs;
import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.CustomerVO;
import com.inhatc.persistence.CustomerDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class CustomerDAOListTest {
	@Inject
	private CustomerDAO dao;
	@Test
	public void listCountCustomer() throws Exception{
		System.out.println(dao.listCount());
	}
	@Test
	public void listCustomer() throws Exception{
		System.out.println(dao.listAll());
	}
}