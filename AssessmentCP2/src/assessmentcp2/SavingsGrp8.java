package assessmentcp2;

public class SavingsGrp8 extends AccountGrp8 {
    private int accountNumber = 1234;
    private double initialAmount = 3000.0;
    private String accountName = "Shaan Masangcap", address = "Balanga City";
    
    public int getAccNum() {
            return accountNumber;
        }

        public double getInitialAmount() {
            return initialAmount;
        }

        public String getAccName() {
            return accountName;
        }

        public String getAdd() {
            return address;
        }
    
}
