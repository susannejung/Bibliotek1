public class Bog {
    private int bogId;
    private String titel;
    private String forfatter;
    private boolean udlant;
    private String udlaensDato;
    private Laener laener;



    public Bog() {
    }

    public Bog(int bogId, String titel, String forfatter) {
        this.bogId = bogId;
        this.titel = titel;
        this.forfatter = forfatter;
        this.udlant = false;
        this.udlaensDato = "";
        this.laener=null;
    }

    public int getBogId() {
        return bogId;
    }

    public void setBogId(int bogId) {
        this.bogId = bogId;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    public boolean isUdlant() {
        return udlant;
    }

    public void setUdlant(boolean udlant) {
        this.udlant = udlant;
    }


    public String getUdlaensDato() {
        return udlaensDato;
    }

    public void setUdlaensDato(String udlaensDato) {
        this.udlaensDato = udlaensDato;
    }

    public Laener getLaener() {
        return laener;
    }

    public void setLaener(Laener laener) {
        this.laener= laener;
    }

    public void udlaenBog(Laener laener,String udlaensDato){
        this.laener=laener;
        this.udlaensDato=udlaensDato;
        udlant=true;
    }

    public void afleverBog(){
        laener=null;
        this.udlaensDato="";
        udlant=false;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "bogId=" + bogId +
                ", titel='" + titel + '\'' +
                ", forfatter='" + forfatter + '\'' +
                ", udlant=" + udlant +
                ", udlaensDato='" + udlaensDato + '\'' +
                ", laener=" + laener +
                '}';
    }
}
