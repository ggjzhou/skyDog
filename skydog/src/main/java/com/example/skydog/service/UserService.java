/***********************************************************************
 * Module:  UserService.java
 * Author:  86159
 * Purpose: Defines the Interface UserService
 ***********************************************************************/

import java.util.*;

/** @pdOid 1b70ed1f-2277-4e0f-bc08-96530a9a3ed1 */
public interface UserService {
   /** @param user
    * @pdOid bf667470-8e8f-49ac-a51b-f5f5fba8610b */
   void add(User user);
   /** @param userId
    * @pdOid ed718334-363a-4054-9229-01a63dd3764d */
   void delete(int userId);
   /** @param user
    * @pdOid 6b54fda5-4989-4480-b227-7fa6070741c1 */
   void update(User user);
   /** @param userId
    * @pdOid ab842ea6-1a7e-4ba9-bb1b-4286ddfc469f */
   List<User> queryId(int userId);
   /** @param userList
    * @pdOid 85f8572c-78fe-42cb-83a8-7b6856a93ba2 */
   void batchAdd(List<User> userList);
   /** @param list
    * @pdOid fddd2ca6-ef00-4a75-9926-1fbbb38689e9 */
   void batchDelete(List list);
   /** @pdOid 797f119b-a5e8-4d9b-bf63-2a69daaff105 */
   List<User> pageQuery();
   /** @param userName 
    * @param password
    * @pdOid 4edd201f-fa2e-4a90-92c4-b5df66b1a3f8 */
   void register(String userName, String password);
   /** @param userName 
    * @param password
    * @pdOid 2844b4ef-e3f6-409e-a79e-620505dc4351 */
   void login(String userName, String password);
   /** @param oldPassword 
    * @param newPassword
    * @pdOid df383405-af0a-4f8f-90ae-ab98037b4648 */
   void updatePassword(String oldPassword, String newPassword);
   /** @pdOid d186cd78-25d3-49db-811e-d8fc40c8d639 */
   void updateAvatar();
   /** @pdOid 7659a2dd-76b9-4535-9c0b-f6f50f9522bc */
   List<Cart> getCart();
   /** @pdOid 54037dc9-d5a3-4c94-b5a8-821fc85af48d */
   List<Order> getOrder();

}