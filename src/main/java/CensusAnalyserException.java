public class CensusAnalyserException extends Exception {

    enum exceptionType{
        Census_File_Problem
    }
    exceptionType type;
    public CensusAnalyserException(String message, exceptionType census_File_Problem) {
        super(message);
        this.type=type;
    }
}
