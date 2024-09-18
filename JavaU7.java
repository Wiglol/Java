
public class JavaU7 {

  
    public static void main(String args[]) {
        
       int[] myNum = {10,20,30,40,50}; 
       
       for (int i = 0; i < myNum.length; i++) {
  System.out.println(myNum[i]);
  
       }
       
  int firstNum = myNum[0];
int lastNum = myNum[myNum.length-1];

        System.out.println(firstNum);
        System.out.println(lastNum);
        
        int sum = 0;
int i;  

for (i = 0; i < myNum.length; i++) {
  sum += myNum[i];
} 

System.out.println("The sum is: " + sum / 2); 
        
        




  
  
  

      

        
        
        
        
        
    }
}
