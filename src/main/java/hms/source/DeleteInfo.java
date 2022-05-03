/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.source;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Owner
 */
public class DeleteInfo {
     public void serviceInfo(int index, File file)throws IOException {
        String dummy = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;

            for (int i = 0; i < index; i++) {
                line = br.readLine();
                dummy += (line + "\r\n");
            }

            br.readLine();
           
            int n = 0;
            while ((line = br.readLine()) != null) {
                n++;
                dummy += (line + "\r\n");
            }

            FileWriter fw = new FileWriter(file);
            fw.write(dummy);
            fw.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
