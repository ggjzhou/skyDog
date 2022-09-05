/***********************************************************************
 * Module:  OrderDaoImpl.java
 * Author:  86159
 * Purpose: Defines the Class OrderDaoImpl
 ***********************************************************************/

import java.util.*;

/** @pdOid 5af8793e-54b9-43d8-b970-097369a0ff28 */
public class OrderDaoImpl implements Interface_OrderDaoImpl {
   /** @param order
    * @pdOid 7fbce79b-5323-4f14-a0bc-732975dc57a9 */
   public void add(Order order) {
      // TODO: implement
   }
   
   /** @param orderId
    * @pdOid 0105d29e-0990-4e3e-bb03-9e81baa8b38b */
   public void delete(int orderId) {
      // TODO: implement
   }
   
   /** @param userId
    * @pdOid 2364be98-8146-4976-9bcb-5ade3218fb0a */
   public List<Order> queryId(int userId) {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 53057452-56ad-4bf6-b87c-71094ed70f0a */
   public List<Order> queryCondition() {
      // TODO: implement
      return null;
   }
   
   /** @param order
    * @pdOid d46692db-6d3a-4b8c-b154-7bde0eb3e71e */
   public void update(Order order) {
      // TODO: implement
   }
   
   /** @param orderList
    * @pdOid 1fb27a6b-6aee-43a3-8b0e-5ddcd51b43db */
   public void batchAdd(List<Order> orderList) {
      // TODO: implement
   }
   
   /** @param list
    * @pdOid 69a2f2ba-967f-460f-a759-53d2fb93ff61 */
   public void batchDelete(List list) {
      // TODO: implement
   }
   
   /** @pdOid b56be7bb-ca9f-4cb8-8170-86f178d754c8 */
   public List<Order> pageQuery() {
      // TODO: implement
      return null;
   }

}