package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();

        student.setSFS("Владимир Владимирович Путин");
        student.setGroup("1A");
        student.setDateOfReceipt("01.01.1970");

        System.out.println(student.getSFS() + " поступил в группу " + student.getGroup() + " " + student.getDateOfReceipt());
    }
}
