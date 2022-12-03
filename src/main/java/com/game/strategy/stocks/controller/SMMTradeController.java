package com.game.strategy.stocks.controller;

import com.game.strategy.stocks.exception.SMMTradeNotFound;
import com.game.strategy.stocks.model.SMMTrade;
import com.game.strategy.stocks.model.User;
import com.game.strategy.stocks.repository.SMMTradeRepository;
import com.game.strategy.stocks.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class SMMTradeController {
    @Autowired
    private SMMTradeRepository smmTradeRepository;

    @Autowired
    private UserRepository userRepository;

//    TODO : Add exception if user not present
    @PostMapping("/smm/{id}")
    SMMTrade newUser(@RequestBody SMMTrade newTrade,@PathVariable Long id) {
        User user = userRepository.findById(id).get();
        newTrade.setUser(user);
        return smmTradeRepository.save(newTrade);
    }

    @GetMapping("/smms")
    List<SMMTrade> getAllUsers() {
        return smmTradeRepository.findAll();
    }

    @GetMapping("/smm/{tradeId}")
    SMMTrade getUserById(@PathVariable Long tradeId) {
        return smmTradeRepository.findById(tradeId).orElseThrow(() -> new SMMTradeNotFound(tradeId));
    }

    @PutMapping("smm/{id}")
    SMMTrade updateSMMTrade(@RequestBody SMMTrade smmTrade,@PathVariable Long id){
        return  smmTradeRepository.findById(id).map(trade -> {
            trade.setTradeDate(smmTrade.getTradeDate());
            trade.setScript(smmTrade.getScript());
            trade.setClosePrice(smmTrade.getClosePrice());
            trade.setDoubleScreenDecision(smmTrade.getDoubleScreenDecision());
            trade.setCandleStickPattern(smmTrade.getCandleStickPattern());
            trade.setVolume(smmTrade.getVolume());
            trade.setEma(smmTrade.getEma());
            trade.setChartPattern(smmTrade.getChartPattern());
            trade.setFibRetracement(smmTrade.getFibRetracement());
            trade.setDivergence(smmTrade.isDivergence());
            trade.setImmediateSupport(smmTrade.getImmediateSupport());
            trade.setImmediateResistance(smmTrade.getImmediateResistance());
            trade.setMajorSupport(smmTrade.getMajorSupport());
            trade.setMajorResistance(smmTrade.getMajorResistance());
            trade.setStopLoss(smmTrade.getStopLoss());
            trade.setMinTargetPrice(smmTrade.getMinTargetPrice());
            trade.setMaxTargetPrice(smmTrade.getMaxTargetPrice());
            trade.setMinReward(smmTrade.getMinReward());
            trade.setMaxReward(smmTrade.getMaxReward());
            trade.setRisk(smmTrade.getRisk());
            trade.setMinRiskRewardRatio(smmTrade.getMinRiskRewardRatio());
            trade.setMaxRiskRewardRatio(smmTrade.getMaxRiskRewardRatio());
            trade.setTradeDecision(smmTrade.getTradeDecision());
            trade.setTotalCapital(smmTrade.getTotalCapital());
            trade.setTotalInvestment(smmTrade.getTotalInvestment());
            trade.setInvestmentPerTrade(smmTrade.getInvestmentPerTrade());
            trade.setMaxRiskAllowed(smmTrade.getMaxRiskAllowed());
            trade.setMaxNoOfSharesAllowed(smmTrade.getMaxNoOfSharesAllowed());
            trade.setNoOfShares(smmTrade.getNoOfShares());
            trade.setRiskInvolved(smmTrade.getRiskInvolved());
            trade.setMinProfitPotential(smmTrade.getMinProfitPotential());
            trade.setMaxProfitPotential(smmTrade.getMaxProfitPotential());
            trade.setMinROI(smmTrade.getMinROI());
            trade.setMaxROI(smmTrade.getMaxROI());
            trade.setMinTotalGain(smmTrade.getMinTotalGain());
            trade.setMaxTotalGain(smmTrade.getMaxTotalGain());
            trade.setWorstCaseAmount(smmTrade.getWorstCaseAmount());
            trade.setActualGain(smmTrade.getActualGain());
            trade.setResult(smmTrade.isResult());
            return smmTradeRepository.save(trade);
        }).orElseThrow(()->new SMMTradeNotFound(id));
    }

    @DeleteMapping("smm/{id}")
    String deleteSMMTrade(@PathVariable Long id){
        if(!smmTradeRepository.existsById(id)){
            throw new SMMTradeNotFound(id);
        }
        smmTradeRepository.deleteById(id);
        return  "SMM Trade with trade id "+id+" has been deleted successfully";
    }
}
