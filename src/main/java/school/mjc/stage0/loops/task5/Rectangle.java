package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        if (length == 0 && height == 0) {
            System.out.print("");
        } else {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < length; j++) {
                    if (i == 0 || i == height - 1) {
                        System.out.print("8");
                    } else if (j == 0 || j == length - 1) {
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
