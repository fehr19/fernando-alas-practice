package canvas_assignments.library_app;

public class LibraryInterfaceDemo {
    //303.6.3- Practice Assignment - Polymorphism and Interface
    public static void main(String[] args) {
        KidUsers kid1 = new KidUsers();
        KidUsers kid2 = new KidUsers();
        kid1.setAge(10);
        kid2.setAge(18);

        kid1.registerAccount();
        kid2.registerAccount();

        kid1.setBookType("Kids");
        kid2.setBookType("Fiction");

        kid1.requestBook();
        kid2.requestBook();

        AdultUsers adult1 = new AdultUsers();
        AdultUsers adult2 = new AdultUsers();
        adult1.setAge(5);
        adult2.setAge(23);

        adult1.registerAccount();
        adult2.registerAccount();

        adult1.setBookType("Kids");
        adult2.setBookType("Fiction");

        adult1.requestBook();
        adult2.requestBook();

    }
}
