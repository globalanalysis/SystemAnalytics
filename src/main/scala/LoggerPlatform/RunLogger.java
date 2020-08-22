package LoggerPlatform;



import org.joda.time.DateTime;

import java.io.*;


/**
 * ==RunLogger==
 *
 * @author Dynamic
 * @version 1.0  Встроеный логгер платформы
 */
public class RunLogger {

    /**
     * Info logger.
     *
     * @param s the s
     * @author Dynamic
     * Записывает info в журнал
     */
    public void infoLogger(String s){
      String p = "info: ";

        printFileLogger(s,p);

    }

    /**
     * Error logger.
     *
     * @param s the s
     * @author Dynamic
     * Записывает error в журнал
     */
    public void errorLogger(String s) {
        String p = "error: ";
        printFileLogger(s,p);

    }

    /**
     * @author Dynamic
     *
     * Основной метод работы с журналом
     *
     */
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

