import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchAndOpenPageYanaOnBehance {

    @Test
    void searchAndOpenPageYanaOnBehance() {

        //открыть https://www.behance.net/
        open("https://www.behance.net/");
        //включить фильтр "Люди" в поисковике
        $("[href=\"/search/users\"]").click();
        //найти Yana Voloshenko
        $("[type=\"search\"]").setValue("Yana Voloshenko").pressEnter();
        //открыть профиль
        open("https://www.behance.net/voloshenkod770?tracking_source=search_users");
        //проверить: описание профиля содержит слово aic
        $(".ProfileCard-line-fVO").shouldHave(text("aic"));
    }
}
