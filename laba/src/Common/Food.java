package Common;

import Errors.NameError;

public class Food extends Entity {
    public Food(String name) throws NameError {
        super(name);
        if(!name.isEmpty())
        {
            }
        else{
            throw new NameError("Объект не может быть создан без имени");
        }
    }

    private float taste;

    public float getTaste() {
        return taste;
    }

    public void setTaste(float taste) {
        this.taste = taste;
    }

}
