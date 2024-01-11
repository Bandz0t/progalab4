package People;

public class Carlson extends Person{
    public Carlson(String name, Sex sex){
        super(name, sex);
    }

    public void chew(){
        System.out.printf(getName() + " проглотил последнюю тефтельку. ");
    }

    public void jump(String place){
        System.out.printf(getName() + " прыгнул" + pronunciation() + " на " + place + ". ");
    }

    public void on(){
        System.out.printf(getName() + " нажал" + pronunciation() + " на кнопку. ");
    }

    public void fly(String place){
        System.out.printf(getName() + " полетел" + pronunciation() + " в " + place + ". ");
    }


}
