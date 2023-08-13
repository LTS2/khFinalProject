package com.wj.thymleaftest.controller;

import com.wj.thymleaftest.entity.Board;
import com.wj.thymleaftest.model.board.BoardDTO;
import com.wj.thymleaftest.service.BoardServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
public class BoardController {
	@Autowired
	BoardServiceImpl boardServiceImpl;

	@GetMapping("board")
	public String board(Model model){
		log.info("BoardController.board() execute");

		List<Board> list = boardServiceImpl.findAll();
		model.addAttribute("board", list);
		return "board/board";
	}

	@GetMapping("board/write")
	public String boardWrite(Model model){
		log.info("BoardController.boardWrite() execute");


		return "board/board_write";
	}

	// 글쓰기 저장 눌렀을 경우 데이터 저장.
	@PostMapping("board/write/save")
	public String boardSave(@ModelAttribute BoardDTO dto, @RequestHeader("Content-Type") String contentType){

		if(dto.getTitle().equals(null) || dto.getTitle().equals("")){
			return "redirect:failed";
		}
		log.info("dto.getTitle() 의 값 : {} ", dto.getTitle());
		log.error("Content-Type : {}", contentType);
		log.info("dto 의 값 : '{}'", dto );
		return boardServiceImpl.saveBoard(dto); // 위의 메서드들을 boardService 안에 집어넣음.
	}

	@GetMapping("/board_view/{id}")
		public String viewBoard(@PathVariable("id") Long boardId, Model model){
			Board board = boardServiceImpl.findOne(boardId);
			log.info(board.toString());
			model.addAttribute("board", board);

			return "board/board_view";
		}



/*
* todo
*  1. 글 삭제 기능.
*  2. 파일 업로드 기능.
*
*
* */





	}

