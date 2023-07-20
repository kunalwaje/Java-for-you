package array;

public class Chatgpt {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 2, 1, 6, 7, 8, 7, 6};

        int numUniqueElements = 0;
        int[] lastUniqueElements = new int[3]; // Adjust the size here

        for (int i = array.length - 1; i >= 0; i--) {
            int element = array[i];
            if (isUnique(array, i)) {
                lastUniqueElements[numUniqueElements] = element;
                numUniqueElements++;

                if (numUniqueElements >= lastUniqueElements.length) {
                    break;
                }
            }
        }

        System.out.println("Last " + numUniqueElements + " unique elements in the array:");
        for (int i = numUniqueElements - 1; i >= 0; i--) {
            System.out.println(lastUniqueElements[i]);
        }
    }

    private static boolean isUnique(int[] array, int currentIndex) {
        int element = array[currentIndex];
        for (int i = 0; i < currentIndex; i++) {
            if (array[i] == element) {
                return false;
            }
        }
        return true;
    }
}
