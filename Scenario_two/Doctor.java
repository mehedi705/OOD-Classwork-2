package Scenario_two;

public class Doctor {

    int salary;
    String performance;

    Doctor(int doctors_salary, String doctors_performance) {
        salary = doctors_salary;
        performance = doctors_performance;
    }

    void Check_report(Report the_report) {
        if (the_report.category == "Normal" && the_report.location == "Green") {
            System.out.println("Forwarded to hospital.");
        }

        if (the_report.category == "Advanced" && the_report.status == "Better") {
            System.out.println("Stay here.");
        }
    }

}
