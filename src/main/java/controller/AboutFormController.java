package controller;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class AboutFormController {

    public ImageView imgLogo;
    public AnchorPane abtPane;

    public void initialize(){
        FadeTransition ftAbout = new FadeTransition(Duration.millis(750), abtPane);
        ftAbout.setFromValue(0);
        ftAbout.setToValue(1);
        ftAbout.playFromStart();


        /*ScaleTransition st = new ScaleTransition(Duration.millis(750), imgLogo);
        st.setFromX(0);
        st.setToX(1);
        st.playFromStart();*/




    }
}
