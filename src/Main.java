import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id= in.nextInt();
            String name = in.next();
            double cgpa = in.nextDouble();

            studentList.add(new Student(id,name,cgpa));
            testCases--;
        }
        //sıralama
        Collections.sort(studentList,new Comparator<Student>(){
            @Override
                    public int compare(Student s1,Student s2){
                if(Double.compare(s2.cgpa,s1.cgpa)!=0){
                    return Double.compare(s2.cgpa,s1.cgpa);
                }else if (!s1.name.equals(s2.name)){
                    return s1.name.compareTo(s2.name);
                }else{
                    return Integer.compare(s1.id,s2.id);
                }
            }
        });
        for(Student st : studentList){
            System.out.println(st.name);
        }

    }
    static class Student {
        int id;
        String name;
        double cgpa; //ort.
        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
    }
}