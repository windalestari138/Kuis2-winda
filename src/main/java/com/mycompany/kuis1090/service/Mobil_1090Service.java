/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kuis1090.service;

import com.mycompany.kuis1090.entity.Mobil_1090;
import com.mycompany.kuis1090.repo.Mobil_1090Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC06
 */
@Service("mobil_1090Service")
@Transactional
public class Mobil_1090Service {
    @Autowired
    private Mobil_1090Repo repo;

    public Mobil_1090 insert(Mobil_1090 mobil_1090) {
        return repo.save(mobil_1090);
    }
    
    public Mobil_1090 update(Mobil_1090 mobil_1090) {
        return repo.save(mobil_1090);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Mobil_1090 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Mobil_1090> getAll(){
        return repo.findAllCategory();
    }
}
