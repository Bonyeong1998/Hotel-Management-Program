package hms.source;

import hms.check.CheckOutInfo;
import hms.check.RoomState;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SFR300 implements fileinterface {

    private ArrayList<String> readInfo = new ArrayList();
    private ArrayList<RoomState> roomstate = new ArrayList<>();
    private ArrayList<CheckOutInfo> checkout = new ArrayList<>();

    @Override
    public void FRead() {
        try {
            FileReader fileRead = new FileReader(new File("C:\\DB\\room.txt"));
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

    public void CRead() {
        try {
            FileReader fileRead = new FileReader(new File("C:\\DB\\checkout.txt"));
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

    public void CSplit() {
        String line;

        for (int i = 0; i < readInfo.size(); i++) {
            line = readInfo.get(i);
            String[] str = line.split(" ");
            checkout.add(new CheckOutInfo(str[0], str[1], str[2], str[3], str[4], str[5], str[6]));
        }
    }

    @Override
    public void Split() {
        String line;

        for (int i = 0; i < readInfo.size(); i++) {
            line = readInfo.get(i);
            String[] str = line.split(" ");
            roomstate.add(new RoomState(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7]));
        }
    }

    public ArrayList<RoomState> returnRoomState() throws IOException {
        return roomstate;
    }

    public ArrayList<CheckOutInfo> returnCheckOut() throws IOException {
        return checkout;
    }

     @Override
       public void FWrite(String a) throws IOException {
        BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\room.txt", true));
        PrintWriter pw = new PrintWriter(log, true);
        pw.write(a + "\n");
        pw.flush();
        pw.close();
    }
}
