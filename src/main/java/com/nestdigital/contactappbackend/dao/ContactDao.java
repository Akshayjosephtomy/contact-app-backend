package com.nestdigital.contactappbackend.dao;

import com.nestdigital.contactappbackend.model.ContactModel;
import org.springframework.data.repository.CrudRepository;

public interface ContactDao extends CrudRepository<ContactModel,Integer> {
}
