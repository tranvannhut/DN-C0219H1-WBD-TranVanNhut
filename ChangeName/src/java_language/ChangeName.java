package java_language;

public class ChangeName {
    private String name = "Nhut";
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public static void main(String[] args){
        ChangeName name = new ChangeName();
        System.out.println(name.getName());
        name.setName("Anh");
        System.out.println(name.getName());
    }
}

