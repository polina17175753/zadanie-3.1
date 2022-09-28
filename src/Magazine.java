
public class Magazine  implements Printable {
    String nameMagazine;
    @Override
    public void print(){
        System.out.println("На печать");

    }
    void printMagazines(Printable[]printable){
        System.out.println(nameMagazine);
    }
}