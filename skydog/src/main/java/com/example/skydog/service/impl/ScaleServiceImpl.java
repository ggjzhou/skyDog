package com.example.skydog.service.impl; /***********************************************************************
 * Module:  ScaleServiceImpl.java
 * Author:  new
 * Purpose: Defines the Class ScaleServiceImpl
 ***********************************************************************/

import com.example.skydog.dao.ScaleDao;
import com.example.skydog.module.entity.Scale;
import com.example.skydog.service.ScaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;
@Service
/** @pdOid d0de55f6-d1e4-43be-8c98-20c03e75263d */
public class ScaleServiceImpl implements ScaleService {
   /** @param scale
    * @pdOid 328591b4-d3ea-4b90-9979-69183e507073 */
   @Autowired
   ScaleDao scaledao;
   public void add(Scale scale) {
      // TODO: implement
       scaledao.add(scale);
   }
   
   /** @param scaleId
    * @pdOid 32a4d703-3ac4-420a-8014-2f2718e2061a */
   public void delete(Integer scaleId) {
      // TODO: implement
      scaledao.delete(scaleId);
   }
   
   /** @param scale
    * @pdOid 753ce19f-326b-4bc1-b31c-ef3734a636fe */
   public void update(Scale scale) {
      // TODO: implement
     scaledao.update(scale);
   }
   
   /** @param scaleId
    * @pdOid 310eb683-033a-40a0-a0fd-83943f18f565 */
   public Scale queryId(Integer scaleId) {
      // TODO: implement
     return scaledao.queryId(scaleId);
   }
   
   /** @param scale
    * @pdOid edb6c6d1-37e5-45e1-a2c3-51f65b31f68b */
   public List<Scale> queryCondition(Scale scale) {
      // TODO: implement
     return scaledao.queryCondition(scale);
   }

}