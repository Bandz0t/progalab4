package People;

public class FrBok extends Person{
    public FrBok(String name, Sex sex){
        super(name, sex);
    }
    public String shut(){
        System.out.printf(getName() + " вскрикнул" + pronunciation() + ". ");
        return (getName() + "вскрикнул" + pronunciation() + ". ");
    }
}
