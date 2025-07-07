package challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
    public static void main(String[]args){
        String[] pallets = {"B14", "A11", "B12", "A13","N89","P00","S45","X98","MM","U99", "99"};

        System.out.println("Sorted ....");
        Arrays.sort(pallets);
        for (String pallet : pallets){
            System.err.println("--" + pallet);
        }

        System.out.println("\nReversed ...");
        List<String>palletList = Arrays.asList(pallets);
        Collections.reverse(palletList);
        for (String pallet : palletList){
            System.out.println("--" + pallet);
        }
    }
}
