package co.devskills.springbootboilerplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootBoilerplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBoilerplateApplication.class, args);
		useEndpoints();
	}

	private static void useEndpoints() {

		String baseUrl = "http://localhost:8080/api/credit-data";

		String ssn = "424-11-9327";

		RestTemplate restTemplate = new RestTemplate();

		String pingResponse = restTemplate.getForObject(baseUrl + "/ping", String.class);
		System.out.println("Ping response: " + pingResponse);

		CreditData creditData = restTemplate.getForObject(baseUrl + "/credit-data/" + ssn, CreditData.class);
		System.out.println("Credit Data for SSN " + ssn + ":");
		System.out.println(creditData);

		PersonalDetails personalDetails = restTemplate.getForObject(baseUrl + "/personal-details/" + ssn, PersonalDetails.class);
		System.out.println("Personal Details for SSN " + ssn + ":");
		System.out.println(personalDetails);

		AssessedIncomeDetails assessedIncomeDetails = restTemplate.getForObject(baseUrl + "/assessed-income/" + ssn, AssessedIncomeDetails.class);
		System.out.println("Assessed Income Details for SSN " + ssn + ":");
		System.out.println(assessedIncomeDetails);

		DebtDetails debtDetails = restTemplate.getForObject(baseUrl + "/debt/" + ssn, DebtDetails.class);
		System.out.println("Debt Details for SSN " + ssn + ":");
		System.out.println(debtDetails);
	}

}
