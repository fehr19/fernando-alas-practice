package library_app;

public class AdultUsers implements LibraryUser {
    int age;
    String bookType;

    @Override
    public void registerAccount() {
        if (age >= 12) {
            System.out.println("You have successfully " +
                    "registered under an Adult account");
        } else {
            System.out.println("Sorry, age must be greater " +
                    "than 12 to register as an adult.");
        }

    }

    @Override
    public void requestBook() {
        if ((bookType == "Fiction") && (age >= 12)) {
            System.out.println("Book issued successfully, " +
                    "please return the book within 7 days");
        }
        //added logic to validate membership
        else if (age < 12) {
            System.out.println("Not a valid membership, " +
                    "please register for a Kids membership");


        } else {
            System.out.println("Oops, you are allowed to to " +
                    "take only adult Fiction books.");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
