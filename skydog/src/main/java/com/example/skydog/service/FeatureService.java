package com.example.skydog.service; /***********************************************************************
 * Module:  FeatureService.java
 * Author:  new
 * Purpose: Defines the Interface FeatureService
 ***********************************************************************/

import com.example.skydog.module.entity.Feature;

import java.util.*;

/** @pdOid 02ab331f-360d-4033-826b-3fecba88f476 */
public interface FeatureService {
   /** @param feature
    * @pdOid 26b3ed7c-cfd9-4a63-ba1e-7220baec91d8 */
   Boolean add(Feature feature);
   /** @param featureId
    * @pdOid 0e78cebd-78e4-4d8a-9b30-c5effb54ae9a */
   Boolean delete(Integer featureId);
   /** @param feature
    * @pdOid d2ec3d16-386c-478f-a4bd-67a385176a67 */
   Boolean update(Feature feature);
   /** @param featureId
    * @pdOid 66bc918d-4dc8-435f-a422-76ca525a2c46 */
   Feature queryId(Integer featureId);
   /** @param feature
    * @pdOid d96c97fb-1b79-4375-bf6c-51f97f3949ef */
   List<Feature> queryCondition(Feature feature);

}