/***********************************************************************
 * Module:  ProductService.java
 * Author:  new
 * Purpose: Defines the Interface ProductService
 ***********************************************************************/

import java.util.*;

/** @pdOid 2bc558ce-5be5-4119-a85b-900548851bc0 */
public interface ProductService {
   /** @param product
    * @pdOid ce1b7945-7a7c-45b6-9c47-fb4fbaccc2cc */
   void add(Product product);
   /** @param product
    * @pdOid cf8b7112-7a1b-447b-a3e3-831b3dee24b4 */
   void update(Product product);
   /** @param productId
    * @pdOid c944a335-681e-4ca6-bec6-5202f771513f */
   void delete(Integer productId);
   /** @param productId
    * @pdOid ba81e766-84c1-4e29-9be5-9fab14b63ef6 */
   List<Product> queryId(Integer productId);
   /** @param product
    * @pdOid 53085636-bf4b-4caf-8e2d-9d40e0e0e121 */
   List<Product> queryCondition(Product product);
   /** @param pageBeans
    * @pdOid 06d3f032-f90f-4219-b9d7-9a22c15edcbb */
   Page<Product> queryByPage(PageBeans pageBeans);
   /** @param categoryId
    * @pdOid 46545410-1a6b-4d2e-b14a-0665b0a0c421 */
   List<Product> queryByCategory(Integer categoryId);
   /** @param productPrice
    * @pdOid bb4beecd-aecc-4329-970c-5f28813e8233 */
   List<Product> queryByPrice(Double productPrice);
   /** @param productName
    * @pdOid e62bcff0-1f65-4bcc-9532-ffa08d5f1f54 */
   List<Product> queryByName(String productName);

}