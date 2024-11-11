package com.pedrostein.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrostein.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
