package com.contactservice.controller;


import com.contactservice.entities.Contacts;
import com.contactservice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class contactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/user/{userId}")
    public List<Contacts> getContacts(@PathVariable("userId") Long userId){
        return contactService.getContactsOfUser(userId);
    }

}
