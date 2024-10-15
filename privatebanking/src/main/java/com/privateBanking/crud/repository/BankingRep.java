package com.privateBanking.crud.repository;

import com.privateBanking.crud.entity.BankingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankingRep extends JpaRepository<BankingEntity, Long> {
}
