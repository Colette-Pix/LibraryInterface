public class AdultUser extends LibraryUser {

    AdultUser(int a, String s){
        super(a,s);
    }
    public void registerAccount(){
        if (age >= 12){
            System.out.println("You have successfully registered under an Adult Account");
        }
        else if (age <= 11){
            System.out.println("Sorry, age must be greater than 11 to register as an adult.");
        }
    }

    public void requestBook() {
        if (bookType.equals("Fiction")) {
            System.out.println("Book issued successfully, please return the book whtin 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}
