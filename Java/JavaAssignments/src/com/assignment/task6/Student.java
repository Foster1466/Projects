package com.assignment.task6;

public class Student {

    private String name;
    private String EnrollmentNo;

    public Student(String name, String enrollmentNo){
        this.name=name;
        this.EnrollmentNo=enrollmentNo;
    }

    public void printStudents(){
        System.out.println("Name: "+name);
        System.out.println("Enrollment No: "+EnrollmentNo);
    }

    public static void main(String[] args) {
        Student amay = new Student("Amay", "132");
        amay.printStudents();
    }

}


