public class Battle {
    private Warrior attacker;         // атакующий
    private Warrior defender;         // защитник

    public Battle(Warrior attacker, Warrior defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    public Warrior run() {            // сама битва
        while (true) {
            int attak = attacker.harm();
            defender.reduceHp(attak);
            System.out.printf("Воин %s наносит %d очков урона \nУ воина %s осталось %d hp, ресурс щита: %d\n", attacker.getName(), attak, defender.getName(), defender.getHp(), defender.protect.safetyMargin());
            if (!defender.isAlive()){
                System.out.printf("Воин %s погиб\n", defender.getName());
                System.out.printf("Победитель: \n%s", attacker);
                return attacker;
            }
            int response = defender.harm();    // ответ
            attacker.reduceHp(response);
            System.out.printf("Воин %s дал в ответку на %d очков урона \nУ воина %s осталось %d hp, ресурс щита: %d\n", defender.getName(), response, attacker.getName(), attacker.getHp(), attacker.protect.safetyMargin());
            if (!attacker.isAlive()){
                System.out.printf("Воин %s погиб\n", attacker.getName());
                System.out.printf("Победитель: \n%s", defender);
                return defender;
            }
        }
    }
}