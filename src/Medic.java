public class Medic extends Hero{
    private int healPoints;

    public Medic(int health, int damage, String superAbility, int healPoints) {
        super(health, damage, superAbility);
        this.healPoints = healPoints;
    }
    public int increaseExperience(){
        int percent = (((10 * healPoints) / 100) + healPoints);
        return healPoints + percent;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public String info() {
        return super.info() + " " + getHealPoints();
    }
}
