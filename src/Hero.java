public abstract class Hero implements HavingSuperAbility {
   private int health;
   private int damage;
   private typeOfAbility ability;





   public int getHealth() {
      return health;
   }

   public void setHealth(int health) {
      this.health = health;
   }

   public int getDamage() {
      return damage;
   }

   public void setDamage(int damage) {
      this.damage = damage;
   }

   public typeOfAbility getAbility() {
      return ability;
   }

   public void setAbility(typeOfAbility ability) {
      this.ability = ability;
   }

   public abstract void applyAbility();
}




