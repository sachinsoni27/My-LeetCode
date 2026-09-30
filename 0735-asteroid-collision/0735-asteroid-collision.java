class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int i = 0;

        while (i < n - 1) {

            if (asteroids[i] > 0 && asteroids[i + 1] < 0) {

                if (asteroids[i] > -asteroids[i + 1]) {
                    for (int j = i + 1; j < n - 1; j++) {
                        asteroids[j] = asteroids[j + 1];
                    }
                    n--;
                }

                else if (asteroids[i] < -asteroids[i + 1]) {
                    for (int j = i; j < n - 1; j++) {
                        asteroids[j] = asteroids[j + 1];
                    }
                    n--;

                    if (i > 0) {
                        i--;
                    }
                }

                else {
                    for (int j = i; j < n - 2; j++) {
                        asteroids[j] = asteroids[j + 2];
                    }
                    n -= 2;

                    if (i > 0) {
                        i--;
                    }
                }

            } else {
                i++;
            }
        }

        return java.util.Arrays.copyOf(asteroids, n);
    }
}