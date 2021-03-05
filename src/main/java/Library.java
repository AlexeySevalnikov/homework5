import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        String[][] massBook = {{"Crime and Punishment", "F.M.Dostoevsky", "208", "497"},
                {"The Master and Margarita", "M.A.Bulgakov", "209", "638"},
                {"The Cherry Orchard", "A.P.Chekhov", "210", "200"},
                {"Brave New World", "O.Huxley", "211", "353"},
                {"The Idiot", "F.M.Dostoevsky", "", "353"},
                {"The Tale of the Fisherman and the Fish", "A.S.Pushkin", "", ""},
                {"Heart of a Dog", "M.A.Bulgakov", "", ""},
                {"The Captain's Daughter", "A.S.Pushkin", "", "250"},
                {"A Hero of Our Time", "M.Yu.Lermontov", "", "300"},
                {"Anna Karenina", "Leo Tolstoy", "", ""}};
        Reader reader = new Reader();
        String[] bookTrue = reader.choiceBook(massBook);
        if (bookTrue[2].equals("") && bookTrue[3].equals("")) {
            Book book = new Book(bookTrue[0], bookTrue[1]);
            System.out.println(book.toString());
        } else if (bookTrue[2].equals("")) {
            Book book = new Book(bookTrue[0], bookTrue[1], bookTrue[3]);
            System.out.println(book.toString());
        } else {
            Book book = new Book(bookTrue[0], bookTrue[1], bookTrue[2], bookTrue[3]);
            System.out.println(book.toString());
        }
        int app = reader.appraisal(bookTrue);
        System.out.println("Оценка: " + app);
    }
}
