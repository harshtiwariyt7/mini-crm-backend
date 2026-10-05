package com.minicrm.Mini_crm.service;

import com.minicrm.Mini_crm.entity.Contact;
import com.minicrm.Mini_crm.repository.ContactRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Contact getContactById(Integer id) {
        return contactRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Contact not found with id: " + id));
    }

    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }
}