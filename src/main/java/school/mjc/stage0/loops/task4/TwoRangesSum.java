package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            int sumSkip = 0;
            int sumCounted = 0;
            for (int i = 1; i <= lastInRow; i++) {
                if (i % numberToSkip != 0) {
                    sumCounted += i;
                } else {
                    sumSkip += i;
                }
                ;

            }
            if (numberToSkip == lastInRow) {
                sumSkip = sumSkip + sumCounted;
                System.out.println("skipped sum is " + sumSkip);
                System.out.println("counted sum is " + 0);

            } else {
                System.out.println("skipped sum is " + sumSkip);
                System.out.println("counted sum is " + sumCounted);
            }
        }
    }
}
