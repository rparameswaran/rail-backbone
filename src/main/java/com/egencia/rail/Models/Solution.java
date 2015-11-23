package com.egencia.rail.Models;

import org.springframework.data.annotation.Id;

/**
 * Created by rnair on 11/20/15.
 */
public class Solution {

    @Id
    public String id;

    public String originStation;
    public String destinationStation;
    public String totalCost;
    public String trainNumber;

    public Solution() {

    }

    public Solution(String originStation, String destinationStation, String totalCost, String trainNumber) {
        this.originStation = originStation;
        this.destinationStation = destinationStation;
        this.totalCost = totalCost;
        this.trainNumber = trainNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOriginStation() {
        return originStation;
    }

    public void setOriginStation(String originStation) {
        this.originStation = originStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }
}
