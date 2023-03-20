package gasSupplier;

public interface gasAgency {
    public String agencyName = "Bharat Gas";
    public int agencyCode = 1234;
    public int phNumber = 783555; //help line number

    public int pinCode = 201310;

    //function: only default function is allowed in interface that has body.
    default void agencyDisplay(){
        System.out.println("The Agency Name is : " + agencyName);
        System.out.println("The Agency Code is : " + agencyCode);
        System.out.println("The Agency Helpline number is : " + phNumber);
    }


}
