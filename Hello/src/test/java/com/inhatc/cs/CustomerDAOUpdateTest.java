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

public class CustomerDAOUpdateTest {
	@Inject
	private CustomerDAO dao;	
	@Test
	public void testUpdateStudent() throws Exception{
		CustomerVO vo = new CustomerVO();
		vo.setId("Boroo010005");
		vo.setName("백두산Update");
		vo.setAddress("마계인천Update");
		vo.setPhone("010Update");
		vo.setEmail("Update!");
		dao.updateCustomer(vo);
	}
}
