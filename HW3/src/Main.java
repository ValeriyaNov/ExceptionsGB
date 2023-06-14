
public class Main {
    public static void main(String[] args) {
        ContactData contactData = new ContactData();
        Controller.inputController(contactData);
        Output.writeData(contactData);
    }
}