package hms.source;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SFR600 implements fileinterface {
    ArrayList<String> loginfo = new ArrayList<>();
    String Code;
    
    @Override
    public void FRead() {
         try {
            File text = new File("C:\\DB\\loginlog.txt");
            FileReader textRead = new FileReader(text);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            
            while ((line = bfReader.readLine()) != null) {
                loginfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void InCode(){
        Code = loginfo.get(0);
    }
    
    public String Check(){
        return Code;
    }

    @Override
    public void FWrite(String a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Split() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
