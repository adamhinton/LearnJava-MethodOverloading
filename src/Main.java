public class Main {

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(7, 1));
    }

    public static double convertToCentimeters (int heightInches){
        return heightInches * 2.54;
    }

    public static double convertToCentimeters (int heightFeet, int heightInchesRemaining) {
        int feetToInches = heightFeet * 12;
        int totalInches = feetToInches + heightInchesRemaining;

        return convertToCentimeters(totalInches);
    }

}