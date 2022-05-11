package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.StudentVO;

public interface StudentDAO {
	public void insertStudent( StudentVO vo) throws Exception;//인설트
	public StudentVO readStudent(String id) throws Exception;//셀렉트
	public void updateStudent(StudentVO vo) throws Exception;//업데이트
	public void deleteStudent(String id) throws Exception; //삭제
	public int listCount() throws Exception; //count
	public List<StudentVO> listAll() throws Exception; //목록조회
}
