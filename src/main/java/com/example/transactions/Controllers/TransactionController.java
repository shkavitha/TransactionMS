package com.example.transactions.Controllers;

import com.example.transactions.Model.Transaction;
import com.example.transactions.Services.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    @GetMapping("/transactions")
    public String getTransactions() {
        return "THis is transactions service";
    }

//    @GetMapping("/transaction")
//    public ResponseEntity<List<Transaction>> getAllTransactions() {
//        return ResponseEntity.ok(TransactionService.getAllTransactions());
//    }
}

