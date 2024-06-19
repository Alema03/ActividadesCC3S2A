import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pe.uni.InvalidDelimiterException;
import pe.uni.stringUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pe.uni.stringUtils.substringsBetween;

public class stringUtilsTest {

    // Ejercicio 5

    @Test
    void strIsNullOrEmpty() {
        // T1: str es nulo.
        assertThat(substringsBetween(null, "a", "b")).isEqualTo(null);
        // T2: str está vacío.
        assertThat(substringsBetween("", "a", "b")).isEqualTo(new String[]{});
    }

    @Test
    void openIsNullOrEmpty() {
        // T3: open es nulo.
        assertThat(substringsBetween("abc", null, "b")).isEqualTo(null);
        // T4: open está vacío.
        assertThat(substringsBetween("abc", "", "c")).isEqualTo(null);
    }

    @Test
    void closeIsNullOrEmpty() {
        // T5: close es nulo.
        assertThat(substringsBetween("abc", "a", null)).isEqualTo(null);
        // T6: close está vacío.
        assertThat(substringsBetween("abc", "a", "")).isEqualTo(null);
    }

    // Cadena de longitud 1
    @Test
    void strOfLength1() {
        // T7: el carácter único en str coincide con la etiqueta open.
        assertThat(substringsBetween("a", "a", "b")).isEqualTo(null);
        // T8: El carácter único en str coincide con la etiqueta de close.
        assertThat(substringsBetween("a", "b", "a")).isEqualTo(null);
        // T9: El carácter único en str no coincide ni con la etiqueta de open ni con la de close.
        assertThat(substringsBetween("a", "b", "b")).isEqualTo(null);
        // T10: el carácter único en str coincide con las etiquetas de open y close.
        assertThat(substringsBetween("a", "a", "a")).isEqualTo(null);
    }

    // cadena de longitud > 1, longitud de open = 1, longitud de close = 1:
    @Test
    void openAndCloseOfLength1() {
        // T11: str no contiene ni la etiqueta de open ni la de close.
        assertThat(substringsBetween("abc", "x", "y")).isEqualTo(null);
        // T12: str contiene la etiqueta open pero no contiene la etiqueta close.
        assertThat(substringsBetween("abc", "a", "y")).isEqualTo(null);
        // T13: str contiene la etiqueta de close pero no contiene la etiqueta de open.
        assertThat(substringsBetween("abc", "x", "c")).isEqualTo(null);
        // T14: str contiene las etiquetas de open y close.
        assertThat(substringsBetween("abc", "a", "c")).isEqualTo(new String[]{"b"});
        // T15: str contiene las etiquetas de open y close varias veces. <- falta implementar
        assertThat(substringsBetween("abcabcabc", "a", "c")).isEqualTo(new String[]{"b", "b", "b"});
        // ... previas aseveraciones aquí
        // T22: str contiene espacios en blanco entre las etiquetas de open y close.
        assertThat(substringsBetween("abcabyt byrc", "a", "c")).isEqualTo(new String[]{"b", "byt byr"});
    }

    // cadena de longitud > 1, longitud de open > 1, longitud de close > 1:
    @Test
    void openAndCloseTagsOfDifferentSizes() {
        // T16: str no contiene ni la etiqueta de open ni la de close.
        assertThat(substringsBetween("aabcc", "xx", "yy")).isEqualTo(null);
        // T17: str contiene la etiqueta open pero no contiene la etiqueta close.
        assertThat(substringsBetween("aabcc", "aa", "yy")).isEqualTo(null);
        // T18: str contiene la etiqueta de close pero no contiene la etiqueta de open.
        assertThat(substringsBetween("aabcc", "xx", "cc")).isEqualTo(null);
        // T19: str contiene las etiquetas de open y close.
        assertThat(substringsBetween("aabbcc", "aa", "cc")).isEqualTo(new String[]{"bb"});
        // T20: str contiene las etiquetas de open y close varias veces.
        assertThat(substringsBetween("aabbccaaeecc", "aa", "cc")).isEqualTo(new String[]{"bb", "ee"});
        // ... previas aseveraciones aquí
        // T23: str contiene espacios en blanco entre las etiquetas de open y close, las etiquetas de open y close tienen espacios en blanco.
        assertThat(substringsBetween("a abb ddc ca abbcc", "a a", "c c")).isEqualTo(new String[]{"bb dd"});
    }

    @Test
    void notSubstringBetweenOpenAndCloseTags() {
        // T21: str contiene las etiquetas de open y close sin caracteres entre ellas.
        assertThat(substringsBetween("aabb", "aa", "bb")).isEqualTo(new String[]{""});
    }

    // Ejercicio 7
    @Test
    void ignoresSpecialCharacters() {
        // T24: str contiene caracteres especiales.
        Assertions.assertThat(stringUtils.substringsBetween("a*b?c!a@d", "a", "d")).isEqualTo(new String[] { "bca" });
    }

    // Ejercicio 8 <- No funciona los casos T4 y T6 y T24
    @Test
    void throwsExceptionWhenOpenOrCloseIsEmpty() {
        // T25: open es una cadena vacía.-> Retorna InvalidDelimiterException
        assertThrows(InvalidDelimiterException.class, () -> {
            stringUtils.substringsBetween("abc", "", "c");
        });
        // T26: close es una cadena vacía.-> Retorna InvalidDelimiterException
        assertThrows(InvalidDelimiterException.class, () -> {
            stringUtils.substringsBetween("abc", "a", "");
        });
    }






}