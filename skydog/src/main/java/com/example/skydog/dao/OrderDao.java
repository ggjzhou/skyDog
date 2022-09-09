package com.example.skydog.dao; /***********************************************************************
 * Module:  Interface_OrderDaoImpl.java
 * Author:  86159
 * Purpose: Defines the Interface Interface_OrderDaoImpl
 ***********************************************************************/

import com.example.skydog.module.entity.Order;
import org.apache.ibatis.annotations.Mapper;


import java.util.*;

@Mapper
/** @pdOid 97365a4d-e319-488d-94a0-e6096654bb66 */
public interface OrderDao {
   /** @param order
    * @pdOid a8bd96a1-34aa-4d85-9179-843593f87fc7 */
   void add(Order order);
   /** @param orderId
    * @pdOid e520f124-2182-49d1-9c13-59d624122bc0 */
   void delete(int orderId);
   /** @param userId
    * @pdOid 308c98fb-2b49-4c26-86ab-a748ebc246fc */
   List<Order> queryId(int userId);
   /** @pdOid 4ca20190-d99a-454a-bc87-0b7f1172bbcd */
   List<Order> queryCondition(Order order);
   /** @param order
    * @pdOid 7872ca4d-7fea-4be9-be00-9c354d6e07d6 */
   void update(Order order);
   /** @param orderList
    * @pdOid eaa8222a-b111-4c33-bd1e-862d9f350cb3 */
   //void batchAdd(List<Order> orderList);
   /** @param list
    * @pdOid de48b18c-198c-414f-a571-c76975583369 */
   void batchDelete(List list);
   /** @pdOid c9624d96-7ed3-49d8-9219-7babaad47be8 */


}