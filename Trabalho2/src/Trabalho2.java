//Código feito por Luciano Moraes da Rocha Júnior
public class Trabalho2 {

    public static void main(String[] args) {
        int Mat[][] = new int[10][10];
        int Soma;
        int SomaSup = 999;
        int SomaInf = 5001;
        int PosSup = 0;
        int PosInf = 0;
        int NumSup = 99;
        int NumInf = 501;
        int LinSup = 0;
        int LinInf = 0;
        int ColSup = 0;
        int ColInf = 0;
        for (int x = 0; x < Mat.length; x++) {
            Soma = 0;
            for (int y = 0; y < Mat.length; y++) {
                do {
                    Mat[x][y] = 100 + (int) (Math.random() * (501 - 100));
                } while (Mat[x][y] % 2 != 0);
                System.out.print(Mat[x][y] + "\t");
                Soma = Soma + Mat[x][y];
                if (Mat[x][y] > NumSup) {
                    NumSup = Mat[x][y];
                    LinSup = x;
                    LinInf = y;
                }
                if (Mat[x][y] < NumInf) {
                    NumInf = Mat[x][y];
                    ColSup = x;
                    ColInf = y;
                }
                if (Soma > SomaSup) {
                    SomaSup = Soma;
                    PosSup = x;
                }
                if (Soma < SomaInf) {
                    SomaInf = Soma;
                    PosInf = x;
                }
            }
            System.out.print("- Soma: " + Soma);
            System.out.println("");
        }
        System.out.println("O número da linha com maior soma: " + PosSup);
        System.out.println("O número da linha com menor soma: " + PosInf);
        System.out.println("Maior elemento: " + NumSup + " na posição [" + LinSup + "][" + LinInf + "]");
        System.out.println("Menor elemento: " + NumInf + " na posição [" + ColSup + "][" + ColInf + "]");
        System.exit(0);
    }
}
