/***********************************************************************
 * Module:  DaySpace.java
 * Author:  user
 * Purpose: Defines the Class DaySpace
 ***********************************************************************/

import java.util.*;

/** @pdOid c5921649-b243-4832-bdee-10ff0a32f7b0 */
public class DaySpace implements Space {
   /** @pdOid ab27c2e4-cc53-4b81-b8ec-a24d5c3c33ac */
   private String spaceImgName = Day Space;
   
   /** @pdOid 19835cb7-4d42-4e12-9103-7bd5f2e93d3d */
   public String getSpaceImgName() {
      return spaceImgName;
   }
   
   /** @param newSpaceImgName
    * @pdOid d64f4b55-ac49-4ba2-876b-4a9848377a54 */
   public void setSpaceImgName(String newSpaceImgName) {
      spaceImgName = newSpaceImgName;
   }

}