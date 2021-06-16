import java.util.Scanner;


//polymorphism
abstract class Rregister
{
    //abstract method

    public abstract void soalan();

    void daftar()
	{
        
        String name, email, phonenum;
        Double IC;
		int year, age;

        Scanner a = new Scanner (System.in);
        Scanner b = new Scanner (System.in);
		
		System.out.println();
		
        System.out.print ("ENTER FULL NAME: ");
        name = a.nextLine();
      
		System.out.println();
		
		System.out.print ("ENTER BIRTH YEAR: ");
		year = a.nextInt();
		
        //Runtime Exception (Arithmetic Exception)
		try 
		{
			
			int current_year = 2021;
			int result = current_year - year;
			
			if (result >= 18)
			{
				
			}
			
			else
			{
				age = result / 0;
			}
			
		}
		
		catch (ArithmeticException e)
		{
			System.out.println ("Sorry, you are underage.");
			System.exit (0);
		}
		
		System.out.println();

        // Runtime Exception (NumberFormatException)
        try
		{
            System.out.print("ENTER IC NUMBER: ");
            IC = Double.parseDouble(b.nextLine());
        }
		
		catch(NumberFormatException e)
		{
            
            System.out.println("Something went wrong");
            System.exit(0);
        }


		System.out.println();

        System.out.print ("ENTER PHONE NUMBER: ");
        phonenum = b.nextLine();

		System.out.println();

        System.out.print ("ENTER EMAIL: ");
        email = b.nextLine();
		
		System.out.println();
	}


}
// Is-A relationship
 class question extends Rregister 
 {

    public void soalan()
	{

        char answer;
        int count = 0;
        
        Scanner b = new Scanner (System.in);
        
        System.out.print ("WOULD YOU LIKE TO UPDATE YOUR COVID-19 STATUS? (Y/N): ");
        answer = b.next().charAt(0);
    
        System.out.println();
    
        switch (answer)
        {
            case 'Y':
            System.out.println ("1. ARE YOU EXPERIENCING 2 OR MORE SYMPTOM?");
            System.out.println ("  (FEVER, SORE THROAT, HEADACHE, NAUSEA, DIARRHEA, RUNNY NOSE, BODY ACHE)");
            
            System.out.println();
            
            System.out.print ("Answer (Y/N): ");
            answer = b.next().charAt(0);
            
            if (answer=='Y'||answer=='y')
            {
                count=count + 1;
            }
            
            else
            {
                count=count + 0;
            }
            
            System.out.println();
            
            System.out.println ("2. HAVE YOU EVER BEEN IN A CLOSE CONTACT WITH COVID-19 SUSPECT OR PATIENT?");
            
            System.out.println();
            
            System.out.print ("Answer (Y/N): ");
            answer = b.next().charAt(0);
            
            if (answer=='Y'||answer=='y')
            {
                count=count + 1;
            }
            
            else
            {
                count=count + 0;
            }
            
            System.out.println();
            
            System.out.println ("3. HAVE YOU EVER BEEN TO A PLACE THAT HAS BEEN KNOWN WITH COVID-19 CLUSTERS?");
            
            System.out.println();
            
            System.out.print ("Answer (Y/N): ");
            answer = b.next().charAt(0);
            
            if (answer=='Y'||answer=='y')
            {
                count=count + 1;
            }
            
            else
            {
                count=count + 0;
            }
            
            System.out.println();
            
            if (count>=1)
            {
                
                System.out.println ("HIGH RISK. YOU WILL BE CONTACTED SOON.");
            }
            
            else
            {
                System.out.println ("LOW RISK. STAY SAFE.");
            }
            
            break;
            
            case 'y':
                System.out.println ("1. ARE YOU EXPERIENCING 2 OR MORE SYMPTOM?");
            System.out.println ("  (FEVER, SORE THROAT, HEADACHE, NAUSEA, DIARRHEA, RUNNY NOSE, BODY ACHE)");
            
            System.out.println();
            
            System.out.print ("Answer (Y/N): ");
            answer = b.next().charAt(0);
            
            if (answer=='Y'||answer=='y')
            {
                count=count + 1;
            }
            
            else
            {
                count=count + 0;
            }
            
            System.out.println();
            
            System.out.println ("2. HAVE YOU EVER BEEN IN A CLOSE CONTACT WITH COVID-19 SUSPECT OR PATIENT?");
            
            System.out.println();
            
            System.out.print ("Answer (Y/N): ");
            answer = b.next().charAt(0);
            
            if (answer=='Y'||answer=='y')
            {
                count=count + 1;
            }
            
            else
            {
                count=count + 0;
            }
            
            System.out.println();
            
            System.out.println ("3. HAVE YOU EVER BEEN TO A PLACE THAT HAS BEEN KNOWN WITH COVID-19 CLUSTERS?");
            
            System.out.println();
            
            System.out.print ("Answer (Y/N): ");
            answer = b.next().charAt(0);
            
            if (answer=='Y'||answer=='y')
            {
                count=count + 1;
            }
            
            else
            {
                count=count + 0;
            }
            
            System.out.println();
            
            if (count>=1)
            {
                
                System.out.println ("HIGH RISK. YOU WILL BE CONTACTED SOON.");
            }
            
            else
            {
                System.out.println ("LOW RISK. STAY SAFE.");
                System.out.println ();
                System.out.println ("KITA JAGA KITA");
            }

            break;

            default:
            System.out.println ("OK");
            System.out.println ();
            System.out.println ("KITA JAGA KITA");
        }
    }

}

//Is-A relationship
 class Myuser extends question 
 {

    public static void main(String[] args)
	{

        //Rregister r = new Rregister(); //Has-A relationship
        Myuser m = new Myuser();
        question q = new question(); //Has-A relationship

        q.daftar();
        q.soalan();
        
        
    }
}