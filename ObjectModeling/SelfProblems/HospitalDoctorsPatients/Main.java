public class Main {
    public static void main(String[] args){
        Hospital h=new Hospital("City Hospital");
        Doctor d1=new Doctor("Dr. A");
        Doctor d2=new Doctor("Dr. B");
        Patient p1=new Patient("Raju");
        Patient p2=new Patient("Meera");
        h.addDoctor(d1);
        h.addDoctor(d2);
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}
