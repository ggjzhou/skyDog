/***********************************************************************
 * Module:  CartService.java
 * Author:  new
 * Purpose: Defines the Interface CartService
 ***********************************************************************/

import java.util.*;

/** @pdOid 8e42dac0-ce0e-4e9f-b1ea-7f3b1d4662ad */
public interface CartService {
   /** @param product
    * @pdOid a3701eac-97f6-4c89-aa94-1c3db94153f4 */
   void add(Product product);
   /** @param product
    * @pdOid bc121bd8-b2e1-47b8-8fec-a09033e0fd72 */
   void update(Product product);
   /** @param productId
    * @pdOid dfbe39af-002f-4023-992b-9c5dc1b76d4d */
   void delete(Integer productId);
   /** @param cartId
    * @pdOid c365b758-05b5-4e31-8c18-acbe2175162e */
   List<Product> queryId(Integer cartId);
   /** @param product
    * @pdOid 3287a0c7-78dd-4489-ae49-cf84c87a36bc */
   List<Product> queryCondition(Product product);

}