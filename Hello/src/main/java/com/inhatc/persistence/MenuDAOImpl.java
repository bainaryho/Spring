package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject ;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.MenuVO;
import com.inhatc.persistence.MenuDAO;

@Repository
public class MenuDAOImpl implements MenuDAO{

	@Inject
	private SqlSession sqlSession;
	private static final String namespace="com.inhatc.mapper.menuMapper";
	
	@Override
	public void insertMenu(MenuVO vo) throws Exception{
		sqlSession.insert(namespace+".insertMenu", vo);
	}
	
	@Override
	public MenuVO readMenu(int mid) throws Exception{
		return (MenuVO)sqlSession.selectOne(namespace+".selectMenu", mid);
	}
	
	@Override
	public void updateMenu(MenuVO vo) throws Exception {
		sqlSession.update(namespace+".update", vo);

	}
	@Override
	public void deleteMenu(int mid) throws Exception{
		sqlSession.delete(namespace+".delete",mid);
	}
	@Override
	public int listCount() {
		return sqlSession.selectOne(namespace+".listCount");
	}
	@Override
	public List<MenuVO> listAll() throws Exception{
		return sqlSession.selectList(namespace+".listAll");
	}

}
