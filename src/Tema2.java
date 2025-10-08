public class Tema2 {
    public static void main(String args[]){
        //TODO 01
        //Expected output
        /*
        * * * * *
        * * * * *
        * * * * *
        * * * * *       */
        System.out.println("Draw Full Shape");
        drawFullShape(5,5);

        System.out.println("Draw Outline Shape");
        drawShapeOutline(5,4);

        System.out.println("Draw Corners Shape");
        drawShapeCorners(5,5);

        numberOfDays(2000, 2016);
    }
    public static void drawFullShape(int width, int height){
        for (int x=0;x<width;x++){
            for(int y=0;y<height;y++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

        //TODO 02
        //Expected output
        /*
        * * * * * *
        *         *
        *         *
        * * * * * *           */
    public static void drawShapeOutline(int width, int height){
        for (int x=0;x<height;x++){
            for(int y=0;y<width;y++){
                if (x == 0 || x == height - 1 ){
                    System.out.print("* ");
                }
                else if (y == 0 || y == width - 1 ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

        //TODO 03
    //Expected output
    /*
    *    *

    *    *                                         */
    public static void drawShapeCorners(int width, int height){
        for (int x=0;x<height;x++){
            for(int y=0;y<width;y++){
                if (x == 0 & y == 0) {
                    System.out.print("* ");
                }
                else if (x == width - 1 & y == 0) {
                    System.out.print("* ");
                }
                else if  (y == height - 1 & x == 0) {
                    System.out.print("* ");
                }
                else if (y == height - 1 & x == width - 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }


    //TODO 04
    //number of days for February for an interval of years.
    public static void numberOfDays(int startYear, int endYear){
        int NORMAL_DAYS_FEBRUARY = 28;
        int LEAP_YEAR_DAYS_FEBRUARY = 29;
        int sumDaysInFebruary = 0;
        for (int year = startYear; year <= endYear; year++){
            boolean isLeapYear = false;
            if (((year % 4 == 0) & (year % 100 != 0)) || (year % 400 == 0) ){
                isLeapYear = true;
            }

            if (isLeapYear) {
                sumDaysInFebruary += LEAP_YEAR_DAYS_FEBRUARY;
                System.out.println(year + ":" + LEAP_YEAR_DAYS_FEBRUARY + " February");

            } else {
                sumDaysInFebruary += NORMAL_DAYS_FEBRUARY;
                System.out.println(year + ":" + NORMAL_DAYS_FEBRUARY + " February");
            }
        }
        System.out.println("From " + startYear + "-" + endYear + ":" + sumDaysInFebruary + " days in February.");
    }
}



