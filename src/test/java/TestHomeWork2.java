import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestHomeWork2 {

    @Test
    public void regestrationForm_2() {

        String name = "Ben";

        open("https://demoqa.com/text-box");
        $x("//input[@id='userName']").setValue(name);
        $x("//input[@id='userEmail']").setValue("ben@mail.ru");
        $x("//textarea[@id='currentAddress']").setValue("Hello Alisa");
        $x("//textarea[@id='permanentAddress']").setValue("Hello Marisha");
        $x("//button[@id='submit']").click();


        $x("//div[@id='output']").shouldHave(text(name), text("ben@mail.ru"));


        sleep(5000);
    }
}
