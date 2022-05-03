package hms.source;

import hms.reservation.OffPeakSeasonChargeInfo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class OffPeakSeasonCharge implements fileinterface {

    private ArrayList<String> readInfo = new ArrayList();
    private ArrayList<OffPeakSeasonChargeInfo> chargeInfo1 = new ArrayList<>();

    @Override
    public void FRead() {

        try {
            FileReader fileRead = new FileReader(new File("C:\\DB\\lowFee.txt"));
            BufferedReader bfReader = new BufferedReader(fileRead);
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
        BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\peakFee.txt", false));
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
            chargeInfo1.add(new OffPeakSeasonChargeInfo(str[0], str[1], str[2], str[3], str[4]));
        }
    }

    public ArrayList<OffPeakSeasonChargeInfo> returnChargeInfo() throws IOException {
        return chargeInfo1;
    }
}
