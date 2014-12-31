/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flowyk.dao;

import com.flowyk.entity.CarOwner;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Lukas
 */
@Local
public interface CarOwnerFacadeLocal {

    void create(CarOwner carOwner);

    void edit(CarOwner carOwner);

    void remove(CarOwner carOwner);

    CarOwner find(Object id);

    List<CarOwner> findAll();

    List<CarOwner> findRange(int[] range);

    int count();
    
}
