/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kuis1090.service;

import com.mycompany.kuis1090.entity.Aksesoris_1090;
import com.mycompany.kuis1090.repo.Aksesoris_1090Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC06
 */
@Service("aksesoris_1090Service")
@Transactional
public class Aksesoris_1090Service {
    @Autowired
    private Aksesoris_1090Repo repo;

    public Aksesoris_1090 insertOrUpdate(Aksesoris_1090 aksesoris_1090) {
        return repo.save(aksesoris_1090);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Aksesoris_1090> findAll() {
        return repo.findAllProduct();
    }

    public List<Aksesoris_1090> findByCategory(Long categoryId) {
        return repo.findByCategory(categoryId);
    }

    public List<Aksesoris_1090> findByName(String name) {
        return repo.findByName("%" + name + "%");
    }
}
