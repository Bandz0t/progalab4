package Errors;

import People.Person;

public class UnnamedCallError extends Exception{
    private String person;
    private String message;
    public UnnamedCallError(String person, String message){
        super(person + message);
    }
    public String getMessage(){
        return "Человек: " + person + message;
    }
}
