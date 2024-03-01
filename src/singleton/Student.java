package singleton;

public class Student {

    private static Student student = null;

    private Student(){

    }

    public static Student getStudent(){
        if(student==null){
            // use synchronized block to maintain thread safety
            synchronized (Student.class){
                if (student == null) student  = new Student();
            }

        }
        return student;
    }

    /*
            1. Constructor should be private
            2. Creation of object is done using static/factory method
            3. Create field to store the object in private
     */
}
