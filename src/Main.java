public class Main {
    public static void main(String[] args) {
        int tranche = 1100;
        int bonus;
        if (tranche > 1000) {
            bonus = tranche / 100;
        } else {
            bonus = 0 / tranche;
        }
                System.out.println(bonus);
    }
}
