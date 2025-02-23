public class Student {
    String firstName, lastName, birthDate, address, className;
    double oop, projectManagement, machineLearning, database, appDev;

    public Student(String firstName, String lastName, String birthDate, String address, String className, 
                   double oop, double projectManagement, double machineLearning, double database, double appDev) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.className = className;
        this.oop = oop;
        this.projectManagement = projectManagement;
        this.machineLearning = machineLearning;
        this.database = database;
        this.appDev = appDev;
    }

    public double getAverageScore() {
        return (oop + projectManagement + machineLearning + database + appDev) / 5;
    }

    public String getRank() {
        double avg = getAverageScore();
        if (avg >= 8.5) return "A";
        else if (avg >= 7) return "B";
        else if (avg >= 5.5) return "C";
        else if (avg >= 4) return "D";
        else return "<D";
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - Diem: " + getRank();
    }
}
