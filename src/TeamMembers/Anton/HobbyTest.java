package TeamMembers.Anton;

public class HobbyTest {
    public static void main(String[] args) {

        Hobby readingBook = new Hobby("Reading Books");
        readingBook.isOutDoor = false;

        System.out.println(readingBook);

        readingBook.doIt();

        Hobby java = new Hobby( "Java", 10_000);

        System.out.println(java);
        java.doIt();


        Hobby painting = new Hobby( "Painting", 400);
        painting.isOutDoor = true;
        System.out.println(painting);
        painting.doIt();
    }
}
