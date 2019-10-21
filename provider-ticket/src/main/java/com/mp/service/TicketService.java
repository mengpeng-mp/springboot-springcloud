package com.mp.service;

import org.springframework.stereotype.Service;

@Service
public class TicketService {
    public String hello(){
        System.out.println("=========>8001");
        return "厉害了，我的国！";
    }
}
