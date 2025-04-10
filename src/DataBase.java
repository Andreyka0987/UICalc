import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataBase{
    private  String rezult;

    public DataBase(String rezult) {
        this.rezult = rezult;
    }

    public void load(){
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("src/DataBase.txt"));
            writer.write(rezult);
            writer.newLine();
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
