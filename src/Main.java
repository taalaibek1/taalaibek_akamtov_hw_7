public class Main {

    public static void main(String[] args) {

        Hero[] heroes = {new Warrior(), new Magic(), new Medic()};
        for(int i =0; i<heroes.length; i++){
            if(!(heroes[i] instanceof Medic)){
                useAbility(heroes[i]);
            }
            Medic medic = (Medic) heroes[2];
            medic.increaseExperience();
            useAbility(medic);
        }


    }

    public static void useAbility(HavingSuperAbility ability){
        ability.applyAbility();
    }


}
