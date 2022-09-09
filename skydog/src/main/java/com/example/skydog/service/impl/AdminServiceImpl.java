package com.example.skydog.service.impl; /***********************************************************************
 * Module:  AdminServiceImpl.java
 * Author:  new
 * Purpose: Defines the Class AdminServiceImpl
 ***********************************************************************/

import com.example.skydog.dao.AdminDao;
import com.example.skydog.module.entity.Admin;
import com.example.skydog.module.entity.User;
import com.example.skydog.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
/** @pdOid be67da20-ea78-47c7-9f65-85aff7b0bad6 */
public class AdminServiceImpl implements AdminService {
   /** @param admin
    * @pdOid 46dc5433-6a2e-497d-af78-a80a9f231558 */
   @Autowired
   AdminDao admindao;
   public void add(Admin admin) {
      // TODO: implement
      admindao.add(admin);

   }

   /** @param id
    * @pdOid 82323a97-a2c3-48ac-8136-50333b0304f2 */
   public void delete(Integer id) {
      // TODO: implement
      admindao.delete(id);
   }

   /** @param admin
    * @pdOid 05095324-c8cc-4485-b1dd-ca67b4c213f7 */
   public void update(Admin admin) {
      // TODO: implement
      admindao.update(admin);
   }

   /** @param id
    * @pdOid 82c50648-5cb0-427a-9d21-ea78bb28c938 */
   public Admin queryId(Integer id) {
      // TODO: implement
     return admindao.queryId(id);
   }

   /** @param admin
    * @pdOid 011c5de5-58f9-43a9-9266-2cab039e041a */
   public List<Admin> queryCodition(Admin admin) {
      // TODO: implement
     return admindao.queryCondition(admin);
   }

   /*登录模块*/
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