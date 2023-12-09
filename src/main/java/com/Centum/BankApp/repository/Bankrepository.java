package com.Centum.BankApp.repository;

import com.Centum.BankApp.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Bankrepository extends JpaRepository<BankAccount, Integer> {

}
