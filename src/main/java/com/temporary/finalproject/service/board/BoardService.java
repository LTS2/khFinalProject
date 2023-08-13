package com.wj.thymleaftest.service;

import com.wj.thymleaftest.entity.Board;
import com.wj.thymleaftest.model.board.BoardDTO;

import java.util.List;

public interface BoardService {

	// 전체 조회
	public List<Board> findAll();

	// 단 건 조회
	public Board findOne(Long id);

	// 생성
	public Board save(BoardDTO dto);

	public String saveBoard(BoardDTO dto);

	// 수정
	public Board update(Long id, BoardDTO dto);

	// 삭제
	public Board delete(Long id);

}
