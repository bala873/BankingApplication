package com.demo.banking_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.banking_app.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
