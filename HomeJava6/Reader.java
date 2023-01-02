package HomeJava6;

import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    private String name = "Alex";
    private String surName = "Bobkin";
    private String patronymic = "Ilich";

    private String readerTicketNumber = "123321h";

    private String faculty = "Информационные технологии";

    private String birth = "07.01.1991";

    private String numTelephone = "89371709380";

    static ArrayList<Reader> listReader = new ArrayList<>();

    public Reader(String surName, String name, String patronymic) {
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        Scanner iScanner = new Scanner(System.in);
        questionnaire(iScanner);
        listReader.add(this);
    }

    private void questionnaire(Scanner iScanner) {
        System.out.printf("Номер читательского билета: ");
        this.readerTicketNumber = iScanner.nextLine();

        System.out.printf("Факультет: ");
        this.faculty = iScanner.nextLine();

        System.out.printf("Дата рождения: ");
        this.birth = iScanner.nextLine();

        System.out.printf("Номер телефона: ");
        this.numTelephone = iScanner.nextLine();

      //  iScanner.close();
    }

    public void getName() {
        System.out.println(name); 
    }

    public void getSurName() {
        System.out.println(surName);
    }

    public void getPatronymic() {
        System.out.println(patronymic); 
    }

    public void getReaderTicketNumber() {
        System.out.println(readerTicketNumber); 
    }

    public void getFaculty() {
        System.out.println(faculty); 
    }

    public void getBirth() {
        System.out.println(birth); 
    }

    public void getNumTelephone() {
        System.out.println(numTelephone);
    }

    public void takeBook(int quantity) {
        char name = this.name.charAt(0);
        char patronymic = this.patronymic.charAt(0);
        System.out.printf("Читатель %s %s. %s. взял %d книг.", this.surName, name, patronymic, quantity);
    }
    
    public void takeBook(String... booksNames) {
        char name = this.name.charAt(0);
        char patronymic = this.patronymic.charAt(0);
        System.out.printf("Читатель %s %s. %s. взял такие книги: ", this.surName, name, patronymic);
        for (int i = 0; i < booksNames.length; i++) {
            if (i != booksNames.length - 1) {
                System.out.printf(booksNames[i] + ", ");
            } else {
                System.out.printf(booksNames[i]);
            }
        }
    }

    public void takeBook(Book... booksNames) {
        char name = this.name.charAt(0);
        char patronymic = this.patronymic.charAt(0);
        System.out.printf("Читатель %s %s. %s. взял такие книги: ", this.surName, name, patronymic);
        for (int i = 0; i < booksNames.length; i++) {
            if (i != booksNames.length - 1) {
                System.out.printf(booksNames[i] + ", ");
            } else {
                System.out.print(booksNames[i]);
            }
        }
    }

    public void returnBook(int quantity) {
        char name = this.name.charAt(0);
        char patronymic = this.patronymic.charAt(0);
        System.out.printf("Читатель %s %s. %s. вернул %d книг.", this.surName, name, patronymic, quantity);
    }
    
    public void returnBook(String... booksNames) {
        char name = this.name.charAt(0);
        char patronymic = this.patronymic.charAt(0);
        System.out.printf("Читатель %s %s. %s. вернул такие книги: ", this.surName, name, patronymic);
        for (int i = 0; i < booksNames.length; i++) {
            if (i != booksNames.length - 1) {
                System.out.printf(booksNames[i] + ", ");
            } else {
                System.out.printf(booksNames[i]);
            }
        }
    }

    public void returnBook(Book... booksNames) {
        char name = this.name.charAt(0);
        char patronymic = this.patronymic.charAt(0);
        System.out.printf("Читатель %s %s. %s. вернул такие книги: ", this.surName, name, patronymic);
        for (int i = 0; i < booksNames.length; i++) {
            if (i != booksNames.length - 1) {
                System.out.printf(booksNames[i] + ", ");
            } else {
                System.out.print(booksNames[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Читатель: имя = " + name + ", фамилия = " + surName + ", отчество = " + patronymic + ", номер читательского билета = "
                + readerTicketNumber + ", факультет = " + faculty + ", год рождения = " + birth + ", номер телефона = " + numTelephone;
    }

    
}
