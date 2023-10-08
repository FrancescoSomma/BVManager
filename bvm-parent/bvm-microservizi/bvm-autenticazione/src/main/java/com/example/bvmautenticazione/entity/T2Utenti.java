package com.example.bvmautenticazione.entity;

import entity.BaseEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "t_2_utenti", schema = "bvmanager", catalog = "")
public class T2Utenti  extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_UTE")
    private Integer idUte;
    @ManyToOne
    @JoinColumn(name = "ID_RUOLO")
    private T1Ruoli idRuolo;
    @Basic
    @Column(name = "RATING")
    private BigDecimal rating;
    @Basic
    @Column(name = "EMAIL_UTE")
    private String emailUte;
    @Basic
    @Column(name = "PASSWORD_UTE")
    private String passwordUte;

    public T2Utenti() {
    }

    public Integer getIdUte() {
        return idUte;
    }

    public void setIdUte(Integer idUte) {
        this.idUte = idUte;
    }

    public T1Ruoli getIdRuolo() {
        return idRuolo;
    }

    public void setIdRuolo(T1Ruoli idRuolo) {
        this.idRuolo = idRuolo;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public String getEmailUte() {
        return emailUte;
    }

    public void setEmailUte(String emailUte) {
        this.emailUte = emailUte;
    }

    public String getPasswordUte() {
        return passwordUte;
    }

    public void setPasswordUte(String passwordUte) {
        this.passwordUte = passwordUte;
    }

}
