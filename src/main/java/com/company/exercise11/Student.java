package com.company.exercise11;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Student {

        private final static List <Student> STUDENTS = new ArrayList<>();

        private final String name;
        private final int course;

        public Student(String name, int course) {
            this.name = name;
            this.course = course;
        }

        public String getName() {
            return name;
        }

        public int getCourse() {

            return course;
        }


        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (getClass() != obj.getClass()) return false;
            final Student other = (Student) obj;
            if (this.course != other.course) return false;
            return true;
        }

        @Override
        public String toString() {

            return "Student{" + "name=" + name + ", course=" + course + '}';
        }

        public static void printStudent(int course) {
            Iterator <Student> studentIterator = STUDENTS.iterator();
            while(studentIterator.hasNext()){
                Student student = studentIterator.next();
                if (course==student.getCourse()) System.out.println(student);
            }
        }

        public static void addStudent(Student student){
            STUDENTS.add(student);
        }
        public static void deleteStudent(Student student){
            STUDENTS.remove(student);
        }
        public static boolean replaceStudent(Student fromStudent, Student toStudent){
            for (int i = 0; i < STUDENTS.size(); i++) {
                if (STUDENTS.get(i).equals(fromStudent)) {
                    STUDENTS.set(i, toStudent);
                    return true;
                }
            }
            return false;
        }
    }

