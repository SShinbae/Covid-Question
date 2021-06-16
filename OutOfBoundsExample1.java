public class OutOfBoundsExample1 { 
    public static void main(String[]args)
    { 
        int [] array = {4,8,15,16,23,42}; //size 6 – index 0 to 5
        System.out.println("The lottery numbers are ..."); 
       for(int i = 0; i <= array.length; i++)
       { // here, i<=array.length will be true,even when i is equal to 6 
           //which will cause an ArrayIndexOutOfBoundsException 
           System.out.println(".."+array[i]); //array[6] - index
       }   
    }  
} 
