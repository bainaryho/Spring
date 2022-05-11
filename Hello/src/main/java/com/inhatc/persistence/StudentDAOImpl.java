package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject ;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.MemberVO;
import com.inhatc.domain.StudentVO;

@Repository
public class StudentDAOImpl implements StudentDAO{

	@Inject
	private SqlSession sqlSession;
	private static final String namespace="com.inhatc.mapper.studentMapper";
	
	@Override
	public void insertStudent(StudentVO vo) throws Exception{
		sqlSession.insert(namespace+".insertStudent", vo);
	}
	
	@Override
	public StudentVO readStudent(String id) throws Exception{
		return (StudentVO)sqlSession.selectOne(namespace+".selectStudent", id);
	}
	
	@Override
	public void updateStudent(StudentVO vo) throws Exception {
		sqlSession.update(namespace+".update", vo);

	}
	@Override
	public void deleteStudent(String id) throws Exception{
		sqlSession.delete(namespace+".delete",id);
	}
	@Override
	public int listCount() {
		return sqlSession.selectOne(namespace+".listCount");
	}
	@Override
	public List<StudentVO> listAll() throws Exception{
		return sqlSession.selectList(namespace+".listAll");
	}

}
