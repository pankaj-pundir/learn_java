package w3Schools;

abstract class Human{
    private String name;
    void setName(String name){
        this.name = name;
    }
    String getName() {return name;}
    abstract String myName();
    abstract String myInfo();
}

public class Abstract extends Human{
    String myName(){
        return getName();
    }

    @Override
    String myInfo() {
        // TODO Auto-generated method stub
        return "My name is " + getName();
    }

    public static void main(String[] args) {
        Abstract my = new Abstract();
        my.setName("pankaj");
        System.out.println( my.myInfo());
    }
    

}
