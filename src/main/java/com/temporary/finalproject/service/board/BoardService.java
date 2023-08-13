package com.temporary.finalproject.service.board;

import com.temporary.finalproject.model.entity.board.BoardDTO;
import com.temporary.finalproject.model.entity.board.BoardEntity;

import java.util.List;

public interface BoardService {

	// 전체 조회
	public List<BoardEntity> findAll();

	// 단 건 조회
	public BoardEntity findOne(Long id);

	// 생성
	public BoardEntity save(BoardDTO dto);

	public String saveBoard(BoardDTO dto);

	// 수정
	public BoardEntity update(Long id, BoardDTO dto);

	// 삭제
	public BoardEntity delete(Long id);

}
