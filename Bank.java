package sample;

import java.util.ArrayList;

public class Bank {
    static ArrayList<Service> services;
    static int nextID;
    static int nextServiceId;

    public Bank()
    {
        services = new ArrayList<>();
        nextID = 0;
        nextServiceId = 0;
    }

    static void addService(Service toAdd)
    {
        services.add(toAdd);
    }

    static int getNextId()
    {
        return nextID++;
    }

    static int getNextServiceId() { return nextServiceId++; }

    static void printAllServices()
    {
        for(int i = 0; i<services.size()-1;i++)
        {
            System.out.println( "ID: "+services.get(i).getId() + ") " + services.get(i).getServiceName() );
            System.out.println( "Founder: " + services.get(i).getFounderName() );
            System.out.println( "Time: " + services.get(i).getAllTimeToSpend() );
            if(services.get(i).getNumericStatus() == 2)
            {
                System.out.println( "Status: "+ services.get(i).getStatus());
                System.out.println( "Reserved by: " + services.get(i).getRenterName());
            }else System.out.println( "Status: "+ services.get(i).getStatus());
            System.out.println("Avalible dates: ");
            for(int j = 0; j<services.get(i).getListOfDates().size()-1 ; j++)
            {
                System.out.println((j+1)+") "+services.get(i).getListOfDates().get(j));
            }
            System.out.println( "Time already spent: " + services.get(i).getTimeOfServicing());
        }
    }

    static boolean rentService(int id, String requesterName)
    {
        for(int i = 0; i<services.size()-1;i++)
        {
            if(services.get(i).getId() == id)
            {
                services.get(i).rentAService(requesterName);
                return true;
            }
        }
        return false;
    }

    static boolean releaseService(int id)
    {
        for(int i = 0; i<services.size()-1;i++)
        {
            if(services.get(i).getId() == id)
            {
                services.get(i).releaseAService();
                return true;
            }
        }
        return false;
    }

    static boolean deleteService(int id, int fomerId)
    {
        for(int i=0; i<services.)
    }

}
