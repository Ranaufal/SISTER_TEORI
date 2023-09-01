import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ranaufal_Stream{
    public static void main(String[] args){

        Random acak = new Random();

        List<Integer> angka = IntStream.range(0, 10)
            .mapToObj(i -> acak.nextInt(100)) 
            .collect(Collectors.toList());

        System.out.println("Total Data : "+angka);

        List<Integer> filter = angka.stream()
            .filter(hasilnya -> hasilnya % 2 == 0)
            .collect(Collectors.toList());

        System.out.println("Hasil Filter : "+filter);

        long jumlah = filter.stream()
            .count();

        System.out.println("Jumlah Angka di Filter : "+jumlah);
    }
}