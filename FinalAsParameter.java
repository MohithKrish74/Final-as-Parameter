package com.keyword;

class Person
{
    String Name;
    int Age;
    String PAN;
    public Person(final String PAN)
    {
        Name="Ram";
        Age=18;
       // PAN="QWE1239MNZ"; The error will be thrown if we try to assign value to PAN.
        System.out.println(Name+" "+Age+" "+PAN);
    }
}
public class FinalAsParameter
{
    public static void main(String[] args)
    {
       Person person = new Person("QAZXF8901C");
    }
}
