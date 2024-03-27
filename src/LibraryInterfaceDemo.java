public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser k = new KidUser(10,"Kids");
        k.registerAccount();
        k.requestBook();
        KidUser k2 = new KidUser(18, "Fiction");
        k2.registerAccount();
        k2.requestBook();

        AdultUser a = new AdultUser(5,"Kids");
        a.registerAccount();
        a.requestBook();
        AdultUser a2 = new AdultUser(23, "Fiction");
        a2.registerAccount();
        a2.requestBook();
    }
}