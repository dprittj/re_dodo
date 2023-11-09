package redodo.redodobackend.Models;

public class Interest {
    private static int id;

    private static String name;

    public Interest() {

    }

    public Interest(int aId, String aName) {
        this.id = aId;
        this.name = aName;
    }

    public void setInterest(String aName){
        this.name = name;
    }

    public static String getInterest(){
        return name;
    }

    public static Integer getId() {
        return id;
    }


}
