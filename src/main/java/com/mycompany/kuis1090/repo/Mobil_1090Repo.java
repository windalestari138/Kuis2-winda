/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kuis1090.repo;

import com.mycompany.kuis1090.entity.Mobil_1090;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC06
 */
public interface Mobil_1090Repo extends CrudRepository<Mobil_1090, Long>{
    @Query("select c from Mobil_1090 c")
    public List<Mobil_1090> findAllCategory();
}
