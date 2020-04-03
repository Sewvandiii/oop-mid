package WeCode;

import java.util.Scanner;

public class PlayASong {

    private static Artist artist;
    private static Operator operator1;

    public static void main(String arhs[]) {

        getArtistDetails();
        getOperatorDetails();
        operator1.calculateRevenue(artist);

    }

    public static void getArtistDetails() {
        Scanner scanner = new Scanner(System.in);
        String array[][] = new String[5][2];
        User user = new Artist();
        user.setUname("Pablo Albo");
        user.setUemail("pablo@gmail.com");
        String musincGenre = "Pop";

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Song :");
            array[i][0] = scanner.next();
            System.out.println("Enter rate :");
            array[i][1] = scanner.next();
        }
        artist = new Artist(musincGenre, array, user);
        artist.printDetails();

    }

    public static void getOperatorDetails() {

        User operator = new Operator();
        operator.setUname("Simon");
        operator.setUemail("Simon@playasong.com");

        String employeeNumber = "123";
        String designation = "accountant";

        operator1 = new Operator(employeeNumber, designation, operator);
        operator1.printDetails();

    }
}
