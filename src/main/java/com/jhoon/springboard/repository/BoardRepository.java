package com.jhoon.springboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jhoon.springboard.entity.Board;

public interface BoardRepository extends JpaRepository<Board, String> {

}
