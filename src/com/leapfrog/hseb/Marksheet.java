package com.leapfrog.hseb;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sagar
 */
public class Marksheet {

    private double eng, math, comp, nep, acc;
    private double fullMark=500;
    private double passMark=40;
    
    private Scanner input = new Scanner(System.in);
    
    //Constructor
    public Marksheet (Scanner input){
        this.input=input;
    }
    
    public void setPassMark(double passMark){
        this.passMark=passMark;
    }
    public void entry() {
        System.out.println("English:");
        eng = input.nextDouble();
        System.out.println("Math:");
        math = input.nextDouble();
        System.out.println("Computer:");
        comp = input.nextDouble();
        System.out.println("Nepali:");
        nep = input.nextDouble();
        System.out.println("Account:");
        acc = input.nextDouble();

    }

    public boolean isFail() {
        return (eng < passMark || math < passMark || comp < passMark || nep < passMark || acc < passMark);
    }

    public double getTotal() {
        return (eng + math + comp + nep + acc);
    }

    public double getPercentage() {
        return (getTotal() / fullMark) * 100;

    }

    public String getGrade() {
        double per = getPercentage();
        String grade = "";
        if (per >= 80) {
            grade = "Distinction";
        } else if (per < 80 && per >= 60) {
            grade = "First Division";
        } else if (per < 60 && per >= 45) {
            grade = "Second Divison";
        } else {
            grade = "Third Disvision";
        }
        return grade;
    }

}
