package hms.reservation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class GuestInfoSave {

    public void Addguest(String a) throws IOException {
        BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\booking_guest_info.txt", true));
        PrintWriter pw = new PrintWriter(log, true);
        pw.write(a + "\n");
        pw.flush();
        pw.close();
    }

    public void Inguest(String code, String name, String roomNum, String guestNum, String phoneNum, String address,
            String InYear, String InMonth, String InDay, String OutYear, String OutMonth, String OutDay, String cardtype,
            String cardnum, String expriymonth, String expriyear, String guarantee, String money
    ) throws IOException {

        File file = new File("C:\\DB\\booking_guest_info.txt");
        String dummy = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;

            for (int i = 0; i < Integer.parseInt(code) - 1; i++) {
                line = br.readLine();
                dummy += (line + "\r\n");
            }

            br.readLine();
            dummy += (code + "|" + name + "|" + roomNum + "|" + guestNum + "|" + phoneNum + "|" + address
                    + "|" + InYear + "|" + InMonth + "|" + InDay + "|" + OutYear + "|" + OutMonth + "|" + OutDay
                    + "|" + cardtype + "|" + cardnum + "|" + expriymonth + "|" + expriyear + "|" + guarantee
                    + "|" + money + "|" + "\r\n");

            while ((line = br.readLine()) != null) {
                dummy += (line + "\r\n");
            }
            FileWriter fw = new FileWriter("C:\\DB\\booking_guest_info.txt");

            fw.write(dummy);

            fw.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void essential(String code, String name, String roomNum, String guestNum, String phoneNum, String address,
            String InYear, String InMonth, String InDay, String OutYear, String OutMonth, String OutDay, String cardtype,
            String cardnum, String expriymonth, String expriyear, String guarantee, int index, String money)
            throws IOException {
        File file = new File("C:\\DB\\booking_guest_info.txt");
        String dummy = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;

            for (int i = 0; i < index; i++) {
                line = br.readLine();
                dummy += (line + "\r\n");
            }

            br.readLine();
            dummy += (code + "|" + name + "|" + roomNum + "|" + guestNum + "|" + phoneNum + "|" + address + "|"
                    + InYear + "|" + InMonth + "|" + InDay + "|" + OutYear + "|" + OutMonth + "|" + OutDay + "|"
                    + cardtype + "|" + cardnum + "|" + expriymonth + "|" + expriyear + "|" + guarantee + "|" + money + "|" + "\r\n");

            int n = 0;
            while ((line = br.readLine()) != null) {
                n++;
                dummy += (line + "\r\n");
            }

            FileWriter fw = new FileWriter("C:\\DB\\booking_guest_info.txt");
            fw.write(dummy);
            fw.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
