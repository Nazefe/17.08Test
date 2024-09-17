package Task_Third;



import java.util.HashMap;
import java.util.Map;

class AddressBook {
    private Map<String, String> contacts;

    public AddressBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        contacts.put(name, phone);
        System.out.println("Контакт " + name + " добавлен с номером " + phone);
    }

    public String getPhone(String name) {
        return contacts.get(name);
    }

    public void removeContact(String name) {
        if (contacts.remove(name) != null) {
            System.out.println("Контакт " + name + " удален.");
        } else {
            System.out.println("Контакт " + name + " не найден.");
        }
    }

    public void printAllContacts() {
        System.out.println("Все контакты:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", Телефон: " + entry.getValue());
        }
    }
}

