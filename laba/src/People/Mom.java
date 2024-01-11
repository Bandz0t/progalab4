package People;

import Interfaces.Nameable;

public class Mom extends Person implements Nameable {
    public Mom(String name, Sex sex){
        super(name, sex);
    }

    @Override
    public String named(String name, Person person){
        System.out.printf(getName()+ " назвал" + pronunciation() + " " + person.getName() + " " + name + ". ");
        return (getName()+ " назвал" + pronunciation() + " " + person.getName() + " " + name + ". ");
    }

}
