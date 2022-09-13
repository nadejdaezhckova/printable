public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.nameBook = "Аленький цветочек";
        Magazine mag1 = new Magazine();
        mag1.nameMagazine = "Модники";
        Printable[] mas1 = {b1, mag1};
        for(int i = 0; i<mas1.length; i++){
            mas1[i].print();
            if (mas1[i] instanceof Book){
                ((Book) mas1[i]).printBooks(mas1);
            }
            if (mas1[i] instanceof Magazine){
                ((Magazine) mas1[i]).printMagazines(mas1);
            }
        }
    }
}
