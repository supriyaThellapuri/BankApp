package com.Centum.BankApp.repository;

import com.Centum.BankApp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customerrepository extends JpaRepository<Customer, Integer> {
}
