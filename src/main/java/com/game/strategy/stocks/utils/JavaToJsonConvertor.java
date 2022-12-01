package com.game.strategy.stocks.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.game.strategy.stocks.model.SMMTrade;
import com.game.strategy.stocks.model.User;

import java.io.IOException;

public class JavaToJsonConvertor {
    public static void main(String[] args) {
        SMMTrade smmTrade = new SMMTrade();
        smmTrade = getObjectData(smmTrade);
        ObjectMapper Obj = new ObjectMapper();
        try {
            // Converting the Java object into a JSON string
            String jsonStr = Obj.writeValueAsString(smmTrade);
            // Displaying Java object into a JSON string
            System.out.println(jsonStr);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SMMTrade getObjectData(SMMTrade user){
        return user;
    }
}
