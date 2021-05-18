package ru.samsung.itschool.mdev;

import com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    static class Staff {
        public String name;
        public int age;
        public String position;
        public BigDecimal salary;
        public List<String> skills;
    }
    
    public static void main(String[] args) {

        String data = "{\"name\":\"Anton\",\"age\":15,\"position\":\"Junior\",\"salary\":100,\"skills\":[\"java\",\"xml\",\"python\",\"Android\"]}";

        Gson g = new Gson();

        Staff ivan = g.fromJson(data,Staff.class);

        System.out.println(ivan.skills.size());

        Staff petr = new Staff();
        petr.name = "Petr";
        petr.age = 14;

        String result = g.toJson(petr);

    }
}
