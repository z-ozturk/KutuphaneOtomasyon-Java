public class User {
    String userID;
    String kullaniciAdi;
    boolean yetki;

    public void User(String userID, String kullaniciAdi, boolean yetki){
        this.userID = userID;
        this.kullaniciAdi = kullaniciAdi;
        this.yetki = yetki;    //1 = admin, 0 = user
    }

    public String getUserID(){
        return userID;
    }
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }
    public boolean getYetki() {
        return yetki;
    }

    public void kullaniciBilgisiGoruntule(User user){
        System.out.println(user);
    }
}
