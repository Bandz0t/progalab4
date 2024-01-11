package Common;

public class Motor {
    private float serviceability;
    public void success() {
        if (getServiceability()>Math.random()){
            System.out.printf("Мотор завелся. ");
        }
        else {
            System.out.printf("Мотор не завелся. ");
        }
    }
    public float getServiceability() {
        return serviceability;
    }
    public void setServiceability(float serviceability) {
        this.serviceability = serviceability;
    }
}
