public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Enter party affiliation [D,R,I]");
        String partyAffil = "l";

        if (partyAffil.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if(partyAffil.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if(partyAffil.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent man");
        }
        else
        {
            System.out.println("Your affiliation is Other");
        }
    }
}
