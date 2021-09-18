import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SaveText {

    private String memoStr;

    public void put(String str) {
        memoStr = str;

    }

    public void save() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try (FileWriter fw = new FileWriter("/home/skyadmin/Desktop/" + time.format(format) + ".txt")) {
            fw.write(memoStr);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
