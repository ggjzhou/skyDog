package com.example.skydog.service;

import com.example.skydog.module.entity.Address;
import com.example.skydog.module.vo.ResultVO;

import java.util.*;


public interface AddressService {

    void add(Address address);

    void delete(Integer addressId);

    Address queryId(Integer addressId);

    void update(Address address);


    void batchDelete(List list);

    List<Address> queryCondition();

}