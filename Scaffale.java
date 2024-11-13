class Scaffale{
    private String id;
    private Libro[] libri;
    private int nLibri;
    private final int N = 10;
    
    Scaffale(String id){
        this.id = id;
        libri = new Libro[N];
        nLibri = 0;
    }
    
    public boolean aggiungi(Libro l){
        if (nLibri<N){
            libri[nLibri] = l;
            nLibri++;
            l.setCollocazione(this);
            return true;
        }
        return false;
    }
    
    public String elencaLibri(){
        String s=new String();
        for(int i=0;i<nLibri;i++){
           s+=libri[i].toString()+"\n";
            
        }
    }
    public String elencaLibri(String autore){
        String s=new String();
        for(int i=0;i<nLibri;i++){
            if(libri[i].getAutore().equals(autore)){
                s+=libri[i].toString()
            }
        }
    }
    public String toString(){
        return "idScaffale: "+id;
    }
}