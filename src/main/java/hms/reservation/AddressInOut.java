package hms.reservation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Character.isDigit;
import java.util.ArrayList;

public class AddressInOut {

    public static ArrayList<AddressInfo> FRead(File file) throws IOException {

        FileInputStream input = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(input, "UTF-8");
        BufferedReader inline = new BufferedReader(reader);
        String line;

        ArrayList<AddressInfo> Info = new ArrayList<>();

        while ((line = inline.readLine()) != null) {

            String[] str = line.split("\\|");
            AddressInfo addressInfo = new AddressInfo();
            addressInfo.setCity(str[1]);
            addressInfo.setSigugun(str[3]);
            addressInfo.setEupmyeon(str[5]);
            checkEupmyeon(addressInfo, str);
            addressInfo.setStreat(str[8] + " " + str[11]);
            addressInfo.setBuildname(str[15]);

            Info.add(addressInfo);
        }

        return Info;
    }

    public static void checkEupmyeon(AddressInfo addressInfo, String[] str) {
        for (int i = 0; i < addressInfo.getEupmyeon().length(); i++) {
            if (isDigit(addressInfo.getEupmyeon().charAt(i))) {
                addressInfo.setEupmyeon("");
            } else {
                addressInfo.setEupmyeon(str[5] + " ");
            }
        }
    }
}
