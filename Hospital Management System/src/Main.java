import hospital.Patient;
import hospital.Storage;

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Storage storage = new Storage();
        System.out.println("welcome to hospital management system!");
        System.out.println("Enter 1 to start!");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sc.nextLine();
        if(x!=1)
        {
            System.out.println("Please enter 1 to start! @reStart the code");
            return;
        }
        while(x!=0)
        {
            System.out.println("---------------------------------------------------");
            System.out.println("Choose the services below");
            System.out.println("1.Add Patient");
            System.out.println("2.Get All patient data");
            System.out.println("3.Get a particular data");
            System.out.println("4.Token");
            x=sc.nextInt();
            sc.nextLine();
            if(x==1) {
                System.out.println("Enter the Patient details!");
                System.out.println("What is his/her name?");
                String name = sc.nextLine();
                System.out.println("What is his/her contact number?");
                String contact = sc.nextLine();
                if (Storage.isDataAvailable(contact)) {
                    System.out.println("Patient data is already exist!");
                }
                System.out.println("What is his/her age");
                String age = sc.nextLine();
                System.out.println("What is his/her address");
                String address = sc.nextLine();
                Patient patient = new Patient(name, contact, address, age);
                if (Storage.addPatient(contact, patient)) {
                    System.out.println("Patient details stored succuessfully!");
                }
            }
            else if(x==2)
            {
                System.out.println("-------------Patient data base------------------------");
                System.out.println("Here is the Patient data base!");
                System.out.println("Enter the your secret id");
                int Id=sc.nextInt();
                System.out.println("Enter your password");
                int Pass=sc.nextInt();
                int id=7;
                int pass=7;
                sc.nextLine();
                if(id==Id && pass==Pass)
                {
                    HashMap<String,Patient> patientData= Storage.getPatients();
                    System.out.println("------------Patient data records-----------");
                    for(Map.Entry<String,Patient> e:patientData.entrySet()) {
                        String name = e.getValue().name;
                        String contact = e.getKey();
                        String age = e.getValue().age;
                        System.out.println(name + "      " + age + "    " + contact);
                        System.out.println();
                    }
                }
            }
            else if(x==3)
            {
                System.out.println("-------------Get a particular patient details!------------------------");
                System.out.println("Enter the Patient id");
                String id=sc.nextLine();
                if(Storage.isDataAvailable(id)) {
                    System.out.println("------------Patient data records-----------");
                    Patient patient = Storage.getPatientData(id);
                    String name = patient.name;
                    String contact = patient.contact;
                    String age = patient.age;
                    System.out.println(name + "      " + age + "    " + contact);
                    System.out.println();
                }
                else
                {
                    System.out.println("No data found!");
                }
            }
            else if(x==4)
            {
                System.out.println("-------------Tokening System------------------");
                System.out.println("1.Neurology (Brain,Nerves)");
                System.out.println("2.Cardiology (Heart)");
                System.out.println("3.ENT (Ears,Nose,Throat)");
                System.out.println("4.Orthopredicts (Bones)");
                System.out.println("5.Gynocology (Stomach)");
                System.out.println("6.Ophthalmology (Eye)");
                System.out.println("7.Nutrition & Dietition");
                System.out.println("8.Urology (Urine problems,Kidney)");
                System.out.println("9.Renal Unit (Kidney)");
                System.out.println("10.Dermatology (Skin,hair,Nail)");
                System.out.println("11.Dentistry (Dental,Oral)");
                System.out.println("12.Doctor consultant");
                int t= sc.nextInt();
                while(t!=0)
                {
                    if(t==1)
                    {

                    }
                    else {
                        break;
                    }
                }
            }
            else
            {
                x=1;
            }
        }
    }
}