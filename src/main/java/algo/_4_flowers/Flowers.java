package algo._4_flowers;

public class Flowers {
    public static void main(String[] args) {
        int[] nums = {1,0,0,0,1};
        flowers(nums, 2);
    }

    public static boolean flowers(int[] flowerbed, int n) {
        if ( n == 0) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                // Проверяем соседние участки
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // Сажаем цветок
                    count++;
                    if (count >= n) {
                        System.out.println(true);

                        return true;
                    }
                }
            }
        }
        System.out.println(count >= n);
        return count >= n;
    }
}
