package com.example.skydog.service; /***********************************************************************
 * Module:  Interface_OrderServiceImpl.java
 * Author:  86159
 * Purpose: Defines the Interface Interface_OrderServiceImpl
 ***********************************************************************/

import com.example.skydog.module.entity.Order;

import java.util.*;

/** @pdOid 3ce48aac-4cfa-4188-a445-04365273d315 */
public interface OrderService {
   /** @param order
    * @pdOid 5b269e05-36bf-41c7-b465-2a85faa0a297 */
   void add(Order order);
   /** @param orderId
    * @pdOid 7812a0d8-dbb2-4203-bd33-e37df185fdd4 */
   void delete(int orderId);
   /** @param userId
    * @pdOid de0e132f-e3cb-44f3-80fa-020604713e0b */
   List<Order> queryId(int userId);
   /** @pdOid 37033ed7-8209-4654-adf6-d30bdcd25685 */
   List<Order> queryCondition(Order order);
   /** @param order
    * @pdOid 98580a56-cbcb-4be9-a579-c2a935d56d52 */
   void update(Order order);
   /** @param orderList
    * @pdOid 753cdda5-7b27-426f-974e-58939bd8676a */
   //void batchAdd(List<Order> orderList);
   /** @param list
    * @pdOid 0ff3eea8-378b-4a4e-a110-f72051f05c52 */
   void batchDelete(List list);
   /** @pdOid b4440b87-c799-4676-9130-526f9176d8df */
   List<Order> pageQuery();
   /** @param startTime 
    * @param endTime
    * @pdOid 90203ded-7f59-4887-a060-24b9727ba269 */
   List<Order> queryByBuildTime(Date startTime, Date endTime);
   /** @param productId
    * @pdOid 12894f9d-0c54-4010-9587-9b8ccc161e11 */
   List<Order> queryByproductId(Integer productId);
   /** @param status
    * @pdOid ecf6db25-7ad3-4e4f-801c-e8550192f0cd */
   List<Order> queryByStatus(String status);

}