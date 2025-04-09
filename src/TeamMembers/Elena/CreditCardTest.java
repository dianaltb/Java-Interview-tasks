package TeamMembers.Elena;

public class CreditCardTest {
    public static void main(String[] args) {

        CreditCard mastercard = new CreditCard("mastercard","4440033004040550","MyCard",1220);
        CreditCard visa = new CreditCard("visa","4220033004047750","Extra",1005);
        CreditCard discover = new CreditCard("discover","4540055004040550","Fake",1111);
        CreditCard americanExpress = new CreditCard("american express","444033704040590","Lucky",1022);

        System.out.println(mastercard);
        System.out.println(visa);
        System.out.println(discover);
        System.out.println(americanExpress);

    }
}
