package ru.job4j.loop;

public class Frame {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                boolean isTopOrBottomBorder = row == 0 || row == size - 1;
                boolean isSideBorder = col == 0 || col == size - 1;
                if (isTopOrBottomBorder && isSideBorder) {
                    System.out.print("+"); // Углы рамки
                } else if (isTopOrBottomBorder) {
                    System.out.print("-"); // Верхняя и нижняя границы
                } else if (isSideBorder) {
                    System.out.print("|"); // Левые и правые границы
                } else {
                    System.out.print(" "); // Внутреннее пространство рамки
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Draw frame of size 3");
        draw(3);
        System.out.println("Draw frame of size 5");
        draw(5);
    }
}
