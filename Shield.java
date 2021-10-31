/***********************************************************************
 * Module:  Shield.java
 * Author:  user
 * Purpose: Defines the Class Shield
 ***********************************************************************/

import java.util.*;

/** @pdOid 5ef5e0d8-82c1-4f74-a38e-af95159a3498 */
public class Shield extends Object {
   /** @pdOid 98ca9d25-0d9d-42ca-b3d7-2e9d4943e49c */
   private int strength;
   
   /** @param posX 
    * @param posY
    * @pdOid 2e57f171-3842-47d5-97af-8ab2b64662d5 */
   public Shield(int posX, int posY) {
      // TODO: implement
   }
   
   /** @pdOid c952bd69-d62e-4588-9dbc-b126cc834812 */
   public int getStrength() {
      return strength;
   }
   
   /** @param newStrength
    * @pdOid b4d74052-e098-4752-89b0-88b19afe3347 */
   public void setStrength(int newStrength) {
      strength = newStrength;
   }

}