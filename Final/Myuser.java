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

        Scanner a = new Scanner (System.in);
        Scanner b = new Scanner (System.in);
		
		System.out.println();
		
        System.out.print ("ENTER FULL NAME: ");
        name = a.nextLine();
      
		System.out.println();

        try{
            System.out.print("ENTER IC NUMBER: ");
            IC = Double.parseDouble(b.nextLine());

        }catch(NumberFormatException e){
            
            System.out.println("Something went wrong");
            System.exit(0);
        }

        System.out.print ("ENTER PHONE NUMBER: ");
        phonenum = a.nextLine();

		System.out.println();

        System.out.print ("ENTER EMAIL: ");
        email = a.nextLine();
		
	}


}

 class question extends Rregister // Is-A relationship
 {

    public void soalan(){

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
    
 class Myuser extends question //Is-A relationship
 {

    public static void main(String[] args) {
        
        Myuser m = new Myuser();
        //Rregister r = new Rregister(); //Has-A relationship
        question q = new question(); //Has-A relationship

        q.daftar();
        q.soalan();
        
        
    }
}