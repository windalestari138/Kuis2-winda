/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kuis1090.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author PC06
 */
@Entity
@Table(name = "mobil_1090")
public class Mobil_1090 implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mobil;
    @Column(length = 100, nullable = false)
    private String name;
    @Column(length = 255, nullable = false)
    private String merk;
    @Column(length = 255, nullable = false)
    private String tahun;
    @Column(length = 255, nullable = false)
    private String description;
    @OneToMany
    @JoinColumn(name="id_mobil")
    private Set<Aksesoris_1090> aksesoris_1090;

    public Long getId_mobil() {
        return id_mobil;
    }

    public void setId_mobil(Long id_mobil) {
        this.id_mobil = id_mobil;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public String getMerk() {
        return merk;
    }

    /**
     * @param merk the name to set
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public String getTahun() {
        return tahun;
    }

    /**
     * @param tahun the name to set
     */
    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the name
     */
}
