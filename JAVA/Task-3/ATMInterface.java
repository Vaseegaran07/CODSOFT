public class ATMInterface {
    public static void main(String[] args) {
        UserAccount account = new UserAccount(1000.00);
        ATM atm = new ATM(account);
        atm.start();
    }
}
