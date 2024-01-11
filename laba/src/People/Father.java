package People;

public class Father extends Person{
    public Father(String name, Sex sex){
        super(name, sex);
    }

    public String call(Person person,String place){
        person.setJoy(person.getJoy()*1.3F);
        System.out.printf(this.getName() + " звонил" + pronunciation() + " " + person.getName() + " из " + place + ". ");
        return (this.getName() + " звонил" + pronunciation() + " " + person.getName() + " из " + place + ". ");
    }
}
