import org.junit.Before
import org.junit.Test
import java.lang.Exception
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class TennisGameTest {

    private var game: TennisGame? = null

    @Before
    @Throws(Exception::class)
    fun setup() {
        game = TennisGame("Foster", "Nik")
    }

    @Test
    fun verifyGameExists() {
        assertNotNull(game, "the game exists")
    }

    @Test
    fun testNewGameShouldReturnLoveAll() {
        val score = game?.getScore()
        assertEquals("Love all", score)
    }

    @Test
    fun testPlayerOneWinsFirstBall() {
        game?.playerOneScores()

        val score = game?.getScore()
        assertEquals("Fifteen,Love", score)
    }

    @Test
    fun testFifteenAll() {
        game?.playerOneScores()
        game?.playerTwoScores()

        val score = game?.getScore()
        assertEquals("Fifteen all", score)
    }
}