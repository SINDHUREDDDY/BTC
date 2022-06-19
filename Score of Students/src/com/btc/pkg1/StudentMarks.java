package com.btc.pkg1;

public class StudentMarks 
{
	/* adding 4 integer values.*/


    public int calculateMarks(int physics, int chemistry, int maths) {


        return physics+chemistry+maths;
    }

    /* adding 3 integer values.*/
    public int calculateMarks(int physics, int chemistry, int maths, int bio) {


        return physics+chemistry+maths+bio;
    }

    /* adding 4 double values.*/
    public double calculateMarks(double physics, double chemistry, double maths, double bio) {


        return physics+chemistry+maths+bio;
    }

    /* static method adding 5 float values.*/
    public static float calculateMarks(float maths, float bio, float physics, float chemistry, float lang) {


        return maths+bio+physics+chemistry+lang;
    }


    /* adding 4 float values with order changed.*/
    public float calculateMarks(float maths, float bio, float physics, float chemistry) {



        return maths+bio+physics+chemistry;
    }
    public static void main(String[] args) 
    {
    	System.out.println("Float Static method "+calculateMarks(65f,88f,56f,67f,77f));
    	StudentMarks s=new StudentMarks();
    	System.out.println("Float NonStatic Method "+s.calculateMarks(65f,88f,56f,67f));
    	System.out.println("Double NonStatic Method "+s.calculateMarks(56.0, 95, 65, 70.0));
    	System.out.println("Integer Method with 4 values " +s.calculateMarks(60, 70, 58, 88));
    	System.out.println("Integer Method with 3 values " +s.calculateMarks(70, 58, 88));
		
	}

}
