package rzutkostka.Players;

public abstract class Player {
    protected String name;
    
    public Player(){
        this.name = "Anonym";
    }
    
    public Player(String name){   
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        if((name != null) && (!name.isEmpty()))
            this.name = name;
        else
            throw new IllegalArgumentException("Please correct name, it can't be empty");
    }
    
    public abstract int guess();
}
