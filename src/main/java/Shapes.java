import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.app.scene.Camera3D;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.components.TransformComponent;
import javafx.scene.Node;

import static com.almasb.fxgl.dsl.FXGLForKtKt.getGameScene;

public class Shapes extends GameApplication {

    private Camera3D camera;

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(1280);
        settings.setHeight(720);
        settings.set3D(true);
        settings.setTitle("3D Shapes");
    }

    @Override
    protected void initInput() {
        super.initInput();
    }

    @Override
    protected void initGame() {
        camera = getGameScene().getCamera3D();
        TransformComponent transform = camera.getTransform();
        transform.translateZ(-10);
        transform.translateY(0);

        getGameScene()
    }

    private Node[] makeShapes() {
        return null; // TODO: replace this with better.
    }

    private Entity makeEntity(double x, double y, double z) {
        return null; // TODO: replace this with better.
    }


    public static void main(String[] args) {
        launch(args);
    }
}
