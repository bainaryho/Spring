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


public class CustomerDAOinsertTest {
	@Inject
	private CustomerDAO dao;
	@Test
	public void testCustomerMember() throws Exception{
		CustomerVO vo = new CustomerVO();
		vo.setId("BOROO010007");
		vo.setName("�̱��");
		vo.setAddress("��õ");
		vo.setPhone("101");
		vo.setEmail("lkw");
		dao.insertCustomer(vo);
	}
}

