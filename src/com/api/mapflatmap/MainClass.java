package com.api.mapflatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        List<String> citiesWorkedIn1=new ArrayList<>();
        citiesWorkedIn1.add("Tehran");
        citiesWorkedIn1.add("Karaj");
        citiesWorkedIn1.add("Ghazvin");
        citiesWorkedIn1.add("Shahriyar");
        Employee employee1=new Employee(1,"Code",citiesWorkedIn1);

        List<String> citiesWorkedIn2=new ArrayList<>();
        citiesWorkedIn2.add("Tehran");
        citiesWorkedIn2.add("Karaj");
        citiesWorkedIn2.add("Rasht");
        Employee employee2=new Employee(2,"Code",citiesWorkedIn2);

        List<String> citiesWorkedIn3=new ArrayList<>();
        citiesWorkedIn3.add("Tehran");
        citiesWorkedIn3.add("Chalos");
        Employee employee3=new Employee(3,"Code",citiesWorkedIn3);

        List<Employee> employeesList=new ArrayList<>();
        employeesList.add(employee1);
        employeesList.add(employee2);
        employeesList.add(employee3);


        System.out.println(employeesList);

        List<Integer> ids=employeesList.stream().map(emp -> emp.getId()).collect(Collectors.toList());
        System.out.println(ids);
        
        List<List<String>> names=employeesList.stream().map(emp -> emp.getCitesWorkedIn()).collect(Collectors.toList());
        System.out.println(names);

        Set<List<String>> namesSet=employeesList.stream().map(emp -> emp.getCitesWorkedIn()).collect(Collectors.toSet());
        System.out.println(namesSet);

        Set<String> names1Set=employeesList.stream().flatMap(emp -> emp.getCitesWorkedIn().stream()).collect(Collectors.toSet());
        System.out.println(names1Set);



    }
}
