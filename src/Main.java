import java.util.*;
//https://www.hackerrank.com/challenges/java-priority-queue/problem?isFullScreen=true
public class Main {

    static class Student {
        private String name;
        private double cgpa;
        private int id;

        public Student(String name, double cgpa, int id) {
            this.name = name;
            this.cgpa = cgpa;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public double getCgpa() {
            return cgpa;
        }

        public int getId() {
            return id;
        }
    }

    static class Priorities {
        public List<Student> getStudents(List<String> events) {
            PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    //CGPA'ya göre azalan
                    if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
                        return Double.compare(s2.getCgpa(), s1.getCgpa());
                    }
                    //cgpa'lar eşitse, isimlere göre
                    if (!s1.getName().equals(s2.getName())) {
                        return s1.getName().compareTo(s2.getName());
                    }
                    //isimler eşitse id'ye göre
                    return Integer.compare(s1.getId(), s2.getId());
                }
            });

            for (String event : events) {
                String[] eventDetails = event.split(" "); // bosluk
                if (eventDetails[0].equals("ENTER")) {
                    String name = eventDetails[1];
                    double cgpa = Double.parseDouble(eventDetails[2]);
                    int id = Integer.parseInt(eventDetails[3]);

                    // ogr ekle
                    Student student = new Student(name, cgpa, id);
                    pq.add(student);
                } else if (eventDetails[0].equals("SERVED")) {
                    //en yüksek öncelikliyi çıkar
                    pq.poll();
                }
            }

            //sıralı öğrencileri listeye ekle
            List<Student> students = new ArrayList<>();
            while (!pq.isEmpty()) {
                students.add(pq.poll());
            }
            return students;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Priorities priorities = new Priorities();

        int totalEvents = Integer.parseInt(scanner.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- > 0) {
            String event = scanner.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events); // ogr al

        //sonuçlar
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }

        scanner.close();
    }
}
