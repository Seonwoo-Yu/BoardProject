package kr.ac.kopo.kopo27.service;

import java.util.List;

import kr.ac.kopo.kopo27.dao.BoardDao;
import kr.ac.kopo.kopo27.dao.BoardDaoImpl;
import kr.ac.kopo.kopo27.domain.Board;

public class BoardServiceImpl implements BoardService {

	private BoardDao boardDao = new BoardDaoImpl();

	@Override
	public void create(Board board) {

	}

	@Override
	public Board selectOne(int id) {
		// TODO Auto-generated method stub
		return boardDao.selectOne(id);
	}

	@Override
	public List<Board> selectAll() {
		return null;
	}

	@Override
	public void update(Board board) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Board board) {
		// TODO Auto-generated method stub

	}

}
