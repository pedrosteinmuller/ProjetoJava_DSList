package com.pedrostein.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrostein.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
