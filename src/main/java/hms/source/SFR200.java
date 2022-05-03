package hms.source;

import hms.reservation.GuestInfo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SFR200 implements fileinterface {

    private ArrayList<String> readInfo = new ArrayList();
    private ArrayList<GuestInfo> guestInfo = new ArrayList<>();

    @Override
    public void FRead() {
        try {
            FileReader fileRead = new FileReader(new File("C:\\DB\\booking_guest_info.txt"));
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
        BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\booking_guest_info.txt", false));
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
            String[] str = line.split("\\|");
            guestInfo.add(new GuestInfo(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7], str[8],
                     str[9], str[10], str[11], str[12], str[13], str[14], str[15], str[16], str[17]));
        }
    }

    public ArrayList<GuestInfo> returnGuestInfo() throws IOException {
        return guestInfo;
    }
}
