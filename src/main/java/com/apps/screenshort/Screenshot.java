package com.apps.screenshort;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Screenshot {

    public static final long serialVersionUID = 1L;
    public static void main(String[] args)
    {
        try {
            Thread.sleep(120);
            Robot r = new Robot();

            // It saves screenshot to desired path
            String path = "E:// Shot.jpg";

            // Used to get ScreenSize and capture image
            Rectangle capture =
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image = r.createScreenCapture(capture);
            ImageIO.write(Image, "jpg", new File(path));
            System.out.println("Screenshot saved");
        }
        catch (AWTException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }
}
