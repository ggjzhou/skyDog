package com.example.skydog.dao;

import com.example.skydog.module.entity.Address;
import com.example.skydog.module.vo.ResultVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface AddressDao {

   ResultVO add(Address address);

   ResultVO delete(Integer addressId);

   Address queryId(Integer addressId);

   ResultVO update(Address address);

   void batchAdd(List<Address> addressList);

   void batchDelete(List list);

   List<Address> pageQuery();

   List<Address> queryCondition();

}