/***********************************************************************
 * Module:  Object.java
 * Author:  user
 * Purpose: Defines the Class Object
 ***********************************************************************/

import java.util.*;

/** @pdOid 87411861-3287-4bfd-8bd1-f463e94ac94f */
public class Object {
   /** @pdOid e6373999-f7b3-4cf8-a14c-9832973785ea */
   private int posX;
   /** @pdOid a630ed10-9275-4c30-a895-d098ce8ae300 */
   private int posY;
   /** @pdOid 99abfc2a-4cce-4b17-b2c2-7c257fbad86c */
   private int speedX;
   /** @pdOid 0706aa64-46b7-445c-a5e0-27165b62c588 */
   private int speedY;
   /** @pdOid 660d68e9-4ac7-496f-9bb9-bb4c9c5ba29c */
   private Boolean isVisible = true;
   /** @pdOid a864d037-ee34-4506-b76b-109aa6ff9168 */
   private String imgName;
   
   /** @pdOid a9eac82f-6c75-4e72-ad91-7f0e0ed03889 */
   public Object() {
      // TODO: implement
   }
   
   /** @param posX 
    * @param posY
    * @pdOid 5980a158-e48d-4e2a-9a1b-e8b544d9ca1f */
   public Object(int posX, int posY) {
      // TODO: implement
   }
   
   /** @pdOid 32da2ac7-074a-42f2-adfd-0f258bf466aa */
   public void move() {
      // TODO: implement
   }
   
   /** @pdOid b863ca6a-e5be-4cd1-99c5-1a4d348fddd2 */
   public int getPosX() {
      return posX;
   }
   
   /** @param newPosX
    * @pdOid 7f4f0908-81de-4e13-896d-ab191db38fae */
   public void setPosX(int newPosX) {
      posX = newPosX;
   }
   
   /** @pdOid 4bdc5b2c-9095-4d2c-9105-3d7427e7eff5 */
   public int getPosY() {
      return posY;
   }
   
   /** @param newPosY
    * @pdOid 6ab159bc-d09f-409b-8ca6-4caf9d8ce78f */
   public void setPosY(int newPosY) {
      posY = newPosY;
   }
   
   /** @pdOid 344a5ac2-c873-41b8-81ee-5499f9a71e94 */
   public int getSpeedX() {
      return speedX;
   }
   
   /** @param newSpeedX
    * @pdOid 2e502e2e-7fdc-43bd-86a1-71b442823d3c */
   public void setSpeedX(int newSpeedX) {
      speedX = newSpeedX;
   }
   
   /** @pdOid 6a32ffff-7978-4571-b730-ea1495c14f1c */
   public int getSpeedY() {
      return speedY;
   }
   
   /** @param newSpeedY
    * @pdOid 497bdf59-aaa6-4297-bfed-97aba1edd611 */
   public void setSpeedY(int newSpeedY) {
      speedY = newSpeedY;
   }
   
   /** @pdOid e3b7ede3-62a5-4b49-b664-e4359d78d977 */
   public Boolean getIsVisible() {
      return isVisible;
   }
   
   /** @param newIsVisible
    * @pdOid ca10a84b-bb36-4eba-bd3d-b7a795e26721 */
   public void setIsVisible(Boolean newIsVisible) {
      isVisible = newIsVisible;
   }
   
   /** @pdOid d40bf9da-6328-47b0-9d83-c7ea38924038 */
   public String getImgName() {
      return imgName;
   }
   
   /** @param newImgName
    * @pdOid e7b6848d-4cf5-4a4e-8c0b-9994c0ce3ec0 */
   public void setImgName(String newImgName) {
      imgName = newImgName;
   }

}