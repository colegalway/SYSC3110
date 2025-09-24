import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> addressBook;

    public AddressBook() {
        addressBook = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            this.addressBook.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        this.addressBook.remove(buddy);
    }

    public String buddyDescription() {
        String description = "";
        for (BuddyInfo buddy : this.addressBook) {
            description = buddy.getName() +" " + buddy.getAddress() + " " + buddy.getPhone_number();
        }
        return description;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Cole", "1125 Colonel By Drive", "613-111-1111");
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addBuddy(buddy);
        addressBook1.removeBuddy(buddy);
        System.out.println("Address Book");
        System.out.println("Committing changes");
        System.out.println("testing the test branch!");
        addressBook1.addBuddy(buddy);
        System.out.println(addressBook1.buddyDescription());

    }
}
