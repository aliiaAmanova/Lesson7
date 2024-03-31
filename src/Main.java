public class Main {
    public static void main(String[] args) {
     Hero[]heroes = {new Magic(400, 50, "MAGIC SPELLS"), new Medic(500, 0, "HEAL"), new Warrior(700, 100, "CRITICAL DAMAGE")};

        for (Hero hero:heroes) {
            hero.applySuperAbility();
            
            if (hero instanceof Medic){
                ((Medic)hero). increaseExperience();

            }
        }
    }
}