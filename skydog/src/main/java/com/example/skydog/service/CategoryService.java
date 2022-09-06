package com.example.skydog.service; /***********************************************************************
 * Module:  CategoryService.java
 * Author:  new
 * Purpose: Defines the Interface CategoryService
 ***********************************************************************/

import java.util.*;

/** @pdOid 782c8374-df69-488e-952b-158d5c346121 */
public interface CategoryService {
   /** @param category
    * @pdOid 384267d8-1b2f-4dca-9296-17428903cac9 */
   Boolean add(Category category);
   /** @param categoryId
    * @pdOid c2087b94-3aeb-4834-85f5-3a82ba930b91 */
   Boolean delete(Integer categoryId);
   /** @param category
    * @pdOid 2c7e46ac-7c64-486b-b385-f4aaa4562772 */
   Boolean update(Category category);
   /** @param categoryId
    * @pdOid 76620c50-1bc0-4a7d-99e6-68c80bac7154 */
   Category queryId(Integer categoryId);
   /** @param category
    * @pdOid 80a7a36e-bb02-4999-a5bc-c870020dce0f */
   List<Category> queryCondition(Category category);

}