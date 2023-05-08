package com.academy.techcenture;

import com.github.javafaker.Faker;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Random;

public class CommonUtils {
    private CommonUtils () {}

       public static String generateRandomCellNumber () {
        Random rand=new Random();
        int num1 =rand.nextInt(7);
        int num2 =rand.nextInt(743);
        int num3 =rand.nextInt(1000);

        DecimalFormat df3 = new DecimalFormat( "000");// 3 zeros
        DecimalFormat df4 = new DecimalFormat( "0000"); // 4 zeros

       String phoneNumber =df3.format(num1)+ "-"+ df3.format(num2)+ "-"+ df4.format(num3);
       return phoneNumber;

    }

    public static long generateRandomCreditCardNumber() {
        long ccNumber= (long)(Math.random()*10000000000000000l)+1;
        return ccNumber;

    }
    public static int randomOneToTen(){
        int oneToTen = (int) (Math.random()*10)+1;
        return oneToTen;

 }
    public static String randomFullName() {
        Faker faker= new Faker();
        String fullName = faker.name().fullName();
        return fullName;

        }
        public static String randomStreetAddress() {
        Faker faker= new Faker(Locale.US);
        String streetAddress= faker.address().streetAddress();
        return streetAddress;

        }
    public static String randomCity() {
        Faker faker = new Faker(Locale.US);
        String city = faker.address().city();
        return city;

    }
    public static String randomStateAbr() {
        Faker faker = new Faker(Locale.US);
        String stateAbr = faker.address().stateAbbr();
        return stateAbr;

    }
    public static String randomZip() {
        Faker faker = new Faker(Locale.US);
        String zip = faker.address().zipCodeByState(randomStateAbr());
        return zip;

    }
       // public static void main(String[] args) {

     //System.out.println(randomStreetAddress());
   // }



}
