/*
by alexander
project started Oct.23 2024
 */
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Main extends GameManager{
    //sets up frame, initializes some constructors, and runs method that actually makes the game work
    public static void main(String[] args) throws IOException{
        new ErrorPrinter();
        SettingsUI.UIInit();
    }
}
