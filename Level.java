/***********************************************************************
 * Module:  Level.java
 * Author:  user
 * Purpose: Defines the Class Level
 ***********************************************************************/

import java.util.*;

/** @pdOid 8b7dbc31-bd31-4b7d-befb-4689daaf0582 */
public class Level {
   /** @pdOid 7698ea11-2e95-4a4c-9295-23e63c58d473 */
   private String levelName;
   /** @pdOid 0f1f975f-6bea-4dfc-8d1f-6e214f904054 */
   private int enemyNum;
   /** @pdOid 437f0fed-4f51-4444-8fcb-11afa8a85e17 */
   private java.util.Collection<Enemy> enemy;
   
   /** @pdRoleInfo migr=no name=Enemy assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Enemy> canbein;
   
   /** @pdOid abb5098f-7a52-429a-8e49-2bed7e947ad7 */
   public Level() {
      // TODO: implement
   }
   
   /** @pdOid 9771f5a5-b7a6-42a0-8d5e-77e1921cac3f */
   public String getLevelName() {
      return levelName;
   }
   
   /** @param newLevelName
    * @pdOid 682a6b8b-2e16-46cd-8d55-dead1bfa89f4 */
   public void setLevelName(String newLevelName) {
      levelName = newLevelName;
   }
   
   /** @pdOid 5d51b469-6c66-4d43-8b06-c9871cca2426 */
   public int getEnemyNum() {
      return enemyNum;
   }
   
   /** @param newEnemyNum
    * @pdOid 1a635c21-6b5b-4566-875d-f48bb9ddcf6e */
   public void setEnemyNum(int newEnemyNum) {
      enemyNum = newEnemyNum;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Enemy> getCanbein() {
      if (canbein == null)
         canbein = new java.util.HashSet<Enemy>();
      return canbein;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCanbein() {
      if (canbein == null)
         canbein = new java.util.HashSet<Enemy>();
      return canbein.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCanbein */
   public void setCanbein(java.util.Collection<Enemy> newCanbein) {
      removeAllCanbein();
      for (java.util.Iterator iter = newCanbein.iterator(); iter.hasNext();)
         addCanbein((Enemy)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEnemy */
   public void addCanbein(Enemy newEnemy) {
      if (newEnemy == null)
         return;
      if (this.canbein == null)
         this.canbein = new java.util.HashSet<Enemy>();
      if (!this.canbein.contains(newEnemy))
         this.canbein.add(newEnemy);
   }
   
   /** @pdGenerated default remove
     * @param oldEnemy */
   public void removeCanbein(Enemy oldEnemy) {
      if (oldEnemy == null)
         return;
      if (this.canbein != null)
         if (this.canbein.contains(oldEnemy))
            this.canbein.remove(oldEnemy);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCanbein() {
      if (canbein != null)
         canbein.clear();
   }

}