package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.MenuVO;

public interface MenuDAO {
	public void insertMenu(MenuVO vo) throws Exception;//�μ�Ʈ
	public MenuVO readMenu(int mid) throws Exception;//����Ʈ
	public void updateMenu(MenuVO vo) throws Exception;//������Ʈ
	public void deleteMenu(int mid) throws Exception; //����
	public int listCount() throws Exception; //count
	public List<MenuVO> listAll() throws Exception; //�����ȸ
}
