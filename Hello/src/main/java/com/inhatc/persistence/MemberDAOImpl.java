package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject ;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.inhatc.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Inject
	private SqlSession sqlSession;
	private static final String namespace="com.inhatc.mapper.MemberMapper";
	
	@Override 
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}
	
	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember", vo);
	}
	
	@Override
	public MemberVO readMember(String userid) {
		return (MemberVO)sqlSession.selectOne(namespace+".selectMember", userid);
	}
	
	@Override
	public MemberVO readMember2(String userid, String userpw) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		return (MemberVO)sqlSession.selectOne(namespace+".selectMember2", paramMap);
	}
	@Override
	public void updateMember(MemberVO vo) {
		sqlSession.update(namespace+".update", vo);

	}
	@Override
	public void delete(String userid) {
		sqlSession.delete(namespace+".delete",userid);
	}
	@Override
	public int listCount() {
		return sqlSession.selectOne(namespace+".listCount");
	}
	@Override
	public List<MemberVO> listAll() throws Exception{
		return sqlSession.selectList(namespace+".listAll");
	}
}
