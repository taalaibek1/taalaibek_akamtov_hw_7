public class Warrior extends Hero{

    @Override
    public void applyAbility() {
        System.out.println("Warrior used ability: " + typeOfAbility.STRENGTH);
    }
}
