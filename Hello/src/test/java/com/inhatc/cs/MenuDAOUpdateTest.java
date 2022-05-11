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
public class MenuDAOUpdateTest {
	@Inject
	private MenuDAO dao;	
	@Test
	public void testUpdateMenu() throws Exception{
		MenuVO vo = new MenuVO();
		vo.setMid(1);
		vo.setMkinds("ÇÑ½ÄÇ»Àü");
		vo.setMname("·ÎÁ¦¶±ººÀÌ");
		vo.setMprice(10000);
		dao.updateMenu(vo);
	}
}
