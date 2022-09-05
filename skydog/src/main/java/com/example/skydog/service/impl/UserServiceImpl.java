/***********************************************************************
 * Module:  UserServiceImpl.java
 * Author:  86159
 * Purpose: Defines the Class UserServiceImpl
 ***********************************************************************/

import java.util.*;

/** @pdOid e5d90e53-2074-4910-944f-0b92f9aac792 */
public class UserServiceImpl implements UserService {
   /** @pdOid 8002307e-3074-4f21-b300-776ca387717f */
   private UserDao userDao;
   
   /** @param user
    * @pdOid 6079159d-dc8f-4587-abb7-42a57321944a */
   public void add(User user) {
      // TODO: implement
   }
   
   /** @param userId
    * @pdOid fddd2298-85ea-4ab1-a70b-ca0aa320e450 */
   public void delete(int userId) {
      // TODO: implement
   }
   
   /** @param user
    * @pdOid 35320da9-c3fb-4583-8685-120f507f7561 */
   public void update(User user) {
      // TODO: implement
   }
   
   /** @param userId
    * @pdOid 0e617464-1593-4e32-b2c8-e0ce41fb358f */
   public List<User> queryId(int userId) {
      // TODO: implement
      return null;
   }
   
   /** @param userList
    * @pdOid edc3cb8b-9aee-4852-bee7-9b7841425d03 */
   public void batchAdd(List<User> userList) {
      // TODO: implement
   }
   
   /** @param list
    * @pdOid 20d1f1f7-6de8-45e7-8970-39bdd77ae364 */
   public void batchDelete(List list) {
      // TODO: implement
   }
   
   /** @pdOid fd5838ec-cf1e-45d4-8704-0b8355f10af3 */
   public List<User> pageQuery() {
      // TODO: implement
      return null;
   }
   
   /** @param userName 
    * @param password
    * @pdOid 2ac9f7d6-50c0-4572-a5dc-8a6b7c98b10f */
   public void register(String userName, String password) {
      // TODO: implement
   }
   
   /** @param userName 
    * @param password
    * @pdOid 544c2d1a-e7a8-4bba-ac50-fadeee62d8b2 */
   public void login(String userName, String password) {
      // TODO: implement
   }
   
   /** @param oldPassword 
    * @param newPassword
    * @pdOid b77411ec-2b7a-4298-9df1-889daf2fdcb3 */
   public void updatePassword(String oldPassword, String newPassword) {
      // TODO: implement
   }
   
   /** @pdOid 0ef5b671-ffe2-4142-98cf-3f32f0052a83 */
   public void updateAvatar() {
      // TODO: implement
   }
   
   /** @pdOid 7b184675-4f92-459e-a87d-97a662ea6aa9 */
   public List<Cart> getCart() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 5321e388-c637-4392-be63-0d46ddad30b4 */
   public List<Order> getOrder() {
      // TODO: implement
      return null;
   }

}