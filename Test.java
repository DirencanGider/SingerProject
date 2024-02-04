import java.util.Scanner;

public class Test {

    private static Sarkicilar sarkicilar = new Sarkicilar(); /* Bu objeyi Main metodu içerisine yazmadık. Özellik olarak
                                                                class'ın içine yazdık. Aksi durumda diğer fonksiyonlardan
                                                                bu objeye erişemeyecektik.
                                                                Aynı zamanda burada Composition yapmış olduk. Başka bir
                                                                classtan objeyi(Sarkicilar) burada class'ımızın içine aldık. //1
                                                                */
    static Scanner scanner = new Scanner(System.in); /*Scanner'ı normal olarak yazınca main içerisinde konsoldan input
                                                       almaya çalışırken hata ile karşılaşıyordum. static yaptıktan sonra
                                                        hem main metodu dışında hem de içince nextLine(); ve nextInt();'ler
                                                        hata almadan çalıştılar.*/ // 2


    public static void islemleri_bastir() {

        System.out.println("\t 0-İşlemleri Görüntüle"); //Kullanıcı tekrardan bu işlemleri görüntülemek isterse 0'a basacak. //3
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çık");

    }
    public static void sarkici_goruntule() {
        sarkicilar.sarkicilari_bastir();
    }
    public static void sarkici_ekle() {
        System.out.println("Eklemek istediğiniz şarkıcının ismini giriniz : ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }
    public static void sarkici_guncelle()  {
        System.out.println("Güncellemek istediğiniz pozisyon(1,2,3... gibi) :");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Yeni şarkıcı ismini giriniz :");
        String yeni_isim = scanner.nextLine();
        sarkicilar.sarkici_guncelle(yeni_isim, pozisyon - 1); /* Kullanıcı 1'i seçmek istediğinde aslında
                                                                          aslında index olarak 0'ı seçmiş oluyor. Bu
                                                                          yüzden "pozisyon - 1" yaptık. */ //17
    }
    public static void sil() {
        System.out.println("Silmek istediğiniz şarkıcının listedeki sırasını giriniz(1,2,3... gibi) :");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();

        sarkicilar.sarkici_sil(pozisyon - 1); /* Kullanıcı 1'i seçmek istediğinde aslında
                                                                          aslında index olarak 0'ı seçmiş oluyor. Bu
                                                                          yüzden "pozisyon - 1" yaptık. */ //18
    }
    public static void ara() {
        System.out.println("Aramak istediğiniz şarkıcının ismini giriniz :");
        String sarkici_ismi = scanner.nextLine();
        sarkicilar.sarkici_ara(sarkici_ismi);

    }






    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz..."); //Bir miktar sağdan yazmak istediğimiz için \t kullandık. //4

        islemleri_bastir();

        //Burada iki adet değişken tanımlayacağız. //5

        boolean cikis = false; //Döngüden çıkıp çıkmayacağımızı belirleyecek değişken. //6

        int islem;

        while(!cikis) { //cikis false ise "not false" yapınca true oldu. Sonsuz döngüye girdi. Uygulama sürekli çalışacak kısacası. //7

            System.out.println("Bir işlem seçiniz: ");

            islem = scanner.nextInt();

            scanner.nextLine();/* nextInt(); den sonra başka bir yerde nextLine kullanacağımız zaman IDE Enter'ı
                                  bile nextLine olarak algılıyor. Bu yüzden buraya scanner.NextLine(); yazdık.
                                   Yani "Enter'ın sol tarafının, scanner.nextLine(); tarafının algılanmasını istiyorum"
                                   şeklinde birşey yaptık. Buna dummy işlem denmekte.*/ //8

            switch (islem) { // Derslerde switch yapısını pek kullanmadığımız için burada kullanıyoruz. //9
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkici_goruntule(); // Bu metodu henüz yazmadık. Önce yapımızı komple kuralım sonrasında yazacağız.  //10
                    break;
                case 2:
                    sarkici_ekle(); // Bu metodu da henüz yazmadık. Önce yapımızı komple kuralım sonrasında yazacağız.  //11
                    break;
                case 3:
                    sarkici_guncelle(); // Bu metodu da henüz yazmadık. Önce yapımızı komple kuralım sonrasında yazacağız.  //12
                    break;
                case 4:
                    sil(); // Bu metodu da henüz yazmadık. Önce yapımızı komple kuralım sonrasında yazacağız.  //13
                    break;
                case 5:
                    ara(); // Bu metodu da henüz yazmadık. Önce yapımızı komple kuralım sonrasında yazacağız.  //14
                    break;
                case 6:
                    cikis = true; // while içerisindeki çıkış true olursa döngü sonlanmış olacak //15
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;
            }

            //Şimdi main metodu dışına switch case içerisinde yazmış olduğumuz metodları tanımlayalım. //16

        }
    }

}
