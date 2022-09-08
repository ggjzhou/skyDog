package com.example.skydog.service.impl; /***********************************************************************
 * Module:  OrderServiceImpl.java
 * Author:  86159
 * Purpose: Defines the Class OrderServiceImpl
 ***********************************************************************/

import com.example.skydog.module.entity.Order;
import com.example.skydog.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
/** @pdOid f4feb4b4-8cda-4277-8953-de21c1127b59 */
public class OrderServiceImpl implements OrderService {
   /** @param order
    * @pdOid c66582e5-bafd-4174-84a5-e270c737c507 */
   public void add(Order order) {

      // TODO: implement
   }
   
   /** @param orderId
    * @pdOid b0e766cf-ff8f-4279-a51e-d6cc6ee6ca00 */
   public void delete(int orderId) {
      // TODO: implement
   }
   
   /** @param userId
    * @pdOid 2765b098-1727-46b8-bda3-25821398806b */
   public List<Order> queryId(int userId) {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 276dccb5-b594-4669-8f57-de02ddb8c7fd */
   public List<Order> queryCondition() {
      // TODO: implement
      return null;
   }
   
   /** @param order
    * @pdOid 5a23ddd0-668f-45eb-95e9-940cd4083313 */
   public void update(Order order) {
      // TODO: implement
   }
   
   /** @param orderList
    * @pdOid 0ba49f14-58ae-4304-853a-975d54154028 */
  /* public void batchAdd(List<Order> orderList) {
      // TODO: implement
   }*/
   
   /** @param list
    * @pdOid 8272701e-29bc-4e9b-a04c-4185afc88c76 */
   public void batchDelete(List list) {
      // TODO: implement
   }
   
   /** @pdOid ee9447ff-497f-493f-85e0-9445874af59c */
   public List<Order> pageQuery() {
      // TODO: implement
      return null;
   }
   
   /** @param startTime 
    * @param endTime
    * @pdOid 21b1d277-55d6-4c68-aa88-92b500cfb15e */
   public List<Order> queryByBuildTime(Date startTime, Date endTime) {
      // TODO: implement
      return null;
   }
   
   /** @param category
    * @pdOid 4b414a23-f933-4343-83c4-93f982423e16 */
   public List<Order> queryByCategory(String category) {
      // TODO: implement
      return null;
   }
   
   /** @param status
    * @pdOid 644f0bf7-9ff1-40bb-990d-8ab69c8ccdcc */
   public List<Order> queryByStatus(String status) {
      // TODO: implement
      return null;
   }

}