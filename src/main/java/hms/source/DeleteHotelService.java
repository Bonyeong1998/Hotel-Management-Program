package hms.source;

import hms.check.HotelServicePrice;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class DeleteHotelService implements fileinterface {

    private ArrayList<String> readInfo = new ArrayList();
    private ArrayList<HotelServicePrice> serviceInfo = new ArrayList<>();

    @Override
    public void FRead() {
        try {
            FileInputStream in = new FileInputStream("C:\\DB\\\\Delete\\deletehotelservice.txt");
            InputStreamReader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader bfReader = new BufferedReader(reader);

            String line;
            while ((line = bfReader.readLine()) != null) {
                readInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void FWrite(String a) throws IOException {
        FileOutputStream out = new FileOutputStream("C:\\DB\\\\Delete\\deletehotelservice.txt", true);
        OutputStreamWriter writer = new OutputStreamWriter(out, "UTF-8");
        BufferedWriter log = new BufferedWriter(writer);
        PrintWriter pw = new PrintWriter(log, true);

        pw.write(a + "\n");
        pw.flush();
        pw.close();
    }

    @Override
    public void Split() {
        String line;

        for (int i = 0; i < readInfo.size(); i++) {
            line = readInfo.get(i);
            String[] str = line.split(" ");
            serviceInfo.add(new HotelServicePrice(str[0], str[1]));
        }
    }

    public ArrayList<HotelServicePrice> returnHotelServicePriceInfo() throws IOException {
        return serviceInfo;
    }
}
