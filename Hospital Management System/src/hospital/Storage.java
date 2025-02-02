package hospital;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Storage {
    static HashMap<String,Patient> patientData=new LinkedHashMap<>();


    public static boolean addPatient(String id, Patient patient)
    {
        if(!patientData.containsKey(id))
        {
            patientData.put(id,patient);
            return true;
        }
        else {
            System.out.println("Patient data is already available!");
            System.out.println("Kindly go back to home and get their details!");
            return false;
        }
    }

    public static HashMap<String, Patient> getPatients()
    {
        return patientData;
    }

    public static Patient getPatientData(String id)
    {
            return patientData.get(id);
    }

    public static boolean isDataAvailable(String id)
    {
        return patientData.containsKey(id);
    }

}
