package Seminar6;

//Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//
// 1. ФИО,
// 2. номер читательского билета,
// 3. факультет,
// 4. дата рождения,
// 5. телефон.
// 6. Методы (экземпляра, без слова static)  takeBook(), returnBook().
// 7. Разработать программу, в которой создается массив объектов данного класса.
// 8. Перегрузить методы takeBook(), returnBook():
// - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
// - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
// - takeBook, который будет принимать переменное количество (Тип... parameterName) объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//9. Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".

public class Reader {
    String fistName;
    String lastName;
    Integer id;
    Integer faсulty;
    String birthData;
    String number;

    public Reader(String fistName, String lastName, int id) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.id = id;
    }

    public Reader(String fistName, String lastName, int id, int faсulty, String birthData, String number){
        this(fistName,lastName,id);
        this.faсulty = faсulty;
        this.birthData = birthData;
        this.number = number;
    }
    public Reader(){

    }
    @Override
    public String toString() {
        return "Reader{" +
                "fistName: '" + fistName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", id: " + id +
                ", faсulty: " + faсulty +
                ", birthData: '" + birthData + '\'' +
                ", number: '" + number + '\'' +
                '}';
    }

    public void takeBook(String... books){
        System.out.println(id + "." + fistName + " взял "+ books.length +" книги: ");
        for (String book: books) {
            System.out.println(book);
        }
    }
    public void takeBook(int books){
        System.out.println(id + "." + fistName + " взял "+ books+" книги");
    }

    public void returnBook(String... books){
        System.out.println(id + "." + fistName + " вернул "+ books.length +" книги: ");
        for (String book: books) {
            System.out.println(book);
        }
    }
    public void returnBook(int books){
        System.out.println(id + "." + fistName + " вернул "+ books+" книги");
    }

    public static void main(String[] args) {
        Reader reader1 = new Reader("Alex", "Kim", 1);
        Reader reader2 = new Reader("Sasha", "Law", 2, 1,"21/1/12", "12345");
        Reader reader3 = new Reader();
        Reader reader4 = new Reader("Alex", "Kim", 3,4,"12/03/99","22222");

        System.out.println(reader1);
        System.out.println(reader2);
        System.out.println(reader3);
        System.out.println(reader4);

        String [] books = {"Приключения", "Словарь", "Энциклопедия"};
        reader1.takeBook(3);
        reader2.takeBook(books);
        reader3.returnBook(3);
        reader4.returnBook(books);
    }
}
