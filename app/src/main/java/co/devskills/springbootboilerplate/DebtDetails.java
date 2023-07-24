package co.devskills.springbootboilerplate;

public class DebtDetails {
    private String ssn;
    private int balanceOfDebt;
    private boolean complaints;

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
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
