package com.careerdevs.StockAPI.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/stocks")


public class StockController {


    private static String myAlphaKey = "MP98OB332PYVADQX";
    private static String stockInfoEndpoint = "https://www.alphavantage.co/query?function=OVERVIEW&symbol=IBM&apikey="+ myAlphaKey  ;

    @GetMapping("/overview")
    public static Object getStockHandler (RestTemplate restTemplate) {
        return restTemplate.getForObject(stockInfoEndpoint, Object.class);
    }

    public static String getStockInfoEndpoint() {
        return  stockInfoEndpoint;
    }

    @GetMapping("/global")
    private static String stockGlobalQuote =  " https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=IBM&apikey=" + myAlphaKey;
    public static Object getStockGlobalQuote (RestTemplate restTemplate){
        return restTemplate.getForObject(stockGlobalQuote,Object.class);

    }
}


