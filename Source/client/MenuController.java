
package client;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuController{
    private RootController rootController ;

    @FXML
    private void registerAction() throws IOException{

            FXMLLoader loader = new FXMLLoader(getClass().getResource("register.fxml"));
            Pane pane = loader.load();
            RegisterController registerController = loader.getController();
            registerController.setRootController(rootController);

            rootController.setScreen(pane);

    }
    @FXML
    private void howToPlayAction() throws IOException {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Rules.fxml"));
            Pane pane = loader.load();
            HowToPlayController howToPlayController = loader.getController();
            howToPlayController.setRootController(rootController);
            rootController.setScreen(pane);

    }
    public void setRootController(RootController rootController) {
            this.rootController = rootController;
    }



}