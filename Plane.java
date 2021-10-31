/***********************************************************************
 * Module:  Plane.java
 * Author:  user
 * Purpose: Defines the Class Plane
 ***********************************************************************/

import java.util.*;

/** @pdOid 4302d591-f372-4298-aa83-ad6a9eaab964 */
public class Plane extends Object {
   /** @pdOid b1de1b94-6746-4867-b858-c4d2352d5c97 */
   private Gun gun;
   
   /** @pdRoleInfo migr=no name=Gun assc=association8 mult=1..1 type=Aggregation */
   public Gun alwaysin;
   
   /** @param posX 
    * @param posY
    * @pdOid 8f6bd7cf-cfa1-4ec7-bdca-c7b3344a5e91 */
   public Plane(int posX, int posY) {
      // TODO: implement
   }
   
   /** @pdOid eba84fcb-9ac6-4f48-b00f-f67d1b15fe30 */
   public void moveUp() {
      // TODO: implement
   }
   
   /** @pdOid 23daf61b-ede8-4018-9a83-d70ff3753d45 */
   public void moveDown() {
      // TODO: implement
   }
   
   /** @pdOid e0f6b145-e172-4cf0-b7e6-9089e4a9fef1 */
   public void moveLeft() {
      // TODO: implement
   }
   
   /** @pdOid 82f64b90-a967-4041-b09b-0371b24f74d7 */
   public void moveRight() {
      // TODO: implement
   }
   
   /** @pdOid 27b32578-9f15-49b1-8efa-6574a4829e13 */
   public Gun getGun() {
      return gun;
   }
   
   /** @param newGun
    * @pdOid 91d99d15-9513-453e-aef2-decd6967a5e7 */
   public void setGun(Gun newGun) {
      gun = newGun;
   }

}