public class RepeatingEvenNumbers {
    static boolean isFind(int[] arr, int value) {
        for(int i : arr) {
            if(i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Dizideki Tekrar Eden Sayıları Bulan Program

        int[] list = {86,53,86,34,34,21,8,47,34,21,64,80,8};
        int[] duplicated = new int[list.length];
        int startIndex = 0;

        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < list.length; j++) {
                if((list[i] == list[j]) && (i != j)) {
                    if(!isFind(duplicated, list[i])) {
                        duplicated[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for(int a: duplicated) {
            if(a != 0) {
                System.out.print(a + " ");
            }
        }

        System.out.println();
        // ================================================================================

        // Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazınız.

        int[] Duplicated = new int[list.length];
        int indexNo = 0;

        for(int b = 0; b < list.length; b++) {
            for(int c = 0; c < list.length; c++) {
                if(((list[b] == list[c]) && (b != c)) && (list[b] % 2 == 0)) {
                    if(!isFind(Duplicated, list[b])) {
                        Duplicated[indexNo++] = list[b];
                    }
                    break;
                }
            }
        }
        for(int z: Duplicated) {
            if(z != 0) {
                System.out.print(z + " ");
            }
        }
    }
}
