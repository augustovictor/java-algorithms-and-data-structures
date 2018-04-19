package search;

public class Linear {
    public static int generateRandomNumber() {
        return (int) (Math.random()*10) + 10;
    }

    public static void printArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.println("|" + i + "|" + a[i] + "|");
        }
    }

    public static int getValueByIndex(int[] a, int index) {
        if (index < a.length) return a[index];
        return 0;
    }

    public static boolean arrayContainsValue(int[] a, int value) {
        boolean contains = false;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == value) contains = true;
        }

        return contains;
    }

    public static void removeByIndex(int[] a, int index) {
        if (index < a.length) {
            for (int i = index; i < (a.length -1); i++) {
                a[i] = a[i + 1];
            }
        }
    }

    public static String linearSearchValue(int[] a, int value) {
        String indexesWithMatch = "";

        for(int i = 0; i < a.length; i++) {
            if (a[i] == value) indexesWithMatch += " " + i;
        }

        return indexesWithMatch;
    }

    public static void main(String[] args) {
        int[] arr = new int[13];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Linear.generateRandomNumber();
        }

        System.out.println("Array");
        Linear.printArray(arr);

        System.out.println("getValueByIndex");
        System.out.println(Linear.getValueByIndex(arr, 12));

        System.out.println("Whether array contains value 12");
        System.out.println("Array contains value 12: " + Linear.arrayContainsValue(arr, 12));

        System.out.println("Array with removed index 1");
        Linear.removeByIndex(arr, 7);
        Linear.printArray(arr);

        System.out.println("Indexes with value 12");
        System.out.println(Linear.linearSearchValue(arr, 12));
    }
}
