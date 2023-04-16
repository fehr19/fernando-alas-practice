package canvas_assignments.library_app;

public class KidUsers implements LibraryUser {
    int age;
    String bookType;

    @Override
    public void registerAccount() {
        if (age <= 11) {
            System.out.println("You have successfully registered " +
                    "under a Kid's Account");
        } else {
            System.out.println("Sorry, age must be less than 12 " +
                    "to register as a kid.");
        }
    }

    @Override
    public void requestBook() {
        if ((bookType == "Kids") && (age <= 11)) {
            System.out.println("Book issued successfully, please " +
                    "return the book within 10 days.");
        }
        //added logic to validate membership
        else if (age > 11) {
            System.out.println("Not a valid membership, " +
                    "please register for an Adult membership.");

        } else {
            System.out.println("Oops! You are only allowed to take " +
                    "kids books.");
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
