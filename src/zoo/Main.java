package zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BlogSystem blogSystem;
        TicketSystem ticketSystem;
        EventScheduler eventScheduler;
        VolunteerTrackingSystem volunteerTrackingSystem;
        MembershipSystem membershipSystem;
        boolean discount = false;

        Scanner scan = new Scanner(System.in);


        System.out.println("WELCOME TO NEW ZOO SYSTEM");
        System.out.println("===========================================================");
        System.out.println();
        System.out.println("1) BLOG POST");
        System.out.println("2) TICKET SYSTEM");
        System.out.println("3) EVENT SCHEDULER");
        System.out.println("4) VOLUNTEER TRACKER");
        System.out.println("5) MEMBERSHIP SYSTEM");
        System.out.print("");

        int systemChoice = scan.nextInt();
        //System.out.println(systemChoice);

        switch (systemChoice)
        {
            case 1:

                System.out.println("YOU CHOSE 1) BLOG POST");
                System.out.println("===========================================================");
                scan.nextLine();
                System.out.println("Enter Author Name: ");
                String author = scan.nextLine();
                System.out.println("Enter Blog Title: ");
                String blogTitle = scan.nextLine();
                System.out.println("Enter Blog Message: ");
                String blogMessage = scan.nextLine();
                System.out.println("Enter Category Number (0 for News, 1 for Entertainment, 2 for Business Opportunity): ");
                int category = scan.nextInt();
                System.out.println();
                System.out.println("===========================================================");

                blogSystem = new BlogSystem(author, blogTitle, blogMessage, category);
                System.out.println("===========================================================");

                break;
            case 2:
                System.out.println("YOU CHOSE 2) TICKET SYSTEM");
                System.out.println("===========================================================");
                scan.nextLine();
                System.out.println("Enter Number of Tickets: ");
                int numTickets = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter Ticket Holder Name: ");
                String ticketHolderName = scan.nextLine();
                System.out.println("Enter Ticket Price number (0 for 10.00, 1 for 12.00, 2 for 18.00): ");
                int priceChoice = scan.nextInt();
                System.out.println("Is Discount Available (Y/N): ");
                String isDicount = scan.next();
                String x = isDicount.toUpperCase();

                switch (x)
                {
                    case "Y":
                        discount = true;
                        break;
                    case "N":
                        discount = false;
                        break;
                    default:
                         System.out.println("YOU ENTERED AN INVALID CHOICE.");
                        System.out.println("===========================================================");
                }

                ticketSystem = new TicketSystem(numTickets, ticketHolderName, priceChoice, discount);
                System.out.println("===========================================================");

                break;
            case 3:
                System.out.println("YOU CHOSE 3) EVENT SCHEDULER");
                System.out.println("===========================================================");
                scan.nextLine();
                System.out.println("Enter Name of Event: ");
                String eventName = scan.nextLine();
                System.out.println("Enter Event Price: ");
                double eventPrice = scan.nextDouble();
                System.out.println("Enter Event Capacity: ");
                int capacity = scan.nextInt();

                eventScheduler = new EventScheduler(eventName, eventPrice, capacity);
                System.out.println("===========================================================");

                break;
            case 4:
                System.out.println("YOU CHOSE 4) VOLUNTEER TRACKER");
                System.out.println("===========================================================");
                scan.nextLine();
                System.out.println("Enter Age of Volunteer: ");
                int vAge = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter Day of the Week Available (Sunday-Saturday): ");
                String vDay = scan.nextLine();
                System.out.println("Enter Volunteer Name: ");
                String vName = scan.nextLine();
                System.out.println("Enter Volunteer Skill Level (0-2): ");
                int skill = scan.nextInt();

                volunteerTrackingSystem = new VolunteerTrackingSystem(vAge, vDay, vName, skill);
                System.out.println("===========================================================");

                break;
            case 5:
                System.out.println("YOU CHOSE 5) MEMBERSHIP SYSTEM");
                System.out.println("===========================================================");
                scan.nextLine();
                System.out.println("Enter Member Name: ");
                String mName = scan.nextLine();
                System.out.println("Enter Membership Number (BZ005211): ");
                String mNumber = scan.nextLine();
                System.out.println("Enter Membership Level (1-21): ");
                int mLevel = scan.nextInt();

                membershipSystem = new MembershipSystem(mName, mNumber, mLevel);
                System.out.println("===========================================================");

                break;
            default:
                System.out.println("YOU ENTERED AN INVALID CHOICE.");
                System.out.println("===========================================================");
        }




        scan.close();

    }
}
