package com.example.skydog.service; /***********************************************************************
 * Module:  AdminService.java
 * Author:  new
 * Purpose: Defines the Interface AdminService
 ***********************************************************************/

import com.example.skydog.module.entity.Admin;

import java.util.*;

/** @pdOid 831d885c-e377-4478-bcf2-3e87647ab272 */
public interface AdminService {
   /** @param admin
    * @pdOid f763e91d-6fc3-4c75-828f-6d5b9ce0b1a7 */
   void add(Admin admin);
   /** @param id
    * @pdOid 6266f103-fc10-467e-b53b-9495ad45d405 */
   void delete(Integer id);
   /** @param admin
    * @pdOid 5849b0b0-f14c-4fce-bdbf-5c75a7989b25 */
   void update(Admin admin);
   /** @param id
    * @pdOid b63b3833-f5cf-4186-8ce0-82e23c77e20b */
   Admin queryId(Integer id);
   /** @param admin
    * @pdOid 02b2e231-7522-4685-80b1-a3b03fee32df */
   List<Admin> queryCodition(Admin admin);
   /** @param adminAcc 
    * @param adminPwd
    * @pdOid 212b69c1-dd4f-4a49-b4f0-6619d36ea451 */
   Boolean login(String adminAcc, String adminPwd);

}