package zoo;

import java.util.Date;

public class TicketSystem
{
    private int numberTickets;
    Date dateOfEvent = new Date();
    private String guestName;
    public double rate;
    public double totalTicket;
    public double ticketPrice[] = {10.00, 12.00, 18.00};


    public TicketSystem( int numberTickets, String guestName, int priceNum, boolean discount)
    {
        this.numberTickets = numberTickets;
        this.guestName = guestName;

        isDiscount(discount);
        totalTicket = numberTickets * (ticketPrice[priceNum]-(ticketPrice[priceNum]*rate));

        printTicket(guestName,numberTickets, totalTicket);


    }
    public TicketSystem()
    {

    }

    public double isDiscount(boolean dicount)
    {
        if(dicount == true)
        {
            rate = 0.10;
        } else{
            rate = 0;
        }
        return rate;
    }
    public void cancelTcket()
    {
        System.out.println("Your ticket transaction has been canceled");
    }
    private double calcTicket(int numberTickets, int priceNum)
    {
        double price = ticketPrice[priceNum];
        double finalPrice = numberTickets * price;
        return finalPrice;

    }
    private void printTicket(String name, int num, double price)
    {
        System.out.println("THE BREVARD ZOO");
        System.out.println("===========================================================");
        System.out.println(dateOfEvent.toString());
        System.out.println("Thank you for your purchase " + name);
        System.out.println("You ordered " + num + " tickets");
        System.out.println("your total is $" + price);
        System.out.println("Have a happy day!!");
        System.out.println("===========================================================");
    }

    public int getNumberTickets() {
        return numberTickets;
    }

    public void setNumberTickets(int numberTickets) {
        this.numberTickets = numberTickets;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
}
