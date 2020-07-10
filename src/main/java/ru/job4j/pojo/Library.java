package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book justMasa = new Book("Просто Маса", 100);
        Book planetWater = new Book("Пданета Вода", 200);
        Book cleanCode = new Book("Clean code", 300);
        Book leviafan = new Book("Левиафан", 400);
        Book[] books = new Book[4];
        books[0] = justMasa;
        books[1] = planetWater;
        books[2] = cleanCode;
        books[3] = leviafan;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getBookName() + " - " + bk.getPage());
        }

        System.out.println("Replace");
        Book temp = new Book("a",1);
        temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getBookName() + " - " + bk.getPage());
        }

        System.out.println("Show only Clean code book");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getBookName().equals("Clean code")) {
                System.out.println(bk.getBookName() + " : " + bk.getPage() + " pages");
            }
        }
    }
}
