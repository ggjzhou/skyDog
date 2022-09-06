/***********************************************************************
 * Module:  ProductServiceImpl.java
 * Author:  new
 * Purpose: Defines the Class ProductServiceImpl
 ***********************************************************************/

import java.util.*;

/** @pdOid d82801e7-9a06-45a9-a5ed-94973efed95a */
public class ProductServiceImpl implements ProductService {
   /** @pdOid 798aba4f-a100-4851-8aca-e4d33b7a90e2 */
   private ProductDao productDao;
   
   /** @param product
    * @pdOid de378010-3e8c-4ee4-b413-f918a5efdda9 */
   public void add(Product product) {
      // TODO: implement
   }
   
   /** @param product
    * @pdOid d80b2502-b517-4a50-b517-5e5e3a136a31 */
   public void update(Product product) {
      // TODO: implement
   }
   
   /** @param productId
    * @pdOid 6a44d016-9c8b-4461-8d89-1cd77c494869 */
   public void delete(Integer productId) {
      // TODO: implement
   }
   
   /** @param productId
    * @pdOid 690bc321-9e87-498d-a1da-b9ac50ea636d */
   public List<Product> queryId(Integer productId) {
      // TODO: implement
      return null;
   }
   
   /** @param product
    * @pdOid d69b12ee-5cb2-4d2f-99d8-9a97d39b0f22 */
   public List<Product> queryCondition(Product product) {
      // TODO: implement
      return null;
   }
   
   /** @param pageBeans
    * @pdOid 9511e88d-5262-4a13-a4f9-61e21e65c276 */
   public Page<Product> queryByPage(PageBeans pageBeans)
   
   /** @param categoryId
    * @pdOid 54582e08-194b-4c47-94cc-8db3e1aab0c9 */
   public List<Product> queryByCategory(Integer categoryId) {
      // TODO: implement
      return null;
   }
   
   /** @param productPrice
    * @pdOid 3e67b49f-224c-425b-bab6-b4f1a123fc65 */
   public List<Product> queryByPrice(Double productPrice) {
      // TODO: implement
      return null;
   }
   
   /** @param productName
    * @pdOid cf36fc28-9a9b-4f5e-953b-87504109384d */
   public List<Product> queryByName(String productName) {
      // TODO: implement
      return null;
   }

}