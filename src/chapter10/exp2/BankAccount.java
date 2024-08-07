package chapter10.exp2;

public class BankAccount {
    private int credit;
    private int accNumber;
    private String accName;
    private long balance;

    public BankAccount() {
    }

    public BankAccount(int credit) {
        this.credit = credit;
    }

    public BankAccount(int credit, int accNumber, String accName, long balance) {
        this.credit = credit;
        this.accNumber = accNumber;
        this.accName = accName;
        this.balance = balance;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    //nap tien
    public void deposit(long amount) throws InvalidAmountException {
        if(amount > 0){
            this.balance += amount;
            System.out.println("Nạp tiền thành công");
        }else {
            String msg = "Số tiền nạp không hợp lệ: " + amount;
            throw new InvalidAmountException(msg, amount);
        }
    }

    //rut tien
    public void withdraw(long amount) throws InvalidAmountException {
        //nếu số tiền chuyển hợp lệ và nhỏ hơn số dư
        if(isValid(amount)){
            this.balance -= amount;
            System.out.println("Rút tiền hoàn tất");
        }else {
            String msg = "Rút tiền thất bại: " + amount;
            throw new InvalidAmountException(msg, amount);
        }
    }

    //chuyen tien
    public void transfer(long amount, BankAccount otherAcc) throws InvalidAmountException {
        if (isValid(amount)) {
            this.balance -= amount;
            //otherAcc.balance += amount;
            otherAcc.deposit(amount);
            System.out.println(STR."Chuyển \{amount} VNĐ thành công đến tài khoản \{otherAcc.getAccName()}");
        }else {
            String msg = "Số tiền giao dịch không hợp lệ" + amount;
            throw new InvalidAmountException(msg, amount);
        }
    }


    //thanh toan hoa don
    public void payBill(long amount) throws InvalidAmountException {
        if(isValid(amount)){
            this.balance -= amount;
            System.out.println("Thanh toán hóa đơn thành công");
        }else {
            String msg = "Thanh toán thất bại: " + amount;
            throw new InvalidAmountException(msg, amount);
        }
    }

    private boolean isValid(long amount) {
        return amount >= 0 && amount <= balance;
    }
}
