import java.util.Random;

class Reader{

    public Book choiceBook(String[][] massBook) {
        Random random = new Random();
        int index = random.nextInt(massBook.length);
        String[] bookTrue = massBook[index];
        if (bookTrue[2].equals("") && bookTrue[3].equals("")) {
            return new Book(bookTrue[0], bookTrue[1]);
        } else if (bookTrue[2].equals("")) {
            return new Book(bookTrue[0], bookTrue[1], bookTrue[3]);
        } else {
            return new Book(bookTrue[0], bookTrue[1], bookTrue[2], bookTrue[3]);
        }
    }

    public void readBook(Book book) {
        System.out.println(book.toString());
    }

    public int appraisal(Book bookTrue) {
        int n = new Random().nextInt(100);
        if (bookTrue.numberPages.equals("Неизвестно") && bookTrue.numberSeries.equals("Неизвестно")) {
            return (bookTrue.name.length() + bookTrue.author.length() - n - n);
        } else if (bookTrue.numberSeries.equals("Неизвестно")) {
            return (bookTrue.name.length() + bookTrue.author.length() - n + Integer.parseInt(bookTrue.numberPages));
        } else {
            return (bookTrue.name.length() + bookTrue.author.length() - Integer.parseInt(bookTrue.numberSeries) + Integer.parseInt(bookTrue.numberPages));
        }
    }
}
