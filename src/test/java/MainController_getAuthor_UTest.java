import com.alireza.dockerchallengeone.controller.MainController;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class MainController_getAuthor_UTest {

    MainController mainController = new MainController();

    @Test
    public void getAuthor_correctAnswer() {
        Assert.isTrue(mainController.getAuthor().equals("Alireza Ebrahimi"), "");
    }
}
