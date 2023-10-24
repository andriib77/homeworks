package de.ait.homework39;

import java.util.HashSet;
import java.util.Set;

public class StudentDB {
    public static void main(String[] args) {

        StudentDatabase database = new StudentDatabase();
        Student student = new Student("Inga Müller", 18);
        Student student2 = new Student("Inga Müller", 18);
        Student student3 = new Student("Paul Schwarz", 21);
        Student student4 = new Student("Tom Schwab", 23);
        Student student5 = new Student("Anna Schwarz", 19);

        database.addStudent(student);
        database.addStudent(student2);
        database.addStudent(student3);
        database.addStudent(student4);
        database.addStudent(student5);

        System.out.println("-------------");

        database.printAllStudents(); //Выведите всех студентов в базе данных

        System.out.println("-------------");

        Student student6 = new Student("Anton Antonov", 25);
        database.addStudent(student6);
        System.out.println("-------------");
        database.printAllStudents(); //Выведите всех студентов в базе данных*/
        database.removeStudent(student2);
        System.out.println("-------------");
        database.printAllStudents(); //Выведите всех студентов в базе данных*/
    }

}

