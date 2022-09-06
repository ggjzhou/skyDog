/***********************************************************************
 * Module:  CartDao.java
 * Author:  new
 * Purpose: Defines the Interface CartDao
 ***********************************************************************/

import java.util.*;

/** @pdOid 7bbf3484-f6d4-4424-87f2-680162287df1 */
public interface CartDao {
   /** @param product
    * @pdOid 8cbc1713-7ffa-4b75-b050-ff5d3b3f80b7 */
   void add(Product product);
   /** @param product
    * @pdOid 646156e9-dfd8-4fb2-ab44-7af75f8ec413 */
   void update(Product product);
   /** @param productId
    * @pdOid 1ff27675-8db1-4251-80aa-a4b6473ac1f2 */
   void delete(Integer productId);
   /** @param cartId
    * @pdOid d4501d7e-6603-405a-9cd2-a400be4f5a90 */
   List<Product> queryId(Integer cartId);
   /** @pdOid e152b49d-1b5d-4b16-aa40-68aa4c4ae78b */
   List<Product> queryCondition();

}