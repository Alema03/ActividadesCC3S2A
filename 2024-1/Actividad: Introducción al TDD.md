## Clases:

  1. Word

   ```
      public class Word {
      private final String correctWord;
  
      public Word(String correctWord) {
          this.correctWord = correctWord;
      }
  
      public Score guess(String attempt) {
          var score = new Score();
          // Implementar lógica para calcular puntaje aquí
          return score;
      }
      }
   ```

  2. Letter

  ```
    public enum Letter {
    INCORRECT,
    PART_CORRECT,
    CORRECT
    }
   ```

  3. Score

  ```
    public class Score {
    public Letter letter(int position) {
        return Letter.INCORRECT;
    }
    }

   ```

## Test

1. WordTest
   
```
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class WordTest {
    @Test
    public void oneIncorrectLetter() {
        var word = new Word("A");
        var score = word.guess("Z");
        var result = score.letter(0);
        assertThat(result).isEqualTo(Letter.INCORRECT);
    }
}

```
