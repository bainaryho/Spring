package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject ;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.CustomerVO;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@Inject
	private SqlSession sqlSession;
	private static final String namespace="com.inhatc.mapper.customerMapper";
	
	@Override
	public void insertCustomer(CustomerVO vo) throws Exception{
		sqlSession.insert(namespace+".insertCustomer", vo);
	}
	
	@Override
	public CustomerVO readCustomer(String id) throws Exception{
		return (CustomerVO)sqlSession.selectOne(namespace+".selectCustomer", id);
	}
	
	@Override
	public void updateCustomer(CustomerVO vo) throws Exception {
		sqlSession.update(namespace+".update", vo);

	}
	@Override
	public void deleteCustomer(String id) throws Exception{
		sqlSession.delete(namespace+".delete",id);
	}
	@Override
	public int listCount() {
		return sqlSession.selectOne(namespace+".listCount");
	}
	@Override
	public List<CustomerVO> listAll() throws Exception{
		return sqlSession.selectList(namespace+".listAll");
	}

}
