import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ResourseLoader {

    public static final String PATH = "C:\\Users\\Mr.Pickles\\Desktop\\java\\Tanks\\res\\";

    public static BufferedImage loadImage(String fileName){
        BufferedImage image = null;

        try{
            image = ImageIO.read(new File(PATH+fileName));
        }
        catch (IOException e){
            e.printStackTrace();
        }


        return image;
    }

}
