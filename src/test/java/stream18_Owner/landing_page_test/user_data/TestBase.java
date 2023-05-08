package stream18_Owner.landing_page_test.user_data;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import stream18_Owner.config.ConfigReader;
import stream18_Owner.config.ProjectConfiguration;
import stream18_Owner.config.WebConfig;
import stream18_Owner.helpers.Attach;

public class TestBase {

    private static final WebConfig config = ConfigReader.Instance.read();

    @BeforeAll
    static void beforeALL() {
        ProjectConfiguration projectConfiguration = new ProjectConfiguration(config);
        projectConfiguration.webConfig();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}



