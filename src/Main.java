public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic(700, 25, " healPoints ",50);
        Magic magic = new Magic(600, 40,"BOOST");
        Warrior warrior = new Warrior(500, 50,"CRITICAL DAMAGE");

        Hero[] hero = {medic, warrior, magic};
        for (int i = 0; i < hero.length; i++) {
            System.out.println(hero[i].info());
            hero[i].applySuperAbility();
            if (hero[i] == medic) {
                System.out.println(medic.increaseExperience());
            }
        }
    }
}