package hms.source;

import hms.check.HotelServicePrice;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class RoomServicePriceInfo implements fileinterface {

    private ArrayList<String> readinfo = new ArrayList();
    private ArrayList<HotelServicePrice> RSserviceInfo = new ArrayList<>();

    @Override
    public void FRead() {
        try {
            File Atext = new File("C:\\DB\\hotelserviceprice.txt");
            FileReader textRead = new FileReader(Atext);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readinfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void FWrite(String a) throws IOException {
        BufferedWriter Abw = new BufferedWriter(new FileWriter("C:\\DB\\allservice.txt", true));
        PrintWriter Apw = new PrintWriter(Abw, true);
        Apw.write(a + "\n");
        Apw.flush();
        Apw.close();

        BufferedWriter Rbw = new BufferedWriter(new FileWriter("C:\\DB\\hotelservice.txt", true));
        PrintWriter Rpw = new PrintWriter(Rbw, true);
        Rpw.write(a + "\n");
        Rpw.flush();
        Rpw.close();
    }

    public void PWrite(String a) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\DB\\hotelserviceprice.txt", true));
        PrintWriter pw = new PrintWriter(bw, true);
        pw.write(a + "\n");
        pw.flush();
        pw.close();
    }

    public void AWrite(String a) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\DB\\hotelmoney.txt", true));
        PrintWriter pw = new PrintWriter(bw, true);
        pw.write(a + "\n");
        pw.flush();
        pw.close();
        BufferedWriter rbw = new BufferedWriter(new FileWriter("C:\\DB\\allservice.txt", true));
        PrintWriter rpw = new PrintWriter(rbw, true);
        rpw.write(a + "\n");
        rpw.flush();
        rpw.close();
    }

    @Override
    public void Split() {
        String line;

        for (int i = 0; i < readinfo.size(); i++) {
            line = readinfo.get(i);
            String[] str = line.split(" ");
            RSserviceInfo.add(new HotelServicePrice(str[0], str[1]));
        }
    }

    public ArrayList<HotelServicePrice> returnRSServiceInfo() throws IOException {
        return RSserviceInfo;
    }

}
