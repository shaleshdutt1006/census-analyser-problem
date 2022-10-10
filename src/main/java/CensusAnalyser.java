import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class CensusAnalyser {

    public int loadCensusData(String csvFilePath) throws CensusAnalyserException {
        int numberOfEntries = 0;
        try {
            /*
            Reading states census file using BufferedReader class it used to read the text from a
            character-based input stream.We can read the data line by line from this.
             */
            BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
            /*
            Reading number of entries line by line using while loop
             */
            while (reader.readLine() != null) {
                numberOfEntries++;

            }
        } catch (IOException e) {
            throw new CensusAnalyserException(e.getMessage(), CensusAnalyserException.exceptionType.Census_File_Problem);

        }
        catch (IllegalStateException e){
            throw new CensusAnalyserException(e.getMessage(), CensusAnalyserException.exceptionType.Unable_To_Parse);
        }
        return numberOfEntries;
    }
}