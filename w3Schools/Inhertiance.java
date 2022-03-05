package w3Schools;

class Vehicle{
    protected String brand = "ford";

    void engineSound(){
        System.out.println("Bruuuumm, Bruuuum!!");
    }
}

public class Inhertiance extends Vehicle{
    private String name = "mustang";
    public static void main(String[] args) {
        Inhertiance obj = new Inhertiance();
        obj.engineSound();
        System.out.println("name "+obj.name+" Brand "+obj.brand);
    }
}
