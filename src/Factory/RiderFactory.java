package Factory;

import Application.Rider;

import java.util.Scanner;
public class RiderFactory {
    public static int riderID = 0;
    public static Rider crateRider(){
        Scanner scanner = new Scanner(System.in);
        riderID++;
        System.out.println("New Rider");
        System.out.println("Enter Rider Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Rider Location: ");
        String location = scanner.nextLine();

        return new Rider(riderID, name, location);
    }
}
