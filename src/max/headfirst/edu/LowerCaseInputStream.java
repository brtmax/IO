package max.headfirst.edu;
/**
 * Excercise for decorator pattern from HeadFirst Design Pattern book
 */

import java.io.*;

public class LowerCaseInputStream extends FilterInputStream{

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for (int i = offset; i < offset+result; i++) {
            b[i] = (byte)Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
