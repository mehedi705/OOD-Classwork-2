package Scenario_two;

public class Chairman {

    void Check_doctors_performance(Doctor the_Doctor) {
        if (the_Doctor.performance == "Good") {
            the_Doctor.salary = 20000;
        }
    }
}
