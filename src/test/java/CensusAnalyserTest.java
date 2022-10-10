import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensusAnalyserTest {

    private static final String Indian_Census_Csv_File_Path = "./src/test/resources/IndiaStateCensusData.csv";

    @Test
    public void givenFileReturnNumberOfRecords() throws CensusAnalyserException {

        CensusAnalyser censusAnalyser = new CensusAnalyser();
        int numberOfRecords = censusAnalyser.loadCensusData(Indian_Census_Csv_File_Path);
        Assertions.assertEquals(30, numberOfRecords);
    }
}
