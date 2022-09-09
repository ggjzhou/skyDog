package com.example.skydog.dao; /***********************************************************************
 * Module:  AdminDao.java
 * Author:  new
 * Purpose: Defines the Interface AdminDao
 ***********************************************************************/

import com.example.skydog.module.entity.Admin;
import org.apache.ibatis.annotations.Mapper;


import java.util.*;

@Mapper
/** @pdOid a382e481-db3f-4450-9f39-52bd595aafe0 */
public interface AdminDao {
   /** @param admin
    * @pdOid 4cebf1c1-15a2-4fbc-8aff-af9ce6a524cf */
   void add(Admin admin);
   /** @param id
    * @pdOid f44133d3-640f-495c-a881-1af52c67c630 */
   void delete(Integer id);
   /** @param admin
    * @pdOid 48b96991-c4b4-4a0b-ac6b-f16cc54e3896 */
   void update(Admin admin);
   /** @param id
    * @pdOid 266f47bb-5fea-40f4-95b9-2b9b46975f30 */
   Admin queryId(Integer id);
   /** @param admin
    * @pdOid 3f52c7a6-7c3e-48c0-a44e-1c6ddfe846cf */
   List<Admin> queryCondition(Admin admin);

}