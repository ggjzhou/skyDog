/***********************************************************************
 * Module:  userDao.java
 * Author:  86159
 * Purpose: Defines the Interface userDao
 ***********************************************************************/

import java.util.*;

/** @pdOid e090399c-1dee-4a90-8bf5-6371be2bf12d */
public interface userDao {
   /** @param user
    * @pdOid 91284fe4-9e6f-4f2b-a638-bdf3da25d090 */
   void add(User user);
   /** @param userId
    * @pdOid cb1075dc-8963-46ba-a4d6-de3bd1d8c092 */
   void delete(int userId);
   /** @param userId
    * @pdOid ce38b155-79dd-448a-8766-93b772bf9bf9 */
   List<User> queryId(int userId);
   /** @param userList
    * @pdOid a3e1cdab-2867-48b6-8bd7-b18a5d8a582c */
   void batchAdd(List<User> userList);
   /** @param list
    * @pdOid bd681c2e-2473-41ab-9ff7-1b2dc40e5867 */
   void batchDelete(List list);
   /** @pdOid 88561aab-0fa3-46c6-b88a-a42400675b19 */
   List<User> pageQuery();
   /** @param user
    * @pdOid 11ca4f91-b18d-426c-a32c-b70dc59c14fa */
   void update(User user);

}