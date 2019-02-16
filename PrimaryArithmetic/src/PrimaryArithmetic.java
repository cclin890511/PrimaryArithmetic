import java.util.*;

public class PrimaryArithmetic {
   public static void main(String[] args) {
	   Scanner scanner=new Scanner (System.in);
	   
	   while(scanner.hasNext()) {
		   
		   int num1=scanner.nextInt();
		   int num2=scanner.nextInt();
		   
		   int[] arr1=new int[15];
		   int[] arr2=new int[15];
		   
		   int i=0;
		   int count=0;
		   int digit=0;
		   
		   if(num1==0 && num2==0) {
			   break;
		   }
		   
		   while(num1!=0) {
		   arr1[i]=num1%10;
		   i++;
		   num1=num1/10;
	   }
	   
	   int j=0;
	   
	   while(num2!=0) {
		   arr2[j]=num2%10;
		   j++;
		   num2=num2/10;
	   }
	   /*for(int k=0; k<10; k++) {
		   System.out.println(arr1[k]);
		   System.out.println(arr2[k]);
	   }*/
	   
	   for(int n=0; n<10; n++) {
		   digit=arr1[n]+arr2[n];
		   if(digit>=10) {
			   count++;
			   arr1[n+1]+=1;
		   }
	   }
	   if(count==0) {
		   System.out.println("No carry operation.");
	   }
	   else if(count==1){
		   System.out.println("1 carry operation.");
	   }
	   else {
		   System.out.printf("%d carry operations.\n", count);
	   }
	   }
   }
}
