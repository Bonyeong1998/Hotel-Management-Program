package hms.check;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReservationCancle {

    public void cancle(int cancle) throws IOException {

        
        File file = new File("C:\\DB\\booking_guest_info.txt");
        String dummy = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            //1. 삭제하고자 하는 position 이전까지는 이동하며 dummy에 저장
            String line;

            for (int i = 0; i < cancle; i++) {
                line = br.readLine(); //읽으며 이동
                dummy += (line + "\r\n");
            }
            //2. 삭제하고자 하는 데이터는 건너뛰기
            String delData = br.readLine();

            //3. 삭제하고자 하는 position 이후부터 dummy에 저장

            while ((line = br.readLine()) != null) {
                dummy += (line + "\r\n");
            }

            //4. FileWriter를 이용해서 덮어쓰기
            FileWriter fw = new FileWriter("C:\\DB\\booking_guest_info.txt");

            fw.write(dummy);
            fw.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
