public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic(300, 25, " HEALING: ",50);
        Magic magic = new Magic(600, 40,"BOOST");
        Warrior warrior = new Warrior(500, 50,"CRITICAL DAMAGE");

        Hero[] heroes = {medic, warrior, magic};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].info());
            heroes[i].applySuperAbility();
            if (heroes[i] instanceof Medic) {
                System.out.println(((Medic) heroes[i]).getHealPoints());
                ((Medic)heroes[i]).increaseExperience();
                System.out.println(((Medic) heroes[i]).getHealPoints());
            }
        }
    }
}