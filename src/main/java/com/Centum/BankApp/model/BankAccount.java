package com.Centum.BankApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bankAccount")
public class BankAccount {
    @Id
    @Column(name = "bank_id")
    public int bankid;
    public String bankname;
    public String bankaddress;
    public String bankifsccode;
    public String bankbranch;
    public String banknumber;
    public int customerId;
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name ="fk_add_customerid")
    private Customer Customer;
}
