class Book extends Library {

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
    }

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        if (numberSeries == null) {
            numberSeries = "Неизвестно";
        }
        if (numberPages == null){
            numberPages ="Неизвестно";
        }
        return "Книга:" + '"' + name + '"' + ' ' + author + "; Номер серии: " + numberSeries + "; Количесво страниц: " + numberPages;
    }
}
