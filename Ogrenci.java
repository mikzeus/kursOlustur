public class Ogrenci {

    kurs d1;
    kurs d2;
    kurs d3;
    String Adi;
    String Soyadi;
    String Bolumu;
    double notOrtalamasi;
    boolean isPass;

    Ogrenci(String Adi, String Soyadi, String Bolumu,kurs d1, kurs d2, kurs d3){
        this.Adi= Adi;
        this.Soyadi=Soyadi;
        this.Bolumu=Bolumu;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.notOrtalamasi=0.0;
        this.isPass=false;

    }
    void notGir(int d1Not, int d2Not, int d3Not){

        if (d1Not>=0 && d1Not<=100){
            this.d1.not= d1Not;

        }if (d2Not>=0 && d2Not<=100){
            this.d2.not=d2Not;

        }if (d3Not>=0 && d3Not<=100){
            this.d3.not=d3Not;
        }
    }

    void isPass(){
        this.notOrtalamasi= (this.d1.not + this.d2.not + this.d3.not)/3.0;

        if (notOrtalamasi>60){
            System.out.println("TEBRIKLER !!! Sinifi Gectiniz");
            this.isPass=true;
        } else {
            System.out.println("Sinifta Kaldiniz !!!");
            this.isPass=false;
        }
    }
    void printNot(){

        System.out.println(this.d1.kursIsmi +"Notu\t: "+this.d1.not);
        System.out.println(this.d2.kursIsmi +"Notu\t: "+this.d2.not);
        System.out.println(this.d3.kursIsmi +"Notu\t: "+this.d3.not);
        System.out.println("Ortalamaniz: " + this.notOrtalamasi);

    }

}
