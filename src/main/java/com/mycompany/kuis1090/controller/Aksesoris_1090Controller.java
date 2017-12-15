/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kuis1090.controller;

import com.mycompany.kuis1090.entity.Aksesoris_1090;
import com.mycompany.kuis1090.service.Aksesoris_1090Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC06
 */
@RestController
@RequestMapping("/aksesoris_1090")
public class Aksesoris_1090Controller {
    
    @Autowired
    private Aksesoris_1090Service aksesoris_1090Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public Aksesoris_1090 insertOrUpdate(@RequestBody Aksesoris_1090 aksesoris_1090){
        return aksesoris_1090Service.insertOrUpdate(aksesoris_1090);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Aksesoris_1090> findAll(){
        return aksesoris_1090Service.findAll();
    }
  
}