/***********************************************************************
 * Module:  FeatureDao.java
 * Author:  new
 * Purpose: Defines the Interface FeatureDao
 ***********************************************************************/

import java.util.*;

/** @pdOid 1f520ebc-bb24-4c08-91a2-6a6bc06d550d */
public interface FeatureDao {
   /** @param feature
    * @pdOid 17bcd662-f9ce-4a89-94dc-780d1b018b64 */
   void add(Feature feature);
   /** @param featureId
    * @pdOid 921d8b50-4bd7-4e0d-b7ba-007e32cb3677 */
   void delete(Integer featureId);
   /** @param feature
    * @pdOid be94b5fa-b4d8-44c4-ba63-ece7c5bffa39 */
   void update(Feature feature);
   /** @param featureId
    * @pdOid 88786fad-86da-4bab-b087-7881fe505dba */
   Feature queryId(Integer featureId);
   /** @param feature
    * @pdOid 7b309f93-4530-4370-8156-beae00199fc3 */
   List<Feature> queryCondition(Feature feature);

}