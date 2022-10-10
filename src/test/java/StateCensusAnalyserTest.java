import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateCensusAnalyserTest {


    @Test
    public void welcomeTest() {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();

        String message = stateCensusAnalyser.welcomeMessage();
        Assertions.assertEquals("Welcome to the Program", message);

    }
  }