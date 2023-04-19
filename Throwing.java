public abstract class Throwing implements Weapon{   // метание
    int range;                                      // расстояние(радиус)

    public Throwing(int range) {
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    @Override
    public String toString() {
        return String.format("Метательное. Урон: %d. Расстояние: %d", damage(), getRange());
    }
}