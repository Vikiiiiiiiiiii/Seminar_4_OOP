public class MailShield extends Shield{

    public MailShield() {
        super("Щит из кольчуги", 100, 70, 1);
    }

    @Override
    public int protection() {
        if (isIntact()) return 100;
        else return 0;
    }

    @Override
        public String toString() {
            StringBuilder res = new StringBuilder();
            res.append(this.name)
                    .append(String.format("\n\t%s", super.toString()));
            return res.toString();
    }
}
