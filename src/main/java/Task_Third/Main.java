package Task_Third;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        addressBook.addContact("Alice", "123-456-7890");
        addressBook.addContact("Bob", "987-654-3210");


        String alicePhone = addressBook.getPhone("Alice");
        System.out.println("Телефон Alice: " + alicePhone);


        addressBook.removeContact("Bob");
        addressBook.removeContact("Charlie");


        addressBook.printAllContacts();
    }
}
