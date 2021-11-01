/***********************************************************************
 * Module:  Game.java
 * Author:  user
 * Purpose: Defines the Class Game
 ***********************************************************************/

import java.util.*;

/** @pdOid 36c6bc45-09cd-405c-bbd4-52480fdd88db */
public class Game {
   /** @pdOid b3a669d0-6f4f-4f1a-a512-0825e8e3884e */
   private int fps;
   /** @pdOid d6ccf948-726f-4ac6-bd94-c74d9cf4c7bb */
   private int width;
   /** @pdOid ad210c45-6a12-45a1-ac89-f812b91c9ff8 */
   private int height;
   /** @pdOid 3de04adc-7e3e-4f49-8f3b-93d3a4aaccc3 */
   private Level level;
   /** @pdOid 67d8b15d-65cb-40a8-9f17-44fb7ac6ba72 */
   private Space space;
   /** @pdOid 346c0cc3-aa03-4101-8349-dc0610180acf */
   private Player player;
   
   /** @pdRoleInfo migr=no name=Space assc=association5 mult=0..1 type=Composition */
   public Space canbein1;
   /** @pdRoleInfo migr=no name=Player assc=association6 mult=1..1 type=Composition */
   public Player canbein;
   /** @pdRoleInfo migr=no name=Level assc=association9 mult=1..1 type=Composition */
   public Level atleasthas;
   /** @pdRoleInfo migr=no name=Enemy assc=association10 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Enemy> Enemy;
   
   /** @pdOid 0772a393-dd29-4e3e-9ac7-c2d656d2f965 */
   public Game Game() {
      // TODO: implement
   }
   
   /** @pdOid b623f086-f471-41dd-9491-fd40377477af */
   public static int draw() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 1c6125ee-b95f-460c-8a9c-f7d912d1ed0a */
   public static int animate() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 0c3bea1c-0d88-4977-847e-f69cf3a9c6d1 */
   public Level getLevel() {
      return level;
   }
   
   /** @param newLevel
    * @pdOid 342453ad-3198-412d-a547-49fbe68d0f94 */
   public void setLevel(Level newLevel) {
      level = newLevel;
   }
   
   /** @pdOid 73440a37-cca2-4e1f-b9fc-a1268793efbe */
   public Space getSpace() {
      return space;
   }
   
   /** @param newSpace
    * @pdOid 336cbdd1-e258-4226-b06a-1e388339d963 */
   public void setSpace(Space newSpace) {
      space = newSpace;
   }
   
   /** @pdOid 518f4fea-38c9-4b6b-8f02-dce69c1808cd */
   public Player getPlayer() {
      return player;
   }
   
   /** @param newPlayer
    * @pdOid 6f3316ad-b5dc-4bbd-be7e-4158dbbb5322 */
   public void setPlayer(Player newPlayer) {
      player = newPlayer;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Enemy> getEnemy() {
      if (Enemy == null)
         Enemy = new java.util.HashSet<Enemy>();
      return Enemy;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEnemy() {
      if (Enemy == null)
         Enemy = new java.util.HashSet<Enemy>();
      return Enemy.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEnemy */
   public void setEnemy(java.util.Collection<Enemy> newEnemy) {
      removeAllEnemy();
      for (java.util.Iterator iter = newEnemy.iterator(); iter.hasNext();)
         addEnemy((Enemy)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEnemy */
   public void addEnemy(Enemy newEnemy) {
      if (newEnemy == null)
         return;
      if (this.Enemy == null)
         this.Enemy = new java.util.HashSet<Enemy>();
      if (!this.Enemy.contains(newEnemy))
         this.Enemy.add(newEnemy);
   }
   
   /** @pdGenerated default remove
     * @param oldEnemy */
   public void removeEnemy(Enemy oldEnemy) {
      if (oldEnemy == null)
         return;
      if (this.Enemy != null)
         if (this.Enemy.contains(oldEnemy))
            this.Enemy.remove(oldEnemy);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEnemy() {
      if (Enemy != null)
         Enemy.clear();
   }

}