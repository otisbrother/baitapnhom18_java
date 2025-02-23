import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Classroom> classrooms = new HashMap<>();

        classrooms.put("HTTT1", new Classroom("HTTT1"));
        classrooms.put("HTTT3", new Classroom("HTTT3"));

        classrooms.get("HTTT1").addStudent(new Student("Nguyen Thien", "Huong", "2002-05-10", "Ha Noi", "HTTT1", 9, 8.5, 8, 9, 8.5));
        classrooms.get("HTTT1").addStudent(new Student("Nguyen Huy", "Toa", "2002-06-15", "HCM", "HTTT1", 7, 6.5, 7, 7.5, 6));
        classrooms.get("HTTT3").addStudent(new Student("Nguyen Khanh", "Huyen", "2002-07-20", "Da Nang", "HTTT3", 5, 5.5, 6, 4, 3.5));
       
        while (true) {
            System.out.print("\nNhap ma lop can xem (HTTT1, HTTT3) hoac 'exit' de thoat: ");
            String classId = scanner.nextLine();

            if (classId.equalsIgnoreCase("exit")) break;
            if (classrooms.containsKey(classId)) {
                classrooms.get(classId).showStudentList();
            } else {
                System.out.println(" Lop khong ton tai, vui long nhap lai!");
            }
        }
        scanner.close();
    }
}
