import java.util.*;

public class CompanyTester
{
    public static void main(String[] args)
    {
        ArrayList<Company> companyList = new ArrayList<Company>();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Please enter a company name, enter \"exit\" to quit:");
            String compName = input.nextLine();
            if(compName.toLowerCase().equals("exit")){
                break;
            } else {
                System.out.println("Is this an online company, \"yes\" or \"no\":");
                String isOnline = input.nextLine();
                if(isOnline.toLowerCase().equals("yes")){
                    System.out.println("Please enter the web address: ");
                    String webAddress = input.nextLine();
                    companyList.add(new OnlineCompany(compName, webAddress));
                } else {
                    System.out.println("Please enter the street address: ");
                    String streetAddress = input.nextLine();
                    System.out.println("Please enter the city: ");
                    String city = input.nextLine();
                    System.out.println("Please enter the state: ");
                    String state = input.nextLine();
                    companyList.add(new Company(compName, streetAddress, city, state));
                }
            }
        }
        for(Company company : companyList){
            System.out.println("\n" + company);
        }
    }
}