/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kuis1090.entity;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author PC06
 */
@Entity
@Table(name = "aksesoris_1090")
public class Aksesoris_1090 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mobil;
    @Column(length = 255, nullable = false)
    private Long id_aksesoris;
    private String name;
    private String merk;
    private double price;
    private String description;
    

    /**
     * @return the id
     */
    public Long getId_mobil() {
        return id_mobil;
    }

    public void setId_mobil(Long id_mobil) {
        this.id_mobil = id_mobil;
    }
    
    public Long getId_aksesoris() {
        return id_aksesoris;
    }

    public void setId_aksesoris(Long id_aksesoris) {
        this.id_aksesoris = id_aksesoris;
    }

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

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
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
     * @return the category
     */
    /*public Aksesoris_1090 getAksesoris_1090() {
        return aksesoris_1090;
    }
    
     */
    /*public void setCategory(Aksesoris_1090 aksesoris_1090) {
       this.aksesoris_1090 = aksesoris_1090;
    }*/
}
