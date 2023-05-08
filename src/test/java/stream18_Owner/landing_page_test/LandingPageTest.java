package stream18_Owner.landing_page_test;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import stream18_Owner.landing_page_test.user_data.TestBase;

@Tag("1ofd_tests")
public class LandingPageTest extends TestBase {
    PageObjects pageObjects = new PageObjects();

    @Test
    @DisplayName("Проверка, что страница открылась")
    void openPageTest() {
        pageObjects.openPage()
                .textLending("Первый ОФД – первый ", "оператор фискальных данных");
    }
}