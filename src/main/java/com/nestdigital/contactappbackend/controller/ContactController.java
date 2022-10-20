package com.nestdigital.contactappbackend.controller;

import com.nestdigital.contactappbackend.dao.ContactDao;
import com.nestdigital.contactappbackend.model.ContactModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addcontact",consumes = "application/json",produces = "application/json")
    private String addcontact(@RequestBody ContactModel contact){
        System.out.println(contact.toString());
        dao.save(contact);
        return "(status:'success')";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewcontacts")
    public List<ContactModel> viewcontact(){
        return (List<ContactModel>) dao.findAll();
    }
}
