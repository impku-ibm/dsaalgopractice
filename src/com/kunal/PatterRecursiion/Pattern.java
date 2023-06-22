package com.kunal.PatterRecursiion;

public class Pattern {
    public static void main(String[] args) {
        printPattern(4,0);
        System.out.println();
        System.out.println("==================");
        System.out.println();
        normalTraingle(4,0);
    }
//****
//***
//**
//*
    static void printPattern(int row,int col){
        if(row==0){
            return;
        }
        if(row>col){
            System.out.print("*");
            printPattern(row,col+1);
        }else{
            System.out.println();
            printPattern(row-1,0);
        }
    }

    static void normalTraingle(int row,int col){
        if(row==0){
            return;
        }
        if(row>col){
            //row remains same and col increases
            normalTraingle(row,col+1);
            System.out.print("*");
        }else {
            //row decreses and column is reset to 0
            normalTraingle(row-1,0);
            System.out.println();
        }
    }
}
