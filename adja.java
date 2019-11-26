import.java.util.*;
public class Rem{
    public static vid main(string args[]){
        Scanner sc=new Scanner(system.in);
        System.out.println("Give input");
        String input=sc.next();
        String res=removeDup(input);
        System.out.println(output=+res);
        sc.close();
    }
    public static String removDup(String input){
        if(input.length()<=1){
            return input;
        }
        if(input.charAt(0)==inut.charAt(1)){
            int i=0;
            while(i<input.length()-1 &&input.charAt(0)==input.charAt(i+1)){
                i++;
            }
            return removeDup(input.substring(i+1));

        }
        else{
            return input.charAt(0)+removeDup(input.substring(1));
        }
    }
}