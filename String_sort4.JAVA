import java.util.Arrays;

public class String_sort4 {

    public static void main(String[] args) {

        String[] arr = {"odd", "even", "apple", "zebra"};

        Arrays.sort(arr);

        System.out.printf("Modified arr[] : %s", Arrays.toString(arr));
    }
}