package TeamMembers.Rasa;

public class CreditCard {

    private String type;
    private String cardNumber;
    private String name;
    private int date;

    public CreditCard(String type, String cardNumber, String name, int date) {
        setType(type);
        setCardNumber(cardNumber);
        setName(name);
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        type = type.toLowerCase();
        if (isValid(type)) {
            this.type = type;
        } else {
            System.err.println("Not a valid card - " + type);
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {

        if (type.equals("american express") && cardNumber.length() == 15 ||
                !type.equals("american express") && cardNumber.length() == 16) {
            this.cardNumber = cardNumber;
        } else {
            System.err.println("Wrong Input - " + cardNumber);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.err.println("Invalid input - " + name);
        }
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    //method
    public boolean isValid(String type) {
        if (type.equals("visa") || type.equals("mastercard") || type.equals("discover") || type.equals("american express")) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "type='" + type + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
