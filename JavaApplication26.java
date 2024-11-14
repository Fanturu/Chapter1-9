class ContinueDemo { 
    public static void main(String[] args) {
        String searchMe = "Betty Botter bought some butter\n" +
                          "But she said the butter’s bitter\n" +
                          "If I put it in my batter, it will make my batter bitter\n" +
                          "But a bit of better butter will make my batter better\n" +
                          "So ‘twas better Betty Botter bought a bit of better butter"; 
        int max = searchMe.length(); 
        int numBs = 0;
        
        for (int i = 0; i < max; i++) { // interested only in b's
            if (searchMe.charAt(i) != 'b') 
                continue; 
            // process b's 
            numBs++; 
        }
        
        System.out.println("Found " + numBs + " b's in the string."); 
    } 
}
