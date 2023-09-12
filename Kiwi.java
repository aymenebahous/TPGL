/**
 * 
 * @author Aymene
 * 
*/

public class Kiwi {
    private double prix;
    private String origine;
	
    public Kiwi() 
    {
        this.prix = 1.5;  //prix en euros
        this.origine="Bresil";
    }
    
    public Kiwi(double prix, String origine) 
    {
	    if(prix < 0)
	        this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	    else
	        this.prix = prix;

	    if(origine.equals(""))
                this.origine = "Bresil";  //Espagne par défaut
	    else
                this.origine = origine;   
    }

    public double getPrix(){
	    return prix;
    }

    public void setPrix(double prix){
	    this.prix=prix;
    }

    public String getOrigine(){
	    return origine;
    }
 
    public void setOrigine(String origine){
	    this.origine=origine;
    }

    @Override
    public String toString(){
        return "Kiwi de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Kiwi or = (Kiwi) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	    System.out.println("premier test Orange");
        Kiwi k1 = new Kiwi();
        k1.setPrix(1.25);
        k1.setOrigine("Maroc");
        Kiwi k2 = new Kiwi(2.5, "Italie");
        System.out.println(k1.toString());        
        System.out.println(k2.toString());
        System.out.println(k1.equals(k2));
    }
}
