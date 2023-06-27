import motors.EVbike;
import motors.PertolBike;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

public class MyMain {
    static Map<String, Object> bikeSpecification;
    static List<Map<String, Object>> listOfMobilesAndSpec;

    public static void main(String[] args) {
        bikeSpecification = new HashMap();
        listOfMobilesAndSpec = new ArrayList<>();
        EVbike ather = new EVbike();
        ather.setBatteryHours(3.6f);
        ather.setItemNo("2132");
        bikeSpecification.put("ATHER", ather);
        listOfMobilesAndSpec.add(bikeSpecification);
        bikeSpecification = new HashMap();
        PertolBike pertolBike = new PertolBike();
        pertolBike.setEngineName("Axed");
        pertolBike.setTankCapacity(9.5f);
        pertolBike.setItemNo("34565");
        bikeSpecification.put("TVS", pertolBike);
        listOfMobilesAndSpec.add(bikeSpecification);
        for (Object veh : listOfMobilesAndSpec) {
            System.out.println(veh.toString());
        }
        try{
            Workbook wb = new HSSFWorkbook();
            OutputStream fileOut = new FileOutputStream("D:\\BankStatement.xlsx");
            System.out.println("Excel File has been created successfully.");
            wb.write(fileOut);
        }catch (IOException e){

        }


    }
}
