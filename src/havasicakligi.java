import java.util.Scanner;

public class havasicakligi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double heat;

        System.out.print("Hava sıcaklığını giriniz : ");
        heat = inp.nextDouble();

        if (heat < 5) {
            System.out.print("Kayak yapmaya gidebilirsiniz.");
            } else if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            } if ((heat >= 10) && (heat <= 25)) {
                 System.out.println("Pikniğe gidebilirsiniz.");
        } else if (heat >= 25) {
            System.out.print("Yüzmeye gidebilirsiniz.");
            }
        }
    }
