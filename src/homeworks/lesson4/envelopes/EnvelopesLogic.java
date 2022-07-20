package homeworks.lesson4.envelopes;

public class EnvelopesLogic extends InputData {

    private static boolean isFits() {
        System.out.println("Please enter a: ");
        double a = InputData.envelopeReader();
        System.out.println("Please enter b: ");
        double b = InputData.envelopeReader();
        System.out.println("Please enter c: ");
        double c = InputData.envelopeReader();
        System.out.println("Please enter d: ");
        double d = InputData.envelopeReader();
        boolean firstFitSecond = (a <= c && b <= d) || (a <= d && b <= c);
        boolean secondFitFirst = (a >= c && b >= d) || (a >= d && b >= c);
        return firstFitSecond || secondFitFirst;
    }

    public static void compareEnvelope() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println(EnvelopesLogic.isFits());
            String exit = InputData.exitReader().toLowerCase();
            if (!(exit.equals("yes") || exit.equals("y"))) {
                isExit = true;
            }
        }
    }
}