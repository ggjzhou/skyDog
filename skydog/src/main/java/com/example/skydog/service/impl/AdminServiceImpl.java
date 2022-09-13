package com.example.skydog.service.impl;

import com.example.skydog.dao.AdminDao;
import com.example.skydog.module.entity.Admin;
import com.example.skydog.module.entity.User;
import com.example.skydog.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AdminServiceImpl implements AdminService {

   @Autowired
   AdminDao admindao;
   public void add(Admin admin) {
      // TODO: implement
      admindao.add(admin);

   }


   public void delete(Integer id) {
      // TODO: implement
      admindao.delete(id);
   }


   public void update(Admin admin) {
      // TODO: implement
      admindao.update(admin);
   }


   public Admin queryId(Integer id) {
      // TODO: implement
     return admindao.queryId(id);
   }


   public List<Admin> queryCodition(Admin admin) {
      // TODO: implement
     return admindao.queryCondition(admin);
   }

   /**
    * 登录模块
    * @param adminAcc
    * @param adminPwd
    * @return
    */
   public Admin login(String adminAcc, String adminPwd) {
      Admin a = new Admin();
      a.setAdminName(adminAcc);
      List<Admin> list = admindao.queryCondition(a);
      if (list == null || list.isEmpty()) {
         return null;
      } else if(list.get(0).getAdminPwd().equals(adminPwd)) {
         return a;
      }else
         return null;
   }

}