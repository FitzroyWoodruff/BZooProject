package zoo;

import java.util.Date;

public class VolunteerTrackingSystem
{
    private String nameOfVolunteer;
    private int ageOfVolunteer;
    private String daysAvailible;
    public String skill[] = {"Cleaning Cages", "Helping Seniors", "Childern", "Customer Care"};

    public VolunteerTrackingSystem()
    {

    }

    public VolunteerTrackingSystem(int ageOfVolunteer, String daysAvailible, String nameOfVolunteer, int skillNum)
    {
        this.ageOfVolunteer = ageOfVolunteer;
        this.daysAvailible = daysAvailible;
        this.nameOfVolunteer = nameOfVolunteer;
        String skillSelect = skill[skillNum];

        createVolunteer();
        System.out.println("===========================================================");
        printVolunteerStatus(nameOfVolunteer, ageOfVolunteer, skillSelect, daysAvailible);
        System.out.println("===========================================================");

    }

    public void createVolunteer()
    {
        System.out.println("YOU ADDED A VOLUNTEER");

    }

    public void deleteVolunteer()
    {
        System.out.println("You Deleted a Volunteer");
    }

    public void editVolunteer()
    {
        System.out.println("You Edited a Volunteer");
    }

    public void printVolunteerStatus(String name, int age, String skills, String day)
    {
        System.out.println("Name of Volunteer: " + name);
        System.out.println("Age of Volunteer: " + age);
        System.out.println("Volunteer skillset: " + skills);
        System.out.println("They are availible on: " + day);


    }


    public String getNameOfVolunteer()
    {
        return nameOfVolunteer;
    }

    public void setNameOfVolunteer(String nameOfVolunteer)
    {
        this.nameOfVolunteer = nameOfVolunteer;
    }

    public int getAgeOfVolunteer()
    {
        return ageOfVolunteer;
    }

    public void setAgeOfVolunteer(int ageOfVolunteer)
    {
        this.ageOfVolunteer = ageOfVolunteer;
    }

    public String getDaysAvailible()
    {
        return daysAvailible;
    }

    public void setDaysAvailible(String daysAvailible)
    {
        this.daysAvailible = daysAvailible;
    }

}
