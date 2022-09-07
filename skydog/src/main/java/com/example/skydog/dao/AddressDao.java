package com.example.skydog.dao;

import com.example.skydog.module.entity.Address;

import java.util.*;


public interface AddressDao {

   void add(Address address);

   void delete(int addressId);

   List<Address> queryId(int addressId);

   void update(Address address);

   void batchAdd(List<Address> addressList);

   void batchDelete(List list);

   List<Address> pageQuery();

   List<Address> queryCondition();

}