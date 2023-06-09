public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefTeam = new Team<>();
        archers.addPers(new Archer("Робин", 100, new WoodShield(), new Bow(20)))         // команда лучников
                .addPers(new Archer("Гуд", 100, new WoodShield(), new Bow(15)));
        thiefTeam.addPers(new Thief("Джек", 150, new MailShield(), new Knife()))               // команда воров
                .addPers(new Thief("Потрошитель", 150, new MailShield(), new Knife()));
        System.out.println(archers);
        System.out.println();
        System.out.println(thiefTeam);
        System.out.println();

        Archer robin = new Archer("Робин", 50, new WoodShield(), new Bow(20));
        Archer gud = new Archer("Гуд", 50, new WoodShield(), new Bow(50));
       
        Battle fight = new Battle(robin,gud);
        fight.run();
    }
}