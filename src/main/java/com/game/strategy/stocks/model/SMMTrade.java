package com.game.strategy.stocks.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class SMMTrade {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tradeId;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id",referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    @JsonIgnore
    private User user;
    private Date tradeDate;
    private String script;
    private double closePrice;
    private String doubleScreenDecision;
    private String candleStickPattern;
    private String volume;
    private String ema;
    private String chartPattern;
    private String fibRetracement;
    private boolean divergence;
    private double immediateSupport;
    private double immediateResistance;
    private double majorSupport;
    private double majorResistance;
    private double stopLoss;
    //price equals to immediate support/Resistance
    private double minTargetPrice;
    private double maxTargetPrice;
    private double minReward;
    private double maxReward;
    private double risk;
    private double minRiskRewardRatio;
    private double maxRiskRewardRatio;
    //Buy,Strong Buy, Sell, Strong Sell
    private String tradeDecision;
    //Funds related attributes
    private double totalCapital;

    private double investmentPerTrade;

    private double maxRiskAllowed;

    private double maxNoOfSharesAllowed;

    private double totalInvestment;
    private int noOfShares;
    private double riskInvolved;
    private double minProfitPotential;
    private double maxProfitPotential;
    private double minROI;
    private double maxROI;
    private double minTotalGain;
    private double maxTotalGain;
    private double worstCaseAmount;
    private double actualGain;
    //successful or failed
    private String result;

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(double closePrice) {
        this.closePrice = closePrice;
    }

    public String getDoubleScreenDecision() {
        return doubleScreenDecision;
    }

    public void setDoubleScreenDecision(String doubleScreenDecision) {
        this.doubleScreenDecision = doubleScreenDecision;
    }

    public String getCandleStickPattern() {
        return candleStickPattern;
    }

    public void setCandleStickPattern(String candleStickPattern) {
        this.candleStickPattern = candleStickPattern;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getEma() {
        return ema;
    }

    public void setEma(String ema) {
        this.ema = ema;
    }

    public String getChartPattern() {
        return chartPattern;
    }

    public void setChartPattern(String chartPattern) {
        this.chartPattern = chartPattern;
    }

    public String getFibRetracement() {
        return fibRetracement;
    }

    public void setFibRetracement(String fibRetracement) {
        this.fibRetracement = fibRetracement;
    }

    public boolean isDivergence() {
        return divergence;
    }

    public void setDivergence(boolean divergence) {
        this.divergence = divergence;
    }

    public double getImmediateSupport() {
        return immediateSupport;
    }

    public void setImmediateSupport(double immediateSupport) {
        this.immediateSupport = immediateSupport;
    }

    public double getImmediateResistance() {
        return immediateResistance;
    }

    public void setImmediateResistance(double immediateResistance) {
        this.immediateResistance = immediateResistance;
    }

    public double getMajorSupport() {
        return majorSupport;
    }

    public void setMajorSupport(double majorSupport) {
        this.majorSupport = majorSupport;
    }

    public double getMajorResistance() {
        return majorResistance;
    }

    public void setMajorResistance(double majorResistance) {
        this.majorResistance = majorResistance;
    }

    public double getStopLoss() {
        return stopLoss;
    }

    public void setStopLoss(double stopLoss) {
        this.stopLoss = stopLoss;
    }

    public double getMinTargetPrice() {
        return minTargetPrice;
    }

    public void setMinTargetPrice(double minTargetPrice) {
        this.minTargetPrice = minTargetPrice;
    }

    public double getMaxTargetPrice() {
        return maxTargetPrice;
    }

    public void setMaxTargetPrice(double maxTargetPrice) {
        this.maxTargetPrice = maxTargetPrice;
    }

    public double getMinReward() {
        return minReward;
    }

    public void setMinReward(double minReward) {
        this.minReward = minReward;
    }

    public double getMaxReward() {
        return maxReward;
    }

    public void setMaxReward(double maxReward) {
        this.maxReward = maxReward;
    }

    public double getRisk() {
        return risk;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    public double getMinRiskRewardRatio() {
        return minRiskRewardRatio;
    }

    public void setMinRiskRewardRatio(double minRiskRewardRatio) {
        this.minRiskRewardRatio = minRiskRewardRatio;
    }

    public double getMaxRiskRewardRatio() {
        return maxRiskRewardRatio;
    }

    public void setMaxRiskRewardRatio(double maxRiskRewardRatio) {
        this.maxRiskRewardRatio = maxRiskRewardRatio;
    }

    public String getTradeDecision() {
        return tradeDecision;
    }

    public void setTradeDecision(String tradeDecision) {
        this.tradeDecision = tradeDecision;
    }

    public double getTotalInvestment() {
        return totalInvestment;
    }

    public void setTotalInvestment(double totalInvestment) {
        this.totalInvestment = totalInvestment;
    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public double getRiskInvolved() {
        return riskInvolved;
    }

    public void setRiskInvolved(double riskInvolved) {
        this.riskInvolved = riskInvolved;
    }

    public double getMinProfitPotential() {
        return minProfitPotential;
    }

    public void setMinProfitPotential(double minProfitPotential) {
        this.minProfitPotential = minProfitPotential;
    }

    public double getMaxProfitPotential() {
        return maxProfitPotential;
    }

    public void setMaxProfitPotential(double maxProfitPotential) {
        this.maxProfitPotential = maxProfitPotential;
    }

    public double getMinROI() {
        return minROI;
    }

    public void setMinROI(double minROI) {
        this.minROI = minROI;
    }

    public double getMaxROI() {
        return maxROI;
    }

    public void setMaxROI(double maxROI) {
        this.maxROI = maxROI;
    }

    public double getMinTotalGain() {
        return minTotalGain;
    }

    public void setMinTotalGain(double minTotalGain) {
        this.minTotalGain = minTotalGain;
    }

    public double getMaxTotalGain() {
        return maxTotalGain;
    }

    public void setMaxTotalGain(double maxTotalGain) {
        this.maxTotalGain = maxTotalGain;
    }

    public double getWorstCaseAmount() {
        return worstCaseAmount;
    }

    public void setWorstCaseAmount(double worstCaseAmount) {
        this.worstCaseAmount = worstCaseAmount;
    }

    public double getActualGain() {
        return actualGain;
    }

    public void setActualGain(double actualGain) {
        this.actualGain = actualGain;
    }

    public String isResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public double getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(double totalCapital) {
        this.totalCapital = totalCapital;
    }

    public double getInvestmentPerTrade() {
        return investmentPerTrade;
    }

    public void setInvestmentPerTrade(double investmentPerTrade) {
        this.investmentPerTrade = investmentPerTrade;
    }

    public double getMaxRiskAllowed() {
        return maxRiskAllowed;
    }

    public void setMaxRiskAllowed(double maxRiskAllowed) {
        this.maxRiskAllowed = maxRiskAllowed;
    }

    public double getMaxNoOfSharesAllowed() {
        return maxNoOfSharesAllowed;
    }

    public void setMaxNoOfSharesAllowed(double maxNoOfSharesAllowed) {
        this.maxNoOfSharesAllowed = maxNoOfSharesAllowed;
    }
}
