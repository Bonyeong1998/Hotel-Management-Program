package hms.check;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HotelServiceInfoSave {

    public void InHotelServiceInfo(int index, String service, String price) throws IOException {

        File file = new File("C:\\DB\\hotelserviceprice.txt");
        String dummy = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;

            for (int i = 0; i < index; i++) {
                line = br.readLine();
                dummy += (line + "\r\n");
            }

            br.readLine();
            dummy += (service + " " + price + "\r\n");

            while ((line = br.readLine()) != null) {
                dummy += (line + "\r\n");
            }
            FileWriter fw = new FileWriter("C:\\DB\\hotelserviceprice.txt");

            fw.write(dummy);

            fw.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
