package com.example.transactions.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountid;
}
