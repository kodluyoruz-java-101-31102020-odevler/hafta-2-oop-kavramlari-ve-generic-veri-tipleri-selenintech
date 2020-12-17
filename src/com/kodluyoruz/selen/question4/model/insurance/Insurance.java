package com.kodluyoruz.selen.question4.model.insurance;

import java.util.Date;

public abstract class Insurance {
    private String name;
    private double price;
    private Date startDate;
    private Date endDate;

    abstract double calculate();

}









