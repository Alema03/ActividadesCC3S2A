import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class FootballTeamTest {
/*
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 3, 10})
    void constructorShouldSetGamesWon(int nbOfGamesWon) {
        FootballTeam team = new FootballTeam(nbOfGamesWon);
        assertThat(team.getGamesWon())
                .as("number of games won")
                .isEqualTo(nbOfGamesWon);

 */
/*
        @ParameterizedTest
        @ValueSource(ints = { -10, -1 })
        void constructorShouldThrowExceptionForIllegalGamesNb(int illegalNbOfGames) {
            assertThatExceptionOfType(IllegalArgumentException.class)
                        .isThrownBy(() -> { new FootballTeam(illegalNbOfGames); });

 */
/*
            private static final int ANY_NUMBER = 123;
            @Test
            void shouldBePossibleToCompareTeams() {
                FootballTeam team = new FootballTeam(ANY_NUMBER);
                assertThat(team).isInstanceOf(Comparable.class);
            }

 */
@Test void teamsWithLessMatchesWonShouldBeLesser()
{
    FootballTeam team_2 = new FootballTeam(2);
    FootballTeam team_3 = new FootballTeam(3);
    assertThat(team_2.compareTo(team_3))
            .isLessThan(0); }
}
/*public class FootballTeamTest {
    @Test
    void constructorShouldSetGamesWon() {
        FootballTeam team = new FootballTeam(3);
        assertThat(team.getGamesWon()).isEqualTo(3);
        assertThat(team.getGamesWon())
                .as("number of games won")
                .isEqualTo(3);
    }
}*/
//REFACTORIZAMOS EL CODIGO
/*
public class FootballTeamTest {
    private static final int THREE_GAMES_WON = 3;
    @Test
    void constructorShouldSetGamesWon() {
        FootballTeam team = new FootballTeam(THREE_GAMES_WON);
        assertThat(team.getGamesWon())
            .as("number of games won")
            .isEqualTo(THREE_GAMES_WON);
       }
}
*/


