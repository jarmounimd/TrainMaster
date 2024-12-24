package com.mouad.frontend.Utils;

import com.mouad.frontend.Components.CustomAlert;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;

public class NavigationManager {
    // Fixed window dimensions
    public static final double ADMIN_WINDOW_WIDTH = 1250;
    public static final double ADMIN_WINDOW_HEIGHT = 750;
    public static final double CLIENT_WINDOW_WIDTH = 1250;
    public static final double CLIENT_WINDOW_HEIGHT = 750;

    public static void navigateToPage(Stage stage, String fxmlFile, boolean isAdmin) {
        try {
            FXMLLoader loader = new FXMLLoader(NavigationManager.class.getResource("/Fxml/" + fxmlFile));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            // Add CSS
            URL cssResource = NavigationManager.class.getResource("/styles/MainPage.css");
            if (cssResource != null) {
                scene.getStylesheets().add(cssResource.toExternalForm());
            }

            // Set fixed window size based on user type
            if (isAdmin) {
                stage.setWidth(ADMIN_WINDOW_WIDTH);
                stage.setHeight(ADMIN_WINDOW_HEIGHT);
            } else {
                stage.setWidth(CLIENT_WINDOW_WIDTH);
                stage.setHeight(CLIENT_WINDOW_HEIGHT);
            }
            stage.setResizable(false);

            stage.setScene(scene);
            stage.centerOnScreen();
        } catch (IOException e) {
            System.err.println("Error navigating to " + fxmlFile + ": " + e.getMessage());
            e.printStackTrace();
            CustomAlert.showError("Navigation Error", "Could not load page: " + e.getMessage());
        }
    }
}
