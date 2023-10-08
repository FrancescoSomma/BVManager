package com.example.bvmautenticazione.repository;

import com.example.bvmautenticazione.entity.T2Utenti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<T2Utenti, Integer> {
    T2Utenti findByEmailUteAndPasswordUte(String email, String password);
}
