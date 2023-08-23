package mandatoryHomeWork.DailyHomeWork;
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []args)throws IOException
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.valueOf(br.readLine());
         HashMap<String,Integer> phonebook = new HashMap<String,Integer>();
         for (int i = 0; i < n; i++) {
             String name = br.readLine();
             int phone = Integer.valueOf(br.readLine());
             phonebook.put(name,phone);
         }
         String s;
         while((s = br.readLine())!= null){
             if(phonebook.containsKey(s)){
                System.out.println(s + "="  + phonebook.get(s));

             }else{
                 System.out.println("Not found");
             }
         }
         
	}
}



