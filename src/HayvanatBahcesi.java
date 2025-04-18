// Yüzebilme arayüzü
interface Yuzebilir {
    int MAX_DERINLIK = 200;

    void yuz();

    default void suAltindaNefesAl() {
        System.out.println("Su yüzeyine çıkıp nefes alıyor...");
    }

    static void suSicakligiKontrol() {
        System.out.println("Su sıcaklığı ölçülüyor...");
    }
}

// Koşabilme arayüzü
interface Kosabilir {
    void kos();

    default void dinlen() {
        System.out.println("Dinleniyor...");
    }
}

// Avlanabilme arayüzü
interface Avlanabilir {
    void avYakala();
}

// Penguen sınıfı hem yüzebilir hem koşabilir
class Penguen implements Yuzebilir, Kosabilir {
    private String isim;

    public Penguen(String isim) {
        this.isim = isim;
    }

    @Override
    public void yuz() {
        System.out.println(isim + " pengueni suda hızla yüzüyor!");
    }

    @Override
    public void kos() {
        System.out.println(isim + " pengueni karada sallanarak koşuyor!");
    }

    @Override
    public void suAltindaNefesAl() {
        System.out.println(isim + " pengueni özel nefes teknikleri kullanıyor!");
    }
}

// Çita sınıfı hem koşabilir hem avlanabilir
class Cita implements Kosabilir, Avlanabilir {
    @Override
    public void kos() {
        System.out.println("Çita saatte 120km hızla koşuyor!");
    }

    @Override
    public void avYakala() {
        System.out.println("Çita avını yakaladı!");
    }

    @Override
    public void dinlen() {
        System.out.println("Çita ağacın gölgesinde dinleniyor...");
    }
}

// Balina sınıfı sadece yüzebilir
class Balina implements Yuzebilir {
    @Override
    public void yuz() {
        System.out.println("Dev balina okyanusta süzülüyor...");
    }
}

public class HayvanatBahcesi {
    public static void main(String[] args) {
        // Penguen
        Penguen pingu = new Penguen("Pingusu");
        pingu.yuz();
        pingu.kos();
        pingu.suAltindaNefesAl();

        System.out.println("-----");

        // Çita
        Cita hizliCita = new Cita();
        hizliCita.kos();
        hizliCita.avYakala();
        hizliCita.dinlen();

        System.out.println("-----");

        // Balina
        Balina maviDev = new Balina();
        maviDev.yuz();
        maviDev.suAltindaNefesAl(); // Varsayılan metot

        System.out.println("-----");

        // Arayüz sabiti ve statik metot kullanımı
        System.out.println("Maksimum yüzme derinliği: " + Yuzebilir.MAX_DERINLIK + " metre");
        Yuzebilir.suSicakligiKontrol();

        // Polymorphism örneği
        Yuzebilir[] yuzuculer = {pingu, maviDev};
        for (Yuzebilir yuzucu : yuzuculer) {
            yuzucu.yuz();
        }
    }
}