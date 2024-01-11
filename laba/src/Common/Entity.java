package Common;

import Common.Time;

public abstract class Entity {
    private String name;
    public Entity(String name){
        this.name = name;
    }

    public String DayState(Time time){
            String word = switch (time){
                case MORNING -> "утром";
                case DAY -> "днём";
                case EVENING -> "вечером";
                case NEXTMORNING -> "следующим утром";
            };
            return word;

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Имя: " + getName();
    }
}
