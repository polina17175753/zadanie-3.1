public class Book implements Printable{
    String nameBook;
    @Override
    public void print() {
        System.out.println("Книга");
    }
    void printBooks(Printable[] printable){
        System.out.println(nameBook);
    }
}
