package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.MenuVO;

public interface MenuDAO {
	public void insertMenu(MenuVO vo) throws Exception;//인설트
	public MenuVO readMenu(int mid) throws Exception;//셀렉트
	public void updateMenu(MenuVO vo) throws Exception;//업데이트
	public void deleteMenu(int mid) throws Exception; //삭제
	public int listCount() throws Exception; //count
	public List<MenuVO> listAll() throws Exception; //목록조회
}
