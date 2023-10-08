package com.example.bvmautenticazione.util;

import com.example.bvmautenticazione.entity.T2Utenti;

import java.util.Date;

public class UtenteUtil {

    public static T2Utenti mapToUtenteEntity(String email, String password){
        T2Utenti utente = new T2Utenti();
        utente.setEmailUte(email);
        utente.setPasswordUte(password);
        utente.setDataOraUltMov(new Date());
        utente.setDesUltMov("Registrazione utente");

        return utente;
    }
}
