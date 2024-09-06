public class math {
    public static void main(String[] args) {
        double K, C, F, RA, RE;
        C = 2.18;

        K = C * 1.8;
        RA = C * 1.8 + 32 + 459.67;
        RE = C * 0.8;
        F = C * 1.8 + 32;
    
        System.out.println("Em F: " + F);
        System.out.println("Em RA: " + RA);
        System.out.println("Em RE: " + RE);
        System.out.println("Em K: " + K);
        
    }
}