package co.devskills.springbootboilerplate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/credit-data")
public class CreditDataController {

    private final Map<String, CreditData> creditDataMap = new HashMap<>();
    private final Map<String, PersonalDetails> personalDetailsMap = new HashMap<>();
    private final Map<String, AssessedIncomeDetails> assessedIncomeDetailsMap = new HashMap<>();
    private final Map<String, DebtDetails> debtDetailsMap = new HashMap<>();

    public CreditDataController() {
        populateMockData();
    }

    @GetMapping(value = "/ping")
    @ResponseStatus(HttpStatus.OK)
    public String healthCheck(){
        return "pong";
    }

    @GetMapping("/credit-data/{ssn}")
    public ResponseEntity<CreditData> getCreditData(@PathVariable String ssn) {
        CreditData creditData = creditDataMap.get(ssn);
        if (creditData != null) {
            return ResponseEntity.ok(creditData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/personal-details/{ssn}")
    public ResponseEntity<PersonalDetails> getPersonalDetails(@PathVariable String ssn) {
        PersonalDetails personalDetails = personalDetailsMap.get(ssn);

        if (personalDetails != null) {
            return ResponseEntity.ok(personalDetails);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/assessed-income/{ssn}")
    public ResponseEntity<AssessedIncomeDetails> getAssessedIncome(@PathVariable String ssn) {
        AssessedIncomeDetails assessedIncomeDetails = assessedIncomeDetailsMap.get(ssn);

        if (assessedIncomeDetails != null) {
            return ResponseEntity.ok(assessedIncomeDetails);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/debt/{ssn}")
    public ResponseEntity<DebtDetails> getDebtDetails(@PathVariable String ssn) {
        DebtDetails debtDetails = debtDetailsMap.get(ssn);

        if (debtDetails != null) {
            return ResponseEntity.ok(debtDetails);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    private void populateMockData() {
        CreditData emmaCreditData = new CreditData();
        emmaCreditData.setSsn("424-11-9327");
        emmaCreditData.setFirstName("Emma");
        emmaCreditData.setLastName("Gautrey");
        emmaCreditData.setAddress("09 Westend Terrace");
        emmaCreditData.setAssessedIncome(60668);
        emmaCreditData.setBalanceOfDebt(11585);
        emmaCreditData.setComplaints(true);
        creditDataMap.put(emmaCreditData.getSsn(), emmaCreditData);

        PersonalDetails emmaPersonalDetails = new PersonalDetails();
        emmaPersonalDetails.setSsn("424-11-9327");
        emmaPersonalDetails.setFirstName("Emma");
        emmaPersonalDetails.setLastName("Gautrey");
        emmaPersonalDetails.setAddress("09 Westend Terrace");
        personalDetailsMap.put(emmaPersonalDetails.getSsn(), emmaPersonalDetails);

        AssessedIncomeDetails emmaAssessedIncomeDetails = new AssessedIncomeDetails();
        emmaAssessedIncomeDetails.setSsn("424-11-9327");
        emmaAssessedIncomeDetails.setAssessedIncome(60668);
        assessedIncomeDetailsMap.put(emmaAssessedIncomeDetails.getSsn(), emmaAssessedIncomeDetails);

        DebtDetails emmaDebtDetails = new DebtDetails();
        emmaDebtDetails.setSsn("424-11-9327");
        emmaDebtDetails.setBalanceOfDebt(11585);
        emmaDebtDetails.setComplaints(true);
        debtDetailsMap.put(emmaDebtDetails.getSsn(), emmaDebtDetails);
    }
}
