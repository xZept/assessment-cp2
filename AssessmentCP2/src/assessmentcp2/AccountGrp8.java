package assessmentcp2;

public abstract class AccountGrp8 {
    
    // Encapsulated constant variables
    private final String name;
    private final String address;
    private final int number;
    
    // Assigns values to the variables
    public AccountGrp8() {
        this.name = "Shaan Masangcap";
        this.address = "Balanga City";
        this.number = 1234;
    }
    
    // Getter methods to return the encapsulated values
    public String getAccName() {
        return name;
    }

    public String getAdd() {
        return address;
    }
    
    public int getAccNum() {
        return number;
    }
        
    // Body is defined at the child class, SavingsGrp8
    public abstract void withdrawAcct();
    public abstract void depositAcct();
}
