package com.example.skydog.dao; /***********************************************************************
 * Module:  Interface_EvaluateDaoImpl.java
 * Author:  86159
 * Purpose: Defines the Interface Interface_EvaluateDaoImpl
 ***********************************************************************/

import java.util.*;

/** @pdOid 6e307d09-2699-42cb-913a-c697044bd3c6 */
public interface EvaluateDao {
   /** @param evaluate
    * @pdOid e2a91832-30ad-4f42-a2cd-5a506f179fa5 */
   void add(Evaluate evaluate);
   /** @param evaluateId
    * @pdOid 8cbccc7e-219c-4834-9a76-4f1208efe1ac */
   void delete(int evaluateId);
   /** @param evaluateId
    * @pdOid 4f640c9d-a4e5-4116-88a3-573bc7c56198 */
   List<evaluate> queryId(int evaluateId);
   /** @pdOid 5f4b639a-c051-45af-9d76-361ce606e04c */
   List<evaluate> queryCondition();
   /** @param evaluate
    * @pdOid 206b3c1d-bc5d-45fb-b244-df103f2a5dcd */
   void update(Evaluate evaluate);
   /** @param evaluateList
    * @pdOid c6c0713e-478c-4212-abe9-08af2551b01d */
   void batchAdd(List<Evaluate> evaluateList);
   /** @param list
    * @pdOid 0e76f9aa-efd7-4dea-881d-d2729c60dadb */
   void batchDelete(List list);
   /** @pdOid b8b1c8b2-ffb4-46ce-9b89-9cdb4e595bc6 */
   List<evaluate> pageQuery();

}