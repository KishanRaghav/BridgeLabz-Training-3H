import java.util.ArrayList;
public class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
public Hospital(String name){this.name=name;this.doctors=new ArrayList<>();}
public void addDoctor(Doctor d){doctors.add(d);}
public ArrayList<Doctor> getDoctors(){return doctors;}
}
