public class ClassesAndObjects{
    public static void main(String[] args) {
    Student s1= new Student();
    s1.name="Kapil";
    s1.rollNo=123;
    s1.marks[0]=100;
    s1.marks[1]=90;
    s1.marks[2]=80;
    //new constructor
    Student s2= new Student(s1);
    s2.password="xyz";
    System.out.println(s2.name);
    System.out.println(s2.password);
    for(int i=0;i<3;i++){
        System.out.print(s2.marks[i]+" ");
    }
    s1.marks[2]=100;
    System.out.println();
    for(int i=0;i<3;i++){
        System.out.print(s2.marks[i]+" ");
    }
    }
}
class Student{
    String name;
    int rollNo;
    String password;
    int[] marks;

    Student(){
        marks = new int[3];
    }
    // shallow copy constructor
    Student(Student s1){
      this.name =s1.name;
      this.rollNo = s1.rollNo;
      marks = new int[3];
      this.marks=s1.marks;
    }

    //Deep copy constructor
      
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo;
    //     marks = new int[3];
    //     for(int i=0;i<3;i++){
    //         this.marks[i]=s1.marks[i];
    //     }
    // }
}