package com.ti.email.repository;

import com.ti.email.model.Email;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface EmailRepository extends Repository<Email,String> {
    List<Email> findAllBySendToEmailAddress(String emailAddress);
    Email getEmailBy_id(String emailId);
    List<Email> findAllBySentFromEmailAddress(String emailAddress);

    Email save(Email email);


    }