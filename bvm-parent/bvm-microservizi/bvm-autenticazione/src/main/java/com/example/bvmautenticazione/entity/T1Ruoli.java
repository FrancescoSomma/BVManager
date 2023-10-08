package com.example.bvmautenticazione.entity;

import entity.BaseEntity;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "t_1_ruoli", schema = "bvmanager", catalog = "")
public class T1Ruoli extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_RUOLO")
    private String idRuolo;
    @Basic
    @Column(name = "DES_RUOLO")
    private String desRuolo;

    public String getIdRuolo() {
        return idRuolo;
    }

    public void setIdRuolo(String idRuolo) {
        this.idRuolo = idRuolo;
    }

    public String getDesRuolo() {
        return desRuolo;
    }

    public void setDesRuolo(String desRuolo) {
        this.desRuolo = desRuolo;
    }

}
