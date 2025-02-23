import java.util.*;

public class Classroom {
    String classId;
    List<Student> students = new ArrayList<>();

    public Classroom(String classId) {
        this.classId = classId;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudentList() {
        Map<String, Integer> rankCount = new HashMap<>();
        rankCount.put("A", 0);
        rankCount.put("B", 0);
        rankCount.put("C", 0);
        rankCount.put("D", 0);
        rankCount.put("<D", 0);

        System.out.println("\nDanh sach sinh viên lop " + classId + ":");
        for (Student s : students) {
            System.out.println(s);
            rankCount.put(s.getRank(), rankCount.get(s.getRank()) + 1);
        }

        System.out.println("\n Tong ket xep hang:");
        for (Map.Entry<String, Integer> entry : rankCount.entrySet()) {
            System.out.println("Hang " + entry.getKey() + ": " + entry.getValue() + " sinh vien");
        }
    }
}
