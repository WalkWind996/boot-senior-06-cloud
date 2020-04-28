package com.walkwind.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-4-28-15:48
 **/
@RestController
public class TicketController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buyTicket")
    public String getTicket(){
        //使用restTemplate远程调用PROVIDER-TICKET应用中的映射为ticket的方法
        String providerMsg = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return "consumer-user使用了-------"+providerMsg;
    }

}
