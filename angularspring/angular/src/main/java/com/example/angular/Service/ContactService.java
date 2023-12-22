package com.example.angular.Service;
import java.util.List;
 
import org.springframework.stereotype.Service;

import com.example.angular.Entity.Contact;
 
 
@Service
 
public interface ContactService {
 
    List<Contact> getAllContacts();
 
    Contact createContact(Contact contact);
 
    Contact getContactById(long id);
 
    Contact updateContact(int id, Contact updatedContact);
 
    void deleteContact(int id);
}