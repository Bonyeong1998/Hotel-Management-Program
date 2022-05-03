package hms.source;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HotelMoneyData implements fileinterface {

    private ArrayList<String> readinfo = new ArrayList<>();
    private ArrayList<HotelMoneyInfo> hotelmoneyInfo = new ArrayList<>();

    @Override
    public void FRead() {
        try {
            File Atext = new File("C:\\DB\\hotelmoney.txt");
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
    public void Split() {
        String line;
        for (int i = 0; i < readinfo.size(); i++) {
            line = readinfo.get(i);
            String[] str = line.split(" ");
            hotelmoneyInfo.add(new HotelMoneyInfo(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7]));
        }
    }

    public ArrayList<HotelMoneyInfo> returnHotelMoneyInfo() throws IOException {
        return hotelmoneyInfo;
    }

    @Override
    public void FWrite(String a) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
