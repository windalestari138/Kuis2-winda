/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kuis1090.controller;

import com.mycompany.kuis1090.entity.Mobil_1090;
import com.mycompany.kuis1090.service.Mobil_1090Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC06
 */
@RestController
@RequestMapping("/customer")
public class Mobil_1090Controller {
    @Autowired
    private Mobil_1090Service customerService;

    @RequestMapping(method = RequestMethod.POST)
    public Mobil_1090 insert(@RequestBody Mobil_1090 customer) {
        return customerService.insert(customer);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Mobil_1090 update(@RequestBody Mobil_1090 customer) {
        return customerService.update(customer);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return customerService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Mobil_1090 getById(@PathVariable("id") Long id){
        return customerService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Mobil_1090> getAll(){
        return customerService.getAll();
    }
}
