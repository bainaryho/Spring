package com.inhatc.persistence;
import com.inhatc.domain.CustomerVO;
import java.util.List;

public interface CustomerDAO {
		public void insertCustomer( CustomerVO vo) throws Exception;//인설트
		public CustomerVO readCustomer(String id) throws Exception;//셀렉트
		public void updateCustomer(CustomerVO vo) throws Exception;//업데이트
		public void deleteCustomer(String id) throws Exception; //삭제
		public int listCount() throws Exception; //count
		public List<CustomerVO> listAll() throws Exception; //목록조회
}
