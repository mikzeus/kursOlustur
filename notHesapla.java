public class notHesapla {
    public static void main(String[] args) {
        Teacher t1= new Teacher("Ahmet Hoca", "1211","TRH");
        Teacher t2 = new Teacher("Mustafa Hoca", "1234", "FZK");
        Teacher t3 = new Teacher("sirin hoca"," 2111","BIO");
        t1.printTeacher();
        t2.printTeacher();
        t3.printTeacher();

        kurs tarih=new kurs("Tarih","101", "TRH");
        kurs fizik = new kurs("Fizik", "102", "FZK");
        kurs biyo = new kurs("Biyoloji", "103", "BIO");

        Ogrenci k1= new Ogrenci("Mustafa", "Uner", "Bilgisayar Programciligi",tarih,fizik,biyo);
        Ogrenci k2 = new Ogrenci("Mikail", "Uner", "Sosyal Bilgi", tarih,fizik,biyo);
        Ogrenci k3=new Ogrenci("Zehra", "Uner", "Resim",fizik,tarih,biyo);

        k1.notGir(67,89,27);
        k1.isPass();
        k1.printNot();

        k2.notGir(65,89,12);
        k2.isPass();
        k2.printNot();

        k3.notGir(60,98,12);
        k3.isPass();
        k3.printNot();
    }
}
