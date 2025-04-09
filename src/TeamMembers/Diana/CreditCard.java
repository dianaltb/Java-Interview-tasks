package TeamMembers.Diana;

public class CreditCard {
    private String type;
    private String cardNumber;
    private String name;
    private String expirationDate;

    public CreditCard(String type, String cardNumber, String name, String expirationDate) {
        this.type = type;
        this.cardNumber = cardNumber;
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equals("visa") || type.equals("mastercard") || type.equals("discover") || type.equals( "amex")) {
            this.type = type;
        } else System.exit(1);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        if (type.equals("visa") || type.equals("mastercard") || type.equals("discover") && cardNumber.length() == 16) {
            this.cardNumber = cardNumber;
        } else if (type.equals("amex") && cardNumber.length() == 15) {
            this.cardNumber = cardNumber;
        } else {
            System.exit(1);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty() && name.isBlank()) {
            this.name = name;
        }
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "type='" + type + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", name='" + name + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
