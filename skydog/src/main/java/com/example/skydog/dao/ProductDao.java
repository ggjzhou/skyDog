/***********************************************************************
 * Module:  ProductDao.java
 * Author:  new
 * Purpose: Defines the Interface ProductDao
 ***********************************************************************/

import java.util.*;

/** @pdOid 2856f84a-8644-462b-ba71-bc33ed7c0a6b */
public interface ProductDao {
   /** @param product
    * @pdOid 6c8bb07c-632e-4576-aab9-7902b1d4f971 */
   void add(Product product);
   /** @param product
    * @pdOid 5a6f5de1-149a-406d-84d3-e31cd1ccf15b */
   void update(Product product);
   /** @param productId
    * @pdOid 1626539b-f8c0-45c7-9110-4b1465543d24 */
   void delete(Integer productId);
   /** @param productId
    * @pdOid cfee9a91-8a7d-4f5b-882e-234d68b171d0 */
   List<Product> queryId(Integer productId);
   /** @param product
    * @pdOid 4d6657f0-d031-42bf-b4c0-47049d40d3dd */
   List<Product> queryCondition(Product product);

}