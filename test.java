class test{
public static void main(String[] args){
    int p = 9;
    int b;
    System.out.println(p);
    b = 24;
    p = 38;
    System.out.println(b);
    System.out.println(p);
    // we zijn procedureer bezig. Statement na statement na statement.
    // in een methode/functie mag je procedureer programmeren.
    
    if(b == 25){
        System.out.println("Is juist");
        System.out.println("Wat Knap");
    } else {
        System.out.println("Is niet juist")
    }
    
    b=p;
    System.out.println(b);
    ramenWassen();
    ramenWassen();
    ramenWassen();
    
    }
    static void ramenWassen (){
        System.out.println ("Pak een Emmer");
        System.out.println ("Doe het sop erin");
        System.out.println ("Lap het raam");
    }
}