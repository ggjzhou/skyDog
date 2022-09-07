package com.example.skydog.service; /***********************************************************************
 * Module:  ScaleService.java
 * Author:  new
 * Purpose: Defines the Interface ScaleService
 ***********************************************************************/



import com.example.skydog.module.entity.Scale;

import java.util.*;

/** @pdOid 653b4927-5083-4f33-8e74-de0eea3fc953 */
public interface ScaleService {
   /** @param scale
    * @pdOid 0094fb5f-8778-4f40-b8d7-0c11580693f8 */
   Boolean add(Scale scale);
   /** @param scaleId
    * @pdOid c964dd58-479d-492c-be7e-9f8397b318a2 */
   Boolean delete(Integer scaleId);
   /** @param scale
    * @pdOid 28f156fa-44f5-4fa1-8d63-bd4101229ff7 */
   Boolean updata(Scale scale);
   /** @param scaleId
    * @pdOid a89ae55e-34b7-4a83-bc66-f39c77e0898b */
   Scale queryId(Integer scaleId);
   /** @param scale
    * @pdOid ae157e05-fc9d-4462-931c-27d0e6fcb601 */
   List<Scale> queryCondition(Scale scale);

}