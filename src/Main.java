public class Main {
    public static void main(String[] args) {
        int currentClientBalance = 2_000_000_000;
        int transferAmount = 500_000_000;
        int result = currentClientBalance + transferAmount;
        System.out.println("Текущий счёт: " + result);
    }
}

