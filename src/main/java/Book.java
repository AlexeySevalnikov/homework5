class Book {

    String name;
    String author;
    String numberSeries;
    String numberPages;

    Book(String name, String author, String numberSeries, String numberPages) {
        this.name = name;
        this.author = author;
        this.numberSeries = numberSeries;
        this.numberPages = numberPages;
    }

    Book(String name, String author, String numberPages) {
        this.name = name;
        this.author = author;
        this.numberPages = numberPages;
        this.numberSeries = "Неизвестно";
    }

    Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.numberSeries = "Неизвестно";
        this.numberPages = "Неизвестно";
    }

    @Override
    public String toString() {
        return "Книга: '"  + name + "' " + author + "; Номер серии: " + numberSeries + "; Количесво страниц: " + numberPages;
    }
}
