package com.btc.jsp1;

public class Main {

	public static void main(String[] args) {
		WrittenItem b=new Book(12, "YOU CAN WIN", 150, "AUTHOR_ABC");
		System.out.println(b);
		b.showauthordetails();
		b.additem();
		b.checkin();
		b.checkout();
		b.print();
		WrittenItem w=new JournalPaper(8, "SKY HIGH", 265,"Jay", "JAN-20-2020");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println(w);
		w.showauthordetails();
		w.additem();
		w.checkin();
		w.checkout();
		w.print();
		System.out.println("-------------------------------------------------------------------------------------------");
		MediaItem m=new Video(77, "The Secret", 987, 1365, "Rhonda", "Spiritual", "Nov-2006");
		System.out.println(m);
		m.show_details_media();
		m.additem();
		m.checkin();
		m.checkout();
		m.print();
		System.out.println("-------------------------------------------------------------------------------------------");
		MediaItem m1=new Cd(77, "Anything", 70, 125, "abc", "Cooking");
		System.out.println(m1);
		m1.show_details_media();
		m1.additem();
		m1.checkin();
		m1.checkout();
		m1.print();
		
	}

}
