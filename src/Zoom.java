import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Zoom {
    private String name;
    private String link;
    private int period;
    private String time;

    public Zoom(String name, String link, int period, String time) {
        this.name = name;
        this.link = link;
        this.period = period;
        this.time = time;

        File file = new File("zoomlink.txt");
        try {
            FileWriter myWriter = new FileWriter(file);
            String output = String.format("%13s%1d%13s", link, period, time);
            myWriter.write(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String GetName() {
        return name;
    }

    public String GetLink() {
        return link;
    }

    public int GetPeriod() {
        return period;
    }

    public String GetTime() {
        return time;
    }
}
