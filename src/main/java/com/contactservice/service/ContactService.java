package com.contactservice.service;

import com.contactservice.entities.Contacts;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ContactService {

    public List<Contacts> getContactsOfUser(Long userId);
}
