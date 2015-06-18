import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * User: dimitr
 * Date: 18.06.2015
 * Time: 18:01
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        Webcam webcam = Webcam.getDefault();
        if (webcam != null) {
            System.out.println("Webcam: " + webcam.open(true));
        } else {
            System.out.println("No webcam detected");
        }
    }
}
