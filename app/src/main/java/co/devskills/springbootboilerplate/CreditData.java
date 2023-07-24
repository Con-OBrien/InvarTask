package co.devskills.springbootboilerplate;

public class CreditData {


    private String ssn;
    private String firstName;
    private String lastName;
    private String address;
    private int assessedIncome;
    private int balanceOfDebt;
    private boolean complaints;

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAssessedIncome() {
        return assessedIncome;
    }

    public void setAssessedIncome(int assessedIncome) {
        this.assessedIncome = assessedIncome;
    }

    public int getBalanceOfDebt() {
        return balanceOfDebt;
    }

    public void setBalanceOfDebt(int balanceOfDebt) {
        this.balanceOfDebt = balanceOfDebt;
    }

    public boolean isComplaints() {
        return complaints;
    }

    public void setComplaints(boolean complaints) {
        this.complaints = complaints;
    }
}


