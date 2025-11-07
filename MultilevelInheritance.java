class School {
    void school() {
        System.out.println("This is a school");
    }
}

class Teacher extends School {
    void teacher() {
        System.out.println("The teacher teaches in the school");
    }
}

class Student extends Teacher {
    void student() {
        System.out.println("The student studies in the school");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Student student = new Student();
        student.school();   
        student.teacher();  
        student.student();  
    }
}
