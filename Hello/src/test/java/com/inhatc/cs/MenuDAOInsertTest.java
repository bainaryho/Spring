package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.MenuVO;
import com.inhatc.persistence.MenuDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})


public class MenuDAOInsertTest {
	@Inject
	private MenuDAO dao;
	@Test
	public void testMenuInsert() throws Exception{
		MenuVO vo = new MenuVO();
		vo.setMid(4);
		vo.setMkinds("�Ͻ�");
		vo.setMname("����");
		vo.setMprice(12000);
		dao.insertMenu(vo);
	}
}

