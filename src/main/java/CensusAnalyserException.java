public class CensusAnalyserException extends Exception {

    enum exceptionType{
        Unable_To_Parse, Census_File_Problem
    }
    exceptionType type;
    public CensusAnalyserException(String message, exceptionType type) {
        super(message);
        this.type=type;
    }
}
