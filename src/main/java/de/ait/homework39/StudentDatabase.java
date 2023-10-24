package de.ait.homework39;

import java.util.HashSet;
import java.util.Set;

public class StudentDatabase {

    private Set<Student> students;

    public StudentDatabase() {
        students = new HashSet<>();
    }

    public boolean addStudent(Student student) {
        if (!containsStudent(student)) {
            students.add(student);
            System.out.println("Студент " + student.getName() + " добавлен в базу данных.");
            return true;
        } else {
            System.out.println("Студент " + student.getName() + " уже существует в базе данных.");
            return false;
        }
    }

    public boolean removeStudent(Student student) {
        if (containsStudent(student)) {
            students.remove(student);
            System.out.println("Студент " + student.getName() + " удален из базы данных.");
            return true;
        } else {
            System.out.println("Студент " + student.getName() + " не найден в базе данных.");
            return false;
        }
    } //должен удалять объект Student из students, если он там есть.

    public boolean containsStudent(Student student) {
        return students.contains(student);

    }// должен проверять, содержится ли объект Student в students.

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }// должен выводить на экран данные всех студентов в students.
    }
}
