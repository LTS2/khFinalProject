package com.temporary.finalproject.model.repository;

import com.temporary.finalproject.model.entity.board.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
