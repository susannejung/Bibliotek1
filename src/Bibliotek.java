import java.util.ArrayList;

public class Bibliotek {
    private ArrayList<Bog> bogListe=new ArrayList<>();
    private ArrayList<Laener> laenerListe=new ArrayList<>();

    public Bibliotek() {
    }

    public Bibliotek(ArrayList<Bog> bogListe, ArrayList<Laener> laenerListe) {
        this.bogListe = bogListe;
        this.laenerListe = laenerListe;
    }

    public ArrayList<Bog> getBogListe() {
        return bogListe;
    }

    public void setBogListe(ArrayList<Bog> bogListe) {
        this.bogListe = bogListe;
    }

    public ArrayList<Laener> getLaenerListe() {
        return laenerListe;
    }

    public void setLaenerListe(ArrayList<Laener> laenerListe) {
        this.laenerListe = laenerListe;
    }

    public void tilfoejBog(Bog b){
        this.bogListe.add(b);
    }

    public void tilfoejBog(int bogId, String t,String f){
        this.bogListe.add(new Bog(bogId,t,f));
    }


    public void tilfoejLaener(Laener l){
        this.laenerListe.add(l);
    }

    public void tilfoejLaener(int lId,String fnavn, String enavn){
        this.laenerListe.add(new Laener(lId,fnavn,enavn));
    }

    public void udlaenBog(Bog b,Laener l,String dato){
        int index=bogListe.indexOf(b);
        bogListe.get(index).udlaenBog(l,dato);
        index= laenerListe.indexOf(l);
        laenerListe.get(index).laenBog(b);
    }

    public boolean erBogUdlant(Bog b){
        int index=bogListe.indexOf(b);
        return bogListe.get(index).isUdlant();
    }

    public void afleverBog(Bog b){
        int index=bogListe.indexOf(b);
        Laener l=bogListe.get(index).getLaener();
        bogListe.get(index).afleverBog();
        index=laenerListe.indexOf(l);
        laenerListe.get(index).afleverBog(b);
    }

    public ArrayList<Bog> udlanteBoeger(){
        ArrayList<Bog> udlante=new ArrayList<>();
        for(int i=0;i<bogListe.size();i++){
            if(bogListe.get(i).isUdlant()){
                udlante.add(bogListe.get(i));
            }
        }
        return udlante;
    }

    public Bog getBog(int bogId){
        for(int i=0;i<bogListe.size();i++){
            if(bogListe.get(i).getBogId()==bogId){
                return bogListe.get(i);
            }
        }
        return null;
    }

    public Laener getLaener(int lId){
        for(int i=0;i<laenerListe.size();i++){
            if(laenerListe.get(i).getlNr()==lId){
                return laenerListe.get(i);
            }
        }
        return null;
    }

    public Laener bogUdlantTil(Bog b){
        int index=bogListe.indexOf(b);
        Laener l=bogListe.get(index).getLaener();
        return l;
    }

    @Override
    public String toString() {
        return "Bibliotek{" +
                "bogListe=" + bogListe +
                ", laenerListe=" + laenerListe +
                '}';
    }
}