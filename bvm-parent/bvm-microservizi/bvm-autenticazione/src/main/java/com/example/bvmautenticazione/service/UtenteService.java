package com.example.bvmautenticazione.service;

import com.example.bvmautenticazione.entity.T2Utenti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bvmautenticazione.repository.UtenteRepository;
import com.example.bvmautenticazione.util.UtenteUtil;

@Service
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;

    public boolean registraUtente(String email, String password){
        utenteRepository.save(UtenteUtil.mapToUtenteEntity(email,password));
        return true;
    }

    public T2Utenti loginUtente(String email, String password){
        T2Utenti utente =  utenteRepository.findByEmailUteAndPasswordUte(email, password);
        return utente;
    }
}
