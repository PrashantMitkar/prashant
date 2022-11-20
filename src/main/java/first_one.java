public class first_one{

public static void main(String [] args)
{

String str="prashant" ,reverse="";

 

for(int i=str.length()-1;i>=0;i--){

	reverse=reverse+str.charAt(i);

}

System.out.print("reverse string is: " +reverse);

}
}