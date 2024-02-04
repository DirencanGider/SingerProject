import java.util.ArrayList;
public class Sarkicilar {

    private ArrayList<String> sarkici_listesi = new  ArrayList<String>(); /*Constructor kullanmadan direkt ArrayList'imizi
                                                                       başlattık ve Scanner gibi projeye dahil ettik.
                                                                       En üstte göründüğü gibi.
                                                                        */

    public void sarkicilari_bastir() {

        System.out.println("Şarkıcı Listesinde " + sarkici_listesi.size() + " kadar şarkıcı var.");
        System.out.println("Şarkıcılar :");

        for(int i = 0 ; i < sarkici_listesi.size() ; i++) {
            System.out.println((i+1) + ". Şarkıcı : " + sarkici_listesi.get(i));
        }

    }
    public void sarkici_ekle(String isim) {
        sarkici_listesi.add(isim);

        System.out.println("Şarkıcı Listesi Güncellendi...");
    }
    public void sarkici_guncelle(String yeni_isim, int pozisyon) {
        sarkici_listesi.set(pozisyon, yeni_isim);

        System.out.println("Şarkıcı Listesi Güncellendi...");
    }
    public void sarkici_sil(int pozisyon) {
        String isim = sarkici_listesi.get(pozisyon); /* Konsola bilgi yazdırırken isim belirtmek için pozisyondaki
                                                       veriyi isim verisine eşitledik. 2 satır aşağıda göründüğü gibi */

        sarkici_listesi.remove(pozisyon);

        System.out.println(isim + " isimli şarkıcı listeden silindi...");
    }
    public void sarkici_ara(String sarkici_ismi) {
        int pozisyon = sarkici_listesi.indexOf(sarkici_ismi);
        if(pozisyon >= 0) {
            System.out.println("Şarkıcı bulundu");
            System.out.println(sarkici_ismi + " isimli şarkıcı " + (pozisyon+1) + ". pozisyonda");
        }
        else {
            System.out.println("Şarkıcı Bulunamadı...");

        }
    }



}
