/***********************************************************************
 * Module:  Gun.java
 * Author:  user
 * Purpose: Defines the Class Gun
 ***********************************************************************/

import java.util.*;

/** @pdOid 9182b946-f98e-4d8c-8031-be73b41ed3d4 */
public class Gun extends Object {
   /** @pdOid 3a9dd751-c45d-4ee0-9a9b-336eb485f98d */
   private int damage;
   /** @pdOid 29ad9d8b-aef1-477e-91d6-2b9bcaf197a9 */
   private int ammo;
   
   /** @pdRoleInfo migr=no name=Bullet assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Bullet> bullet;
   
   /** @pdOid 407048ca-2d9b-425c-a671-376d88f27693 */
   public Gun() {
      // TODO: implement
   }
   
   /** @param posX 
    * @param posY
    * @pdOid 51ad00fa-978b-4b8b-af16-8756a278ecde */
   public Gun(int posX, int posY) {
      // TODO: implement
   }
   
   /** @pdOid 5a7a6222-7e19-4674-9c68-6f7b983bf6ee */
   public int getDamage() {
      return damage;
   }
   
   /** @param newDamage
    * @pdOid 1f6624b6-a378-4aaf-a46b-d5e75a033540 */
   public void setDamage(int newDamage) {
      damage = newDamage;
   }
   
   /** @pdOid 85af7ecb-d066-4604-a724-fa678c449ea3 */
   public int getAmmo() {
      return ammo;
   }
   
   /** @param newAmmo
    * @pdOid cf9bafab-40bd-4ca6-88b0-ca2abfa321de */
   public void setAmmo(int newAmmo) {
      ammo = newAmmo;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Bullet> getBullet() {
      if (bullet == null)
         bullet = new java.util.HashSet<Bullet>();
      return bullet;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBullet() {
      if (bullet == null)
         bullet = new java.util.HashSet<Bullet>();
      return bullet.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBullet */
   public void setBullet(java.util.Collection<Bullet> newBullet) {
      removeAllBullet();
      for (java.util.Iterator iter = newBullet.iterator(); iter.hasNext();)
         addBullet((Bullet)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBullet */
   public void addBullet(Bullet newBullet) {
      if (newBullet == null)
         return;
      if (this.bullet == null)
         this.bullet = new java.util.HashSet<Bullet>();
      if (!this.bullet.contains(newBullet))
         this.bullet.add(newBullet);
   }
   
   /** @pdGenerated default remove
     * @param oldBullet */
   public void removeBullet(Bullet oldBullet) {
      if (oldBullet == null)
         return;
      if (this.bullet != null)
         if (this.bullet.contains(oldBullet))
            this.bullet.remove(oldBullet);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBullet() {
      if (bullet != null)
         bullet.clear();
   }

}