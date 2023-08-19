class Modifier {
    private String name;

    //Getter Methode
    public String getName(){
        return this.name;
    }

    //Setter Methide
    public void setName(String name){
        this.name = name;
    }
    
}

public class SeterAndGetter{
    public static void main(String[] args) {
        Modifier d = new Modifier();
        // access the private variable using the getter and setter
        d.setName("Programiz");
        System.out.println(d.getName());
    }
}
