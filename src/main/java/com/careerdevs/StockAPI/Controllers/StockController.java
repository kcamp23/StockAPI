package com.careerdevs.StockAPI.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/stocks")


public class StockController {


    private static String myAlphaKey = "demo";
    private static String stockInfoEndpoint = "https://www.alphavantage.co/query?function=OVERVIEW&symbol=IBM&apikey=demo + myAlphaKey " ;

    @GetMapping("/overview")



    public static Object getStockHandler (RestTemplate restTemplate) {
        return restTemplate.getForObject(stockInfoEndpoint, Object.class);
    }

    public static String getStockInfoEndpoint() {
        return  stockInfoEndpoint;
    }

}


