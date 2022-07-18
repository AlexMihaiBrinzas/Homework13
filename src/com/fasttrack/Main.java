package com.fasttrack;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Days monday = Days.Monday;
        Days tuesday = Days.Tuesday;
        Days wednesday = Days.Wednesday;
        Days thursday = Days.Thursday;
        Days friday = Days.Friday;
        Days saturday = Days.Saturday;
        Days sunday =Days.Sunday;

        System.out.println(monday);
        System.out.println(tuesday);
        System.out.println(wednesday);
        System.out.println(thursday);
        System.out.println(friday);
        System.out.println(saturday);
        System.out.println(sunday);

        List<String> activities =new ArrayList<>();
        activities.add("fotbal");
        activities.add("dans");
        activities.add("movies");
        activities.add("work");
        activities.add("gaming");
        activities.add("programing");
        System.out.println(activities);



    }
}
