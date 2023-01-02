package HomeJava6;

import java.util.Map.Entry;

// Определить класс Reader, хранящий такую информацию о пользователе библиотеки:

// ФИО,
// номер читательского билета,
// факультет,
// дата рождения,
// телефон.
// Методы (экземпляра, без слова static) takeBook(), returnBook().
// Разработать программу, в которой создается массив объектов данного класса.
// Перегрузить методы takeBook(), returnBook():
// takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
// takeBook,который будет принимать переменное количество названий книг.Выводит на консоль сообщение"Петров В. В. взял книги: Приключения, 
// Словарь, Энциклопедия".
// takeBook,который будет принимать переменное количество(Тип...parameterName)объектов класса Book(создать новый класс,содержащий имя и 
// автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
// Аналогичным образом перегрузить метод returnBook().Выводит на консоль сообщение"Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
// Или "Петров В. В. вернул 3 книги".

public class Main {
    public static void main(String[] args) {
        Reader Alex = new Reader("Bobkin", "Alex", "Ilich");
        Alex.getName();
        Alex.getSurName();
        Alex.getPatronymic();
        Alex.getFaculty();
        Alex.getNumTelephone();
        Alex.getReaderTicketNumber();
        Alex.getBirth();

        Reader Bob = new Reader("Smit", "Bob", "Bober");
        Bob.getName();
        Bob.getSurName();
        Bob.getPatronymic();

        Alex.takeBook(6);
        System.out.println();
        Alex.takeBook("Приключения Бубоньки", "Словарь русского языка", "Энциклопедия планеты Земля", "Бесконечный ужас");

        System.out.println();
        Alex.returnBook(6);
        System.out.println();
        Alex.returnBook("Приключения Бубоньки", "Словарь русского языка", "Энциклопедия планеты Земля", "Бесконечный ужас");

        Book a = new Book("Приключения Бубоньки", "Марс Насретдинов");
        Book b = new Book("Словарь русского языка", "Профессор Зануда");
        Book c = new Book("Энциклопедия планеты Земля", "Профессор Мегазануда");
        Book d = new Book("Бесконечный ужас", "Какой то китаец");
        Book e = new Book("Выжить вопреки", "Не помню");
        Book f = new Book("Нарния", "Не помню");

        System.out.println();
        
        a.getNameAuthorBook();
        a.getNameBook();

        System.out.println();
        System.out.println();

        Alex.takeBook(a, b, c, d, e, f);
        System.out.println();
        System.out.println();

        Alex.returnBook(a, b, c, d, e, f);
        System.out.println();
        System.out.println();

        for (Entry<String, String> qwe : Book.list.entrySet()) {
            System.out.println(qwe);
        }

        System.out.println();
        System.out.println(Reader.listReader);
    }
}
