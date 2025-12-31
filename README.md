# sisProject
school inventory system
hoping its use is for
- monitoring inventory



## this is for a school project
> this is 99.99% vibe coded


## Run the WebView (JavaFX)

1. Download and unzip JavaFX SDK for Windows (e.g., 21+) to a stable path without spaces, e.g.:
   - `C:\javafx-sdk-21`

2. (Optional) Set an environment variable so commands are shorter:
   - In Command Prompt:
     - `setx JAVAFX_HOME "C:\\javafx-sdk-21"`
   - Open a new terminal after running setx.

3. Compile the JavaFX launcher:
   - Using the env var:
     - `javac --module-path "%JAVAFX_HOME%\\lib" --add-modules javafx.controls,javafx.web FxWebViewLauncher.java`
   - Or with the absolute path:
     - `javac --module-path "C:\\javafx-sdk-21\\lib" --add-modules javafx.controls,javafx.web FxWebViewLauncher.java`

4. Run the WebView launcher (loads index/index.html):
   - Using the env var:
     - `java --module-path "%JAVAFX_HOME%\\lib" --add-modules javafx.controls,javafx.web FxWebViewLauncher`
   - Or with the absolute path:
     - `java --module-path "C:\\javafx-sdk-21\\lib" --add-modules javafx.controls,javafx.web FxWebViewLauncher`

Notes:
- The WebView will open and load your local file `index/index.html` using a `file://` URL. Relative paths in your HTML will work based on that file location.
- If you prefer to keep using Swing, you can embed JavaFX WebView inside Swing with `JFXPanel`, but the provided launcher uses a pure JavaFX window for simplicity.
- If you switch to a JDK that bundles JavaFX (e.g., Liberica Full JDK), you may not need `--module-path/--add-modules` flags.

