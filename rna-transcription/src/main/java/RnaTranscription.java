class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rna = "";
        
        for(int iterator=0; iterator<dnaStrand.length(); iterator++)
        {
            switch(dnaStrand.charAt(iterator))
            {
                case 'G': rna += 'C';
                          break;
                case 'C': rna += 'G';
                          break;
                case 'T': rna += 'A';
                          break;
                case 'A': rna += 'U';
                          break;
            }
        }
        return rna;
    }
}
