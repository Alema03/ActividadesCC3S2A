import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pe.uni.stringUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class stringRegexUtilsTest {

    // Ejercicio 9
    @Test
    void regexSimpleCase() {
        Assertions.assertThat(stringUtils.regexSubstringsBetween("abcd", "a", "d")).isEqualTo(new String[] { "bc" });
    }

    @Test
    void regexManyStrings() {
        assertThat(stringUtils.regexSubstringsBetween("abcdabcdab", "a", "d")).isEqualTo(new String[] { "bc", "bc" });
    }

    @Test
    void regexOpenAndCloseTagsThatAreLongerThan1Char() {
        assertThat(stringUtils.regexSubstringsBetween("aabcddaabfddaab", "aa", "dd")).isEqualTo(new String[] { "bc", "bf" });
    }
}
