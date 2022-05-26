package day10_LoopReview;

import java.util.Calendar;

public class programOfCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int month = 9;
        int days = 0;
        if (month == 1) {
            days = 31;
        } else if (month == 2) {
            days = 28;

        } else if (month == 3) {
            days = 31;

        } else if (month == 4) {
            days = 30;

        } else if (month == 5) {
            days = 31;

        } else if (month == 6) {
            days = 30;

        } else if (month == 7) {
            days = 31;

        } else if (month == 8) {
            days = 31;

        } else if (month == 9) {
            days = 30;

        } else if (month == 10) {
            days = 31;

        } else if (month == 11) {
            days = 30;

        } else if (month == 12) {
            days = 31;

        }

        System.out.println(days);

        switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            days = 31;
            break;
        case 2:
            days = 28;
            break;
        default:
            days = 30;

        }

        System.out.println(days);

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Has 31 day");
        }

        if (month == 2) {
            System.out.println("Has 29 days");
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Has 30 days");
        }
        
        
        
        boolean has30Day = (month == 4 || month == 6 || month == 9 || month == 11) ? true : false;
        boolean has31Day = (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) ? true : false;
        boolean has28Day = (month == 2 ) ? true : false;
        
        
        if (has30Day) {
            System.out.println("Has 30 days");
        }
        
        
        if (has31Day) {
            System.out.println("Has 31 days");
        }
        
        if (has28Day) {
            System.out.println("Has 28 days");
        }

}
}
