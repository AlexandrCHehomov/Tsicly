package com.company;

public class Main {

    public static void main(String[] args) {
	//1
        int start = 1;
        while (start <= 10) {
            System.out.println(start);
            start ++;
        }
        int start1 = 10;
        for (start1 = 10; start1 > 0; start1--) {
            System.out.println(start1);
        }


    //2
    int day = 1;
        while (day <= 31) {
            System.out.println("Сегодня пятница " + day + "-е число. Необходимо подготовить отчет");
            day = day + 7;
        }
    //3
    int year = 0;
        for (; year <= 2121; year = year +79) {
            if (year >= 1821) {
                System.out.println(year);
            }
        }

    }
}
