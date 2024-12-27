public class Book{

    String kitapID;
    String kitapAdi;
    String yazar;
    String yayinYili;
    boolean durum;    //0 = ödünç verilmiş, mevcut değil------ 1 = kütüphanede mevcut

    public Book(String kitapId, String kitapAdi, String yazar, String yayinYili, boolean durum){
        this.kitapID = kitapId;
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this. yayinYili = yayinYili;
        this.durum = durum;
    }

    //getter'lar
    public String getKitapID() {
        return kitapID;
    }
    public String getKitapAdi() {
        return kitapAdi;
    }
    public String getYazar() {
        return yazar;
    }
    public String getYayinYili() {
        return yayinYili;
    }
    public boolean getDurum() {
        return durum;
    }

    //durum setter'ı
    public void setDurum(boolean durum){
        this.durum = durum;
    }

    //kitap bilgilerini gösteren metot
    /*public void kitapGoster(){
        System.out.println("Kitap Adı: "+getKitapAdi());
        System.out.println("Yazar: "+getYazar());
        System.out.println("Yayın Yılı: "+ getYayinYili());
        if (getDurum()){
            System.out.println("Durum: Mevcut");
        }else {
            System.out.println("Durum: Ödünç verilmiş");
        }
    }*/

    public String toString(){
        return "Kitap adı: " + kitapAdi +
                "\nYazar: " + yazar +
                "\nYayın Yılı: " + yayinYili +
                "\nDurum: " + (durum ? "Mevcut" : "Ödünç Verilmiş");
    }

}