package com.game.strategy.stocks.exception;

public class SMMTradeNotFound extends RuntimeException{
    public SMMTradeNotFound(Long id){
        super("Not able to find SMM Trade");
    }
}
