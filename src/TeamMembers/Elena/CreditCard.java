package TeamMembers.Elena;

/*CreditCard
    -instance variables: type, card number, name, expiration date
    -constructor that accepts all values and calls the setters
    -Getters and Setters for each:
        -valid types -> "visa","mastercard","discover","american express"
        -card number -> "visa","mastercard","discover" -> 16 digits
                     -> "american express" -> 15 digits
        -name -> cannot be null or empty
    -generate toString()*/
public class CreditCard {
    private String type;
    private String cardNumber;
    private String name;
    private int expirationDate;

    public CreditCard(String type, String cardNumber, String name, int expirationDate) {
        setType(type);
        setCardNumber(cardNumber);
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == "visa" || type == "mastercard" || type == "discover" || type == "american express") {
            this.type = type;
        } else {
            System.out.println("NOT VALID TYPE");
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        if (type.equals("visa") || type.equals("mastercard") || type.equals("discover") && type.length() == 15 ||
                type.equals("american express") && type.length() == 16) {
            this.cardNumber=cardNumber;
        } else {
            System.err.println("wrong card number");
        }
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "type='" + type + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", name='" + name + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
