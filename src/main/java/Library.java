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
        Book book = reader.choiceBook(massBook);
        reader.readBook(book);
        System.out.println("Книга: '" + book.name + "'; Оценка: " + reader.appraisal(book));
    }
}
