package Scenario_two;

/**
 * main_driver
 */
public class main_driver {

    public static void main(String[] args) {

        // Report configuire
        Report report1 = new Report("Normal", "Green", "Good");
        Report report2 = new Report("Advanced", "Red", "Better");

        // Doctor configuire
        Doctor doctor1 = new Doctor(5000, "Good");

        // Chairman configuire
        Chairman chairman1 = new Chairman();

        // check Reports
        doctor1.Check_report(report1);
        doctor1.Check_report(report2);

        // Chairman can check doctor's performance
        chairman1.Check_doctors_performance(doctor1);

        System.out.println(doctor1.salary);

        System.exit(0);
    }
}