package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.StudentVO;

public interface StudentDAO {
	public void insertStudent( StudentVO vo) throws Exception;//�μ�Ʈ
	public StudentVO readStudent(String id) throws Exception;//����Ʈ
	public void updateStudent(StudentVO vo) throws Exception;//������Ʈ
	public void deleteStudent(String id) throws Exception; //����
	public int listCount() throws Exception; //count
	public List<StudentVO> listAll() throws Exception; //�����ȸ
}
