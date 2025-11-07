class School{
    void school(){
        System.out.println("this is school");
    }
}
class Teacher extends School{
    void teacher(){
        System.out.println(" the Teacher teaches in  the school");
    }
}
class Student extends Teacher{
    void student(){
        System.out.println(" the Student studies in  the school");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args){
        Student student = new Student();
        student.school();
        student.teacher();
        student.student();
    }
    
}
