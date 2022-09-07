package com.example.skydog.service;
/***********************************************************************
 * Module:  Interface_EvalateServiceImpl.java
 * Author:  86159
 * Purpose: Defines the Interface Interface_EvalateServiceImpl
 ***********************************************************************/

import java.util.*;

/** @pdOid 499b0171-f3e6-40ff-8278-a93788aa4e50 */
public interface EvalateService {
   /** @param evaluate
    * @pdOid 14afb915-9b4c-4a92-841e-5e1ed83f699f */
   void add(Evaluate evaluate);
   /** @param evaluateId
    * @pdOid 1ee9d535-5484-4aed-b136-fc906a2d155a */
   void delete(int evaluateId);
   /** @param evaluateId
    * @pdOid c8573aad-296e-4eff-b06c-7ded7b2783e5 */
   List<evaluate> queryId(int evaluateId);
   /** @pdOid 6b60e591-1281-4ed1-a62c-149cd72345a0 */
   List<evaluate> queryCondition();
   /** @param evaluate
    * @pdOid cddbc3b5-c61d-4883-9005-3b1fba1a4b86 */
   void update(Evaluate evaluate);
   /** @param evaluateList
    * @pdOid 4ec18ce0-15d6-4922-87cd-561033f456be */
   void batchAdd(List<Evaluate> evaluateList);
   /** @param list
    * @pdOid bc9c4c03-aaa7-4426-86aa-b0fd59842c6d */
   void batchDelete(List list);
   /** @pdOid 8178217c-3c29-41a1-bb1d-253818da38db */
   List<evaluate> pageQuery();
   /** @param grade
    * @pdOid 4ffc3c47-f30b-4e37-8e76-05cd1af5fb22 */
   List<evaluate> queryByGrade(String grade);
   /** @pdOid d399f87e-4b80-4a9b-af43-0cc31d683aee */
   List<evaluate> queryByImg();
   /** @pdOid 138eaaaa-d674-4507-8f12-7e1d9f318b15 */
   List<evaluate> queryByVideo();

}