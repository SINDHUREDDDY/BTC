# Unique Arrays


import java.util.Scanner;
class UniqueArrays
{
    public static void check(int a[],int l)
    {
        int count=0;
        for(int i = 0; i < l; i++) {  
        for(int j = i + 1; j < l; j++) {  
            if(a[i] == a[j])  
            {
                count++;
            }
        }  
    }  
    if(count>=1)
    {
        System.out.println("false");
    }
    else
    {
        System.out.println("true");   
    }   
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements into array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        check(arr,n);  
    }
}


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


# Calorie Tracker


class Calorietracker
{
    public static void main(String[] arg)
    {
        System.out.println("Calorie burnt by cycling : 300\nCalorie burnt by running : 500\nCalorie burnt by swimming: 200\nCalorie intake in a day  : 100\n");
        int week=((300*2)+(500*2)+(200*2))*4;
        int intake=100*30;
        int calories=week-intake;
        double weightloss= calories/1000;
        System.out.println("Weight lost by Anne in a month is : " + weightloss+" pounds");
    }
}


# Fencing a Barn


import java.util.Scanner;
class FencingaBarn
{
    public static void square(double s)
    {
        System.out.println("Area of square fence for chickens is " + s*s);
    }
    public static void circular(double radius)
    {
        System.out.println("Area of circular area for the ducks is " + 3.142*radius*radius);
    }
    public static void rectangular(double l, double w)
    {
        System.out.println("Area of rectangular area for the cows is " + l*w);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println(" press 1 for Square area of chicken\npress 2 for circular area for ducks\npress 3 for Rectangular area for cows\n ");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1: 
                System.out.println("enter side value");
                double sides=s.nextInt();
                square(sides);
                break;
            case 2:
                System.out.println("enter radius value");
                int radius=s.nextInt();
                circular(radius);
                break;
            case 3:
                System.out.println("enter length  value");
                int l=s.nextInt();
                System.out.println("enter width value");
                int w=s.nextInt();
                rectangular(l,w);
                break;
            default:
                System.out.println("invalid value");
        } 
    }
}

