public class RnaTranscription {
    public String ofDna(String dnaString) { 
        char[] c = dnaString.toCharArray();
        String result = "";
        for (int i = 0; i < c.length; i++) {
            result += getComplement(c[i]);
        }
        return result;
    }

    private char getComplement(char c) {
        switch (c) {
            case 'G': return 'C';
            case 'C': return 'G';
            case 'T': return 'A';
            case 'A': return 'U';
            default:
                throw new IllegalArgumentException(c + " is not a valid DNA nucleotide");
        }
    }
}
