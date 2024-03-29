package com.inhatc.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO dao;
	
	@Override
	public void regist(BoardVO board) throws Exception{
		dao.create(board);
	}
	public BoardVO read(Integer bno) throws Exception{
		return dao.read(bno);
	}
	public void modify(BoardVO board)throws Exception{
		dao.update(board);
	}
	public void remove(Integer bno) throws Exception{
		dao.delete(bno);
	}
	public List<BoardVO> listAll() throws Exception{
		return dao.listAll();
	}
}
