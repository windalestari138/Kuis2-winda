/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kuis1090.repo;

import com.mycompany.kuis1090.entity.Aksesoris_1090;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author PC06
 */
public interface Aksesoris_1090Repo extends CrudRepository<Aksesoris_1090, Long>{
    @Query("select p from Aksesoris_1090 p")
    public List<Aksesoris_1090> findAllProduct();
    
    @Query("select p from Aksesoris_1090 p where p.mobil_1090.id= :id")
    public List<Aksesoris_1090> findByCategory(@Param("id") Long id);
    
    @Query("select p from Aksesoris_1090 p where LOWER(p.name) LIKE LOWER(:name)")
    public List<Aksesoris_1090> findByName(@Param("name") String name);
}
