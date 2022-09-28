public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.nameBook = "Портрет Дориана Грея";
        Magazine magazine = new Magazine();
        magazine.nameMagazine = "Магазин";
        Printable[] mas1 = {book, magazine};
        for(int i = 0; i<mas1.length; i++){
            mas1[i].print();
            if (mas1[i] instanceof Book){
                ((Book) mas1[i]).printBooks(mas1);
            }
            if (mas1[i] instanceof Magazine){
                ((Magazine) mas1[i]).nameMagazine(mas1);
            }
        }
    }
}