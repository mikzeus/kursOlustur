public class Teacher {
    String isim;
    String sicilNo;
    String brans;

    Teacher (String isim,String sicilNo, String brans)
    {
    this.isim=isim;
    this.sicilNo=sicilNo;
    this.brans= brans;
    }
    void printTeacher (){
        System.out.println("Ogretmen adi: " +this.isim);
        System.out.println("sicil no'su:  "+ this.sicilNo);
        System.out.println("ogretmenin bransi:  "+ this.brans);

    }
}