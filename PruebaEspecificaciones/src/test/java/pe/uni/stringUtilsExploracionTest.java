import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pe.uni.stringUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static pe.uni.stringUtils.substringsBetween;

public class stringUtilsExploracionTest {

    // Ejercicio 1
    // Existe un substring entre los caracteres "a" y "c" en la cadena "axcaycazc"
    @Test
    void testSubstringsBetween() {
        Assertions.assertThat(stringUtils.substringsBetween("axcaycazc", "a", "c")).isEqualTo(new String[] { "x", "y", "z" });
    }

    //  Ejercicio 2
    // Caso simple: Hay un substring entre "a" y "d" en la cadena "abcd"
    @Test
    void simpleCase() {
        assertThat(stringUtils.substringsBetween("abcd", "a", "d")).isEqualTo(new String[] { "bc" });
    }

    // Caso con múltiples subcadenas: Hay dos substrings entre "a" y "d" en la cadena "abcdabcdab"
    @Test
    void manyStrings() {
        assertThat(stringUtils.substringsBetween("abcdabcdab", "a", "d")).isEqualTo(new String[] { "bc", "bc" });
    }

    // Caso con etiquetas más largas: Hay dos substrings entre "aa" y "dd" en la cadena "aabcddaabfddaab"
    @Test
    void openAndCloseTagsThatAreLongerThan1Char() {
        assertThat(stringUtils.substringsBetween("aabcddaabfddaab", "aa", "dd")).isEqualTo(new String[] { "bc", "bf" });
    }
    
}
