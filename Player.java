/***********************************************************************
 * Module:  Player.java
 * Author:  user
 * Purpose: Defines the Class Player
 ***********************************************************************/

import java.util.*;

/** @pdOid a0437ba4-4bd8-47de-b0a3-897f0b15413c */
public class Player extends Plane {
   /** @pdOid 9f034690-8a93-4180-aa28-9798eae330f3 */
   private String playerName;
   
   /** @pdRoleInfo migr=no name=Shield assc=association4 mult=0..1 type=Aggregation */
   public Shield shield;
   
   /** @param posX 
    * @param posY
    * Player
    * @pdOid cce5ee11-10ec-423b-a950-51870d1a96b7 */
   public Player Player(int posX, int posY) {
      // TODO: implement
   }
   
   /** @param strength
    * @pdOid bde3656f-2148-4a6f-8daf-d9d6e0b2adf1 */
   public void setShield(int strength) {
      // TODO: implement
   }
   
   /** @pdOid cbb91bc5-0f96-4412-ad77-1b9d6bb8d6e1 */
   public void fire() {
      // TODO: implement
   }
   
   /** @pdOid a5b6ea83-8c99-429a-8bea-da248cca7a05 */
   public String getPlayerName() {
      return playerName;
   }
   
   /** @param newPlayerName
    * @pdOid 3e7930ec-c29c-4d4e-845e-4c12db58476e */
   public void setPlayerName(String newPlayerName) {
      playerName = newPlayerName;
   }

}