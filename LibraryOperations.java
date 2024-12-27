import java.util.ArrayList;
import java.util.Scanner;

public class LibraryOperations {

    ArrayList<Book> kitapListesi = new ArrayList<>();
    //ArrayList<User> kullanıcıListesi = new ArrayList<>();

    public void kitapEkle(Book yeniKitap){
        kitapListesi.add(yeniKitap);
    }

    public void kitapSil(String kitapAdi){
        for(Book kitap : kitapListesi){
            if(kitap.getKitapAdi().equalsIgnoreCase(kitapAdi)){
                kitapListesi.remove(kitap);
                System.out.println("Kitap silindi: " + kitap.getKitapAdi());
                return;
            }
        }
        System.out.println("Kitap bulunamadı.");
    }

    public void oduncVer(String kitapAdi){
        for(Book kitap : kitapListesi){
            if (kitap.getKitapAdi().equalsIgnoreCase(kitapAdi)){
                kitap.setDurum(false);
                System.out.println("Kitap ödünç verildi: " + kitap.getKitapAdi());
                return;
            }
        }
        System.out.println("Kitap bulunamadı veya mevcut değil.");
    }

    public void iadeEt(String kitapAdi){
        for(Book kitap : kitapListesi){
            if (kitap.getKitapAdi().equalsIgnoreCase(kitapAdi)){
                kitap.setDurum(true);
                System.out.println("Kitap iade edildi: " + kitap.getKitapAdi());
                return;
            }
        }
        System.out.println("Kitap bulunamadı veya zaten kütüphanede.");
    }

    public void kitapListele(){
        if (kitapListesi.isEmpty()){
            System.out.println("Kütüphanede hiç kitap yok. ");
            return;
        }
        for (Book kitap : kitapListesi){
            System.out.println(kitap);
            System.out.println("------------------------------");
        }
    }

    public void kitapAra(String kitapAdi){
        for (Book kitap : kitapListesi){
            if (kitap.getKitapAdi().equalsIgnoreCase(kitapAdi)){
                System.out.println("Kitap bulundu: ");
                System.out.println(kitap);
                return;
            }
        }
        System.out.println("Kitap bulunamadı. ");
    }

}
