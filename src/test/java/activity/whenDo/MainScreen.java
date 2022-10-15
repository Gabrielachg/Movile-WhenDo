package activity.whenDo;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainScreen {

    public Button addNoteButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    //android.widget.ListView[@id, 'com.vrproductiveapps.whendo:id/notesList']//android.view.ViewGroup[1]
    public Button noteButton = new Button(By.xpath("//android.widget.ListView/android.view.ViewGroup[1]"));

    public MainScreen(){}


    public boolean isNoteDisplayed(String title){
        Label note= new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return note.isControlDisplayed();
    }


}
