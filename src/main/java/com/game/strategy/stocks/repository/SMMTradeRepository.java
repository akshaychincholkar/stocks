package com.game.strategy.stocks.repository;

import com.game.strategy.stocks.model.SMMTrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SMMTradeRepository extends JpaRepository<SMMTrade,Long> {
}
