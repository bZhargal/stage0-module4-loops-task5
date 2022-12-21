package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height == 0) {
            System.out.print("");
        } else {
            int countSpace = 0;
            int countSymbol = height;
            for (int i = 0; i <= (height % 2 == 0 ? height / 2 - 1 : height / 2); i++) {
                pringPyramid(countSpace, countSymbol);
                countSpace++;
                countSymbol -= 2;
                System.out.println();
            }
            countSpace -= height % 2 == 0 ? 1 : 2;
            countSymbol += height % 2 == 0 ? 2 : 4;

            for (int i = height / 2; i > 0; i--) {
                pringPyramid(countSpace, countSymbol);
                countSpace--;
                countSymbol += 2;
                System.out.println();
            }
        }
    }

    private void pringPyramid(int countSpace, int countSymbol) {
        for (int j = 0; j < countSpace; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < countSymbol; j++) {
            System.out.print("8");
        }
        for (int j = 0; j < countSpace; j++) {
            System.out.print(" ");
        }
    }
}
