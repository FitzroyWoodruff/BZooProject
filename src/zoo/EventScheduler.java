package zoo;

import java.util.Date;

public class EventScheduler
{


    Date dateOfEvent = new Date();
    public int parkCapacity = 5000;
    private int eventCapacity;
    private String nameOfEvent;
    private double eventPricing;

    public EventScheduler()
    {

    }
    public EventScheduler(String nameOfEvent, double eventPricing, int eventCapacity)
    {
        this.nameOfEvent = nameOfEvent;
        this.eventPricing = eventPricing;
        this.eventCapacity = eventCapacity;

        createEvent();
        System.out.println("===========================================================");
        printEventStatus(nameOfEvent, eventPricing, eventCapacity);
        System.out.println("===========================================================");

    }

    public void createEvent()
    {
        System.out.println("YOU CREATED AN EVENT");
    }
    public void editEvent()
    {
        System.out.println("You have edited an event");
    }
    public void deleteEvent()
    {
        System.out.println("You have deleted an event");
    }
    public void printEventStatus(String name, double pricing, int capacity)
    {
        System.out.println("Name of Event: " + name);
        System.out.println("Date of Event: " + dateOfEvent.toString());
        System.out.println("Capacity for the park is " + parkCapacity + " event capacity is: " + capacity);
        System.out.println("Pricing for Event: $" + pricing);


    }
    public String getNameOfEvent() {
    return nameOfEvent;
}

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public double getEventPricing() {
        return eventPricing;
    }

    public void setEventPricing(double eventPricing) {
        this.eventPricing = eventPricing;
    }

    public int getEventCapacity() {
        return eventCapacity;
    }

    public void setEventCapacity(int eventCapacity) {
        this.eventCapacity = eventCapacity;
    }
}
