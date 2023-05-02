package com.example.zoo;

public class Employee {
    private int age;
    private String name;
    private String birthDate;
    private int salary;

    public Employee(int age, String name, String date, int salary){
        this.age = age;
        this.name = name;
        this.birthDate = date;
        this.salary = salary;
    }

    public void checkBirthday(String date){
        if (birthDate == date){
            this.age++;
        }
    }

    public String getName(){
        return this.name;
    }

    public void promote(int extra){
        this.salary += extra;
    }
    
    public int getSalary(){
        return this.salary;
    }
}
