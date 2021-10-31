/***********************************************************************
 * Module:  NightSpace.java
 * Author:  user
 * Purpose: Defines the Class NightSpace
 ***********************************************************************/

import java.util.*;

/** @pdOid 6c25c122-868d-4bd8-b028-83df9947d0fa */
public class NightSpace implements Space {
   /** @pdOid 04c44870-8053-4dbb-9e8d-69bc81d7c7c8 */
   private String spaceImgName = Night Space;
   
   /** @pdOid 1a22f099-3ac3-40dc-89f2-ee9ef3f9f0d4 */
   public String getSpaceImgName() {
      return spaceImgName;
   }
   
   /** @param newSpaceImgName
    * @pdOid 8b018ef2-f0b0-4d09-849b-b639768bb4ba */
   public void setSpaceImgName(String newSpaceImgName) {
      spaceImgName = newSpaceImgName;
   }

}