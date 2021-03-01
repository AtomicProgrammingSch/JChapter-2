package com.atomicprogramming.chapter2;

public class task2 {

    public static void main(String[] args) {
        int DaysInSchoolYear = 192;
        int HoursInSchoolDay = 6;
        int TotalHoursInSchoolYear = DaysInSchoolYear * HoursInSchoolDay;
        int TotalHoursInSchool = TotalHoursInSchoolYear * 5; // 5 years in secondary school
        System.out.println("The total time spent within school is " + TotalHoursInSchool + " hours!");
    }
}
