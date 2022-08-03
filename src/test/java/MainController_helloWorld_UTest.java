import com.alireza.dockerchallengeone.controller.MainController;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class MainController_helloWorld_UTest {

    public static final String CALLER_NAME = "alireza";
    MainController mainController = new MainController();

    @Test
    public void helloWorld_calledWithNoParams_correctAnswer() {
        Assert.isTrue(mainController.helloWorld(null).equals("Hello Stranger"), "");
    }

    @Test
    public void helloWorld_calledWithParam_correctAnswer() {
        Assert.isTrue(mainController.helloWorld(CALLER_NAME).equals("Hello " + CALLER_NAME), "");
    }
}
