package kr.ac.kopo.kopo27.dao;

import java.util.List;

import kr.ac.kopo.kopo27.domain.BoardItem;

public interface BoardItemDao {

	void create(BoardItem board);

	BoardItem selectOne(int id);

	List<BoardItem> selectAll();

	void update(BoardItem board);

	void delete(BoardItem board);
}
