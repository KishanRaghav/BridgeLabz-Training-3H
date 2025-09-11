import java.util.ArrayList;
public class Doctor {
    private String name;
    private ArrayList<Patient> patients;
public Doctor(String name){this.name=name;this.patients=new ArrayList<>();}
public void consult(Patient p){patients.add(p); System.out.println(name+" consulted "+p.getName());}
public ArrayList<Patient> getPatients(){return patients;}
public String getName(){return name;}
}
