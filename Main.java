class Main{
    public static void main(String args[]){
        //Istanziare uno scaffale
        Scaffale s1=new Scaffale("190");
    
        //Istanziare due oggetti di classe Libro e aggiungerli allo scaffale
        Libro l1=new Libro("harry potter", "J.K. Rowing", 22, 227, "Giunti");
        Libro l2=new Libro("topolino", "Disney", 18, 239, "Mondadori");
        Libro l3=new Libro("Dragon ball", "Akira Toriyama", 9, 122 "Star comics");
        Libro l4=new Libro("Centro Casale", "Acquaviva Francioso", 14
        s1.aggiungi(l1);
        s1.aggiungi(l2);
        
        
        //Visualizzare il contenuto dello scaffale
        s1.elencaLibri();
        
        
        
    }
}