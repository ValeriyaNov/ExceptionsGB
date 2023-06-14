

public class Controller {
    public static void inputController(ContactData contactData){
        boolean inCorrectInput = true;
        while (inCorrectInput) {
            String[] inputData = Input.inputData();
            if(CheckInputLength.checkInputLength(inputData) == 0){
                ParseData.parseInputToContactData(inputData, contactData);
            }
            if(contactData.checkFieldsForNull()) inCorrectInput = false;
        }
    }
}
