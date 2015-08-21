import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by karthikr on 16/08/15.
 */
public class Vowelcount {

        public static void main(String []args)
        {
            String s;
            Character ch;
            int count=0;
            ArrayList<Character> a=new ArrayList<Character>();

            Scanner in=new Scanner(System.in);
            System.out.println("Enter your name:");
            s=in.next();

            a.add('a');
            a.add('e');
            a.add('i');
            a.add('o');
            a.add('u');


            for(int i=0;i<s.length();++i)
            {
                if(a.contains((Character)s.charAt(i)))
                    count++;



            }

            System.out.println("Vowel count"+count);





        }

}


