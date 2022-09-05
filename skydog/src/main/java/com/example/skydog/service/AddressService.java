/***********************************************************************
 * Module:  AddressService.java
 * Author:  86159
 * Purpose: Defines the Interface AddressService
 ***********************************************************************/

import java.util.*;

/** @pdOid 5e799042-8049-4159-89d8-11ab27d5fef8 */
public interface AddressService {
   /** @param address
    * @pdOid bb9a64ac-dad1-4790-a67a-4f38075d23db */
   void add(Address address);
   /** @param addressId
    * @pdOid 27f56082-39d0-459a-9e1d-a31088b6d8a9 */
   void delete(int addressId);
   /** @param addressId
    * @pdOid f26aaf8a-55cb-45aa-a9da-c4030f196b83 */
   List<address> queryId(int addressId);
   /** @param address
    * @pdOid ca7024b6-9483-4278-815b-6437cbf13880 */
   void update(Address address);
   /** @param addressList
    * @pdOid 1e00968c-3310-4089-822f-eeb90549e9ed */
   void batchAdd(List<Address> addressList);
   /** @param list
    * @pdOid 174cb69e-ebcf-49c7-8f50-d0fdc0424835 */
   void batchDelete(List list);
   /** @pdOid e626d97d-d9c2-4d58-9c2d-221ba83760cd */
   List<address> pageQuery();
   /** @pdOid 6a469c78-20bd-4bd1-b21d-2bd6e7456632 */
   List<address> queryCondition();

}