package hms.source;

import java.io.IOException;

public interface fileinterface {
    void FRead();
    void FWrite(String a) throws IOException;
    void Split();
}
