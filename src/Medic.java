public class Medic extends Hero{
   private  int healPoints;

   public Medic(){

       this.healPoints=100;
   }

    @Override
    public  void applyAbility() {
        System.out.println("Medic used ability: " + typeOfAbility.HEALING + " " + healPoints);
    }
    public  void increaseExperience(){
        healPoints += healPoints*0.1;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
}
