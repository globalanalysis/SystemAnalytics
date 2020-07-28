package LooggerPlatform;



import org.joda.time.DateTime;

import java.io.*;


public class RunLogger {

    public void infoLoogger(String s) {
      String p = "info: ";

        printFileLogger(s,p);

    }

    public void errorLogger(String s) {
        String p = "error: ";
        printFileLogger(s,p);

    }


    private void printFileLogger(String s, String p) {

        File file = new File("src/main/scala/Config/loggerFile");

        try (FileWriter fileWriter = new FileWriter(file, true)) {


            String dt = new DateTime().toString();
            fileWriter.append('\n');
            fileWriter.write(dt);
            fileWriter.append('\n');
            fileWriter.write(p);
            fileWriter.write(s);
            fileWriter.flush();




            } catch(IOException e) {
            e.printStackTrace();
        }

    }

    }

