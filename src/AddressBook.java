import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> addressBook;

    public AddressBook(ArrayList<BuddyInfo> addressBook) {
        this.addressBook = addressBook;
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            this.addressBook.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        this.addressBook.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
