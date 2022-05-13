package com.careerdevs.StockAPI.Models;


import com.fasterxml.jackson.annotation.JsonProperty;

public class StockModel {

    @JsonProperty("Description")
    private String description;

    @JsonProperty ("Exchange")
    private String exchange;

    @JsonProperty ("Sector")
    private String sector;

    @JsonProperty ("Address")
    private String address;

    @JsonProperty ("MarketCapitalization")
    private long marketCap;

}
