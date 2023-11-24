package seminars.third.hw;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

//*Задание 1.
//
//        Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным или нечетным. (код приложен в презентации)
//
//        Задание 2.
//
//        Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число в интервал (25;100). (код приложен в презентации)
//
//        Задание 3.  (необязательное)
//
//        Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей, кроме администраторов. Для этого, вам потребуется
//        расширить класс User новым свойством, указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.
public class ThirdTest {

    @Test
    void evenOddNumberTest() {
        assertThat(MainHW.evenOddNumber(1)).isEqualTo(false);
        assertThat(MainHW.evenOddNumber(2)).isEqualTo(true);
    }

    @ParameterizedTest
    @CsvSource({
            "0, false",
            "25, true",
            "50, true",
            "100, true",
            "200, false"
    })
    void calculatingDiscountPositiveCase(int n, boolean result) {
        assertThat(MainHW.numberInInterval(n))
                .isEqualTo(result);
    }


}
