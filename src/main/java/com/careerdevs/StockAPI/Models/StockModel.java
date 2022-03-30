package com.careerdevs.StockAPI.Models;

public class StockModel {

    @JsonProperty ("Description")
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
