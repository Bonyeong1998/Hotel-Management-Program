
package hms.source;

import hms.check.CheckOutInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class SFR400 implements fileinterface {
    private ArrayList<String> readInfo = new ArrayList<>();
    private ArrayList<CheckOutInfo> checkoutInfo = new ArrayList<>();
    
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

    @Override
    public void FWrite(String a) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Split() {
        String line;

        for (int i = 0; i < readInfo.size(); i++) {
            line = readInfo.get(i);
            String[] str = line.split(" ");
            checkoutInfo.add(new CheckOutInfo(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7]));
        }
    }
    
    public ArrayList<CheckOutInfo> returnCheckOutInfo() throws IOException{
        return checkoutInfo;
    }
}
