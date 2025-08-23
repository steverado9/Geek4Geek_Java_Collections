// Creating an EnumSet

import java.util.EnumSet;

enum Student { Geek1, Geek2, Geek3, Geek4, Geek5}
class EnumSetExample {
    public static void main(String[] args) {
        //Create an EnumSet containing specific elements
        EnumSet<Student> e = EnumSet.of(Student.Geek1, Student.Geek2, Student.Geek3);

        System.out.println("EnumSet: " + e);
    }
}
