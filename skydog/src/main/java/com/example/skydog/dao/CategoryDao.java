package com.example.skydog.dao; /***********************************************************************
 * Module:  CategoryDao.java
 * Author:  new
 * Purpose: Defines the Interface CategoryDao
 ***********************************************************************/

import java.util.*;

/** @pdOid 9848e756-f7b4-4116-a503-d283e88ecc32 */
public interface CategoryDao {
   /** @param category
    * @pdOid c4b9e338-2775-4ee2-9de4-500d035202b9 */
   void add(CategoryDaoImpl category);
   /** @param categoryId
    * @pdOid 41563341-e5ea-460c-8430-eae2609350f3 */
   void delete(Integer categoryId);
   /** @param category
    * @pdOid ec57c2de-c0fe-4dba-b957-cb70b7dffd63 */
   void updata(CategoryDaoImpl category);
   /** @param category
    * @pdOid ecbb1e3a-06a0-4f3b-866f-fdd3e3c1107b */
   List queryCondition(Category category);
   /** @param categoryId
    * @pdOid 91527bd3-7682-4db8-ba5e-5cf73b2f84cf */
   Category queryId(Integer categoryId);

}