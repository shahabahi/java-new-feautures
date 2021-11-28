package com.api.mapflatmap;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private List<String> citesWorkedIn;

    public Employee(int id, String name, List<String> citesWorkedIn) {
        this.id = id;
        this.name = name;
        this.citesWorkedIn = citesWorkedIn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCitesWorkedIn() {
        return citesWorkedIn;
    }

    public void setCitesWorkedIn(List<String> citesWorkedIn) {
        this.citesWorkedIn = citesWorkedIn;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", citesWorkedIn=" + citesWorkedIn +
                '}';
    }
}
