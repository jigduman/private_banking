package com.privateBanking.crud.controller;

import com.privateBanking.crud.entity.BankingEntity;
import com.privateBanking.crud.services.crudservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/BankingEntites")
public class BankingController {

    @Autowired
    private crudservice  crudservice;

    @GetMapping
    public ResponseEntity<List<BankingEntity>> getAllBankingEntities() {
        List<BankingEntity> BankingEntities = crudservice.getAllBankingEntities();
        return new ResponseEntity<>(BankingEntities, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<BankingEntity> getBankingEntityById(@PathVariable Long id) {
        Optional<BankingEntity> BankingEntity = crudservice.getBankingEntityById(id);
        return BankingEntity.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping
    public ResponseEntity<BankingEntity> createBankingEntity(@RequestBody BankingEntity BankingEntity) {
        BankingEntity createdBankingEntity = crudservice.createBankingEntity(BankingEntity);
        return new ResponseEntity<>(createdBankingEntity, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BankingEntity> updateBankingEntity(@PathVariable Long id, @RequestBody BankingEntity updatedBankingEntity) {
        BankingEntity BankingEntity = crudservice.updateBankingEntity(id, updatedBankingEntity);
        return BankingEntity != null ? new ResponseEntity<>(BankingEntity, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBankingEntity(@PathVariable Long id) {
        crudservice.deleteBankingEntity(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
