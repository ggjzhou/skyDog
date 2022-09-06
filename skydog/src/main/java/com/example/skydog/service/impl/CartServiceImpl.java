/***********************************************************************
 * Module:  CartServiceImpl.java
 * Author:  new
 * Purpose: Defines the Class CartServiceImpl
 ***********************************************************************/

import java.util.*;

/** @pdOid f4d92708-e822-4438-be84-3ad89ca220f8 */
public class CartServiceImpl implements CartService {
   /** @pdOid afa26385-1c96-4c66-9283-77cde03292ab */
   private CartDao cartDao;
   
   /** @param product
    * @pdOid 50af4574-526a-41d9-b7c1-eb90f221df92 */
   public void add(Product product) {
      // TODO: implement
   }
   
   /** @param product
    * @pdOid c4270f64-64c2-4e70-aa7c-86031b2d4d65 */
   public void update(Product product) {
      // TODO: implement
   }
   
   /** @param productId
    * @pdOid cb7f7fd8-8bcc-420e-ad20-7df761592158 */
   public void delete(Integer productId) {
      // TODO: implement
   }
   
   /** @param cartId
    * @pdOid 5bdefe9e-6956-46af-bb48-1d3898f78418 */
   public List<Product> queryId(Integer cartId) {
      // TODO: implement
      return null;
   }
   
   /** @param product
    * @pdOid c4ba2f4b-9831-41b1-a80d-0fca0835b59c */
   public List<Product> queryCondition(Product product) {
      // TODO: implement
      return null;
   }

}