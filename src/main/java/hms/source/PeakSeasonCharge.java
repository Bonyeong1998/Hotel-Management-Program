package hms.source;
//수정예정

import hms.reservation.PeakSeasonChargeInfo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PeakSeasonCharge implements fileinterface {

    private ArrayList<String> readInfo = new ArrayList();
    private ArrayList<PeakSeasonChargeInfo> chargeInfo = new ArrayList<>();

    @Override
    public void FRead() {

        try {
            FileReader fileRead = new FileReader(new File("C:\\DB\\peakFee.txt"));
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
        BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\peakFee.txt", true));
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
            chargeInfo.add(new PeakSeasonChargeInfo(Integer.parseInt(str[0]), str[1], str[2], str[3], str[4]));
        }
    }

    public ArrayList<PeakSeasonChargeInfo> returnChargeInfo() throws IOException {
        return chargeInfo;
    }
}
