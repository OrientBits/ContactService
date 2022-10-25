package com.contactservice.service;

import com.contactservice.entities.Contacts;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    // fake list of contacts..........

    List<Contacts> contactsList = List.of(
            new Contacts(1L, "amit@gmail.com","Amit",1311L),
            new Contacts(1L, "akash@gmail.com","Akash",1311L),
            new Contacts(1L, "amol@gmail.com","Amol",1314L),
            new Contacts(1L, "ankish@gmail.com","Ankush",1314L)
    );

    @Override
    public List<Contacts> getContactsOfUser(Long userId) {
        return contactsList.stream().filter(contacts -> contacts.getUserId().equals(userId)).collect(Collectors.toList());
    }

}
