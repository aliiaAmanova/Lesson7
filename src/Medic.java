public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEAL");

    }

    public void increaseExperience() {
        this.healPoints += this.healPoints * 0.1;

    }
    public int getHealPoint(){
        return healPoints;
    }
}