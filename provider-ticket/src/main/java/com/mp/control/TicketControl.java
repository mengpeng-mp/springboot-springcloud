package com.mp.control;

import com.mp.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketControl {
    @Autowired
    TicketService ticketService;
    @GetMapping("/test")
    public String test(){
        return ticketService.hello();
    }
}
