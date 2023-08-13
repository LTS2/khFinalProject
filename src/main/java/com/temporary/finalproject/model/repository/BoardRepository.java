package com.wj.thymleaftest.repository;

import com.wj.thymleaftest.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
