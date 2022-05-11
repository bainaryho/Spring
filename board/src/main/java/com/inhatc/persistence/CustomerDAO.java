package com.inhatc.persistence;
import com.inhatc.domain.CustomerVO;
import java.util.List;

public interface CustomerDAO {
		public void insertCustomer( CustomerVO vo) throws Exception;//�μ�Ʈ
		public CustomerVO readCustomer(String id) throws Exception;//����Ʈ
		public void updateCustomer(CustomerVO vo) throws Exception;//������Ʈ
		public void deleteCustomer(String id) throws Exception; //����
		public int listCount() throws Exception; //count
		public List<CustomerVO> listAll() throws Exception; //�����ȸ
}
