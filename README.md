# SHORTEST WORD


public class Shortestword{
    public static void main(String args[]){
        String[] words =  {"Atrocity", "Pensive", "Imperceptible", "Discordant"};
        String shortest = words[0];
        for ( int i=0; i<words.length; i++)
        {
            if(words[i].length() <= shortest.length())
            {
                shortest = words[i];
            }
        }
        System.out.println(shortest);

    }
}



# Fencing a Barn


import java.util.Scanner;
class FencingaBarn
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("press 1 for Square area of chicken");
        System.out.println("press 2 for circular area for ducks");
        System.out.println("press 3 for Rectangular area for cows");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1: 
                System.out.println("enter square value");
                int sides=s.nextInt();
                System.out.println(sides*sides);
                break;
            case 2:
                System.out.println("enter square value");
                int side=s.nextInt();
                System.out.println(3.142*side*side);
                break;
            case 3:
                System.out.println("enter length  value");
                int l=s.nextInt();
                System.out.println("enter width value");
                int w=s.nextInt();
                System.out.println(l*w);
                break;
            default:
                System.out.println("invalid value");
        }
        
        
    }
}

