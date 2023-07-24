package co.devskills.springbootboilerplate;

public class AssessedIncomeDetails {
    private String ssn;
    private int assessedIncome;

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getAssessedIncome() {
        return assessedIncome;
    }

    public void setAssessedIncome(int assessedIncome) {
        this.assessedIncome = assessedIncome;
    }
}
