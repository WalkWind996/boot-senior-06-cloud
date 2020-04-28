package com.walkwind.ticket.service;

import org.springframework.stereotype.Service;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-4-28-15:10
 **/
@Service
public class TicketServiceImp implements TicketService{
    @Override
    public String getTicket() {
        return "spring cloud test -------------provider-ticket";
    }
}
