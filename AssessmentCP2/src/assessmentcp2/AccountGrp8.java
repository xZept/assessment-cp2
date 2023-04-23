package assessmentcp2;

public abstract class AccountGrp8 {
    
    private int number;
    private String address;
    private String name;
    
    public AccountGrp8(){
        this.name = getAccName();
        this.address = getAdd();
        this.number = getAccNum();
    
    }
    
        public int getAccNum() {
            number = 1234;
            return number;
        }

        public String getAccName() {
            name = "Shaan Masangcap";
            return name;
        }

        public String getAdd() {
            address = "Balanga City";
            return address;
        }
     
   
    //public abstract void withdrawAcct();
    
    //public abstract void depositAcct();   
}
