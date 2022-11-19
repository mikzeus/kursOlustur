public class kurs {

    Teacher ogretmen;
    String kursIsmi;
    String dersKodu;
    String kisaltma;
    int not;

    kurs(String kursIsmi, String dersKodu, String kisaltma) {
        this.dersKodu = dersKodu;
        this.kursIsmi = kursIsmi;
        this.kisaltma = kisaltma;
        int not=0;

    }
    void addTeacher(Teacher ogretmen){
        if (ogretmen.brans.equals(this.kisaltma)){
            this.ogretmen=ogretmen;
            TeacherInfo();
        }else {
            System.out.println("Ders ve ogretmen Bolumu uyusmuyor");
        }
    }

    void TeacherInfo() {
        this.ogretmen.printTeacher();
    }
}

