import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javax.swing.*;
import java.io.File;

public class SwingWebApp {
    public static void main(String[] args) {
        // Step 1: Create JFrame
        JFrame frame = new JFrame("Swing + JavaFX WebView");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Step 2: Add JFXPanel to embed JavaFX
        JFXPanel jfxPanel = new JFXPanel();
        frame.add(jfxPanel);
        frame.setVisible(true);

        // Step 3: Initialize JavaFX content
        javafx.application.Platform.runLater(() -> {
            WebView webView = new WebView();
            // Load local index/index.html as file URL
            File html = new File("index/index.html");
            String url = html.toURI().toString();
            if (html.exists()) {
                webView.getEngine().load(url);
            } else {
                webView.getEngine().loadContent("<h1>index/index.html not found</h1><p>Expected at: " + html.getAbsolutePath() + "</p>");
            }

            Scene scene = new Scene(webView);
            jfxPanel.setScene(scene);
        });
    }
}


