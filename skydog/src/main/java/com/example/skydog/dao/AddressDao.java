/***********************************************************************
 * Module:  AddressDao.java
 * Author:  86159
 * Purpose: Defines the Interface AddressDao
 ***********************************************************************/

import java.util.*;

/** @pdOid 9496ab58-3ab0-4ad4-898e-287c8efbd3a4 */
public interface AddressDao {
   /** @param address
    * @pdOid bc759e2e-4f76-4676-94a6-87c44df33f36 */
   void add(Address address);
   /** @param addressId
    * @pdOid 1a762c42-ca72-4817-924e-15c89a239518 */
   void delete(int addressId);
   /** @param addressId
    * @pdOid 7aacfdcc-7f30-4f90-8e13-a01c00476897 */
   List<address> queryId(int addressId);
   /** @param address
    * @pdOid f6168812-7a1d-45ae-98ca-6a40adaf7516 */
   void update(Address address);
   /** @param addressList
    * @pdOid 030f3b2e-f6f9-4bc7-bc86-e9c599a36152 */
   void batchAdd(List<Address> addressList);
   /** @param list
    * @pdOid 9b9a7909-e8e9-4a37-99b7-15541e7a3f0f */
   void batchDelete(List list);
   /** @pdOid 83aac090-c134-453d-9fab-20ea7df65ec1 */
   List<address> pageQuery();
   /** @pdOid 8bc093c4-6de6-4662-892f-af4d153db358 */
   List<address> queryCondition();

}