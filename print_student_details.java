package Java_coding_challenges;

public class print_student_details {
    public static void main(String[] args) {
    Student student1 = new Student("Rishabh", 6, "Section-A1");
    Student student2 = new Student("Krishna", 7, "Section-A2");
    Student student3 = new Student("shna", 8, "Section-A3");
    student1.print_student_details();
    student2.print_student_details();
    student3.print_student_details();
}
}

class Student{
    String name;
    int rollNo;
    String section;

    public Student(String name,int rollNo, String section){
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    void print_student_details(){
        System.out.println("-------------Student details------------");
        System.out.println("Name of Student is:"+ name);
        System.out.println("Roll No of Student is:"+ rollNo);
        System.out.println("Section of Student is:"+ section);
    }
}