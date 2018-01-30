public class Henkilo {
    private String etunimi;
    private String sukunimi;
    int ika;

    public Henkilo (String etu, String suku, int ikavuodet) {
        this.etunimi = etu;
        this.sukunimi = suku;
        this.ika = ikavuodet;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        if(ika < 0) return;
        this.ika = ika;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    @Override
    public String toString() {
        return (this.etunimi + " " + this.sukunimi + " on " + this.ika + " vuotta vanha. " );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        Henkilo h = (Henkilo)obj;
        if (etunimi.equals(h.etunimi) && sukunimi.equals(h.sukunimi)) {
            return true;
        }
        return false;
    }

}

