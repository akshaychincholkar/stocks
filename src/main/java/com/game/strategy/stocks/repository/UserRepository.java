package com.game.strategy.stocks.repository;

import com.game.strategy.stocks.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
