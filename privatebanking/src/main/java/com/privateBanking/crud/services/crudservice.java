package com.privateBanking.crud.services;

import com.privateBanking.crud.entity.BankingEntity;
import com.privateBanking.crud.repository.BankingRep;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class crudservice {
    @Autowired
    private BankingRep bankingEntityRep;
    public List<BankingEntity> getAllBankingEntities(){
        return bankingEntityRep.findAll();
    }
    public Optional<BankingEntity> getBankingEntityById(long id){
        return bankingEntityRep.findById(id);
    }
    public BankingEntity createBankingEntity(BankingEntity bankingEntity){
        return bankingEntityRep.save(bankingEntity);
    }

    public BankingEntity updateBankingEntity(long id, BankingEntity updatedbankingEntity){
        Optional<BankingEntity> existingbankingEntityOptional = bankingEntityRep.findById(id);
        if(existingbankingEntityOptional.isPresent()){
            BankingEntity existingbankingEntity = existingbankingEntityOptional.get();
            existingbankingEntity.setId(updatedbankingEntity.getId());
            existingbankingEntity.setDeposit(updatedbankingEntity.getDeposit());
            existingbankingEntity.setNetworth(updatedbankingEntity.getNetworth());
            existingbankingEntity.setDescription(existingbankingEntity.getDescription());
        }
        return null;
    }
    public void deleteBankingEntity(long id){bankingEntityRep.deleteById(id);}
}
