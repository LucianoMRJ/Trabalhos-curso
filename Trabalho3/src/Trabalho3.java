//Luciano Moraes da Rocha Júnior
public class Trabalho3 {
    public static void somaDiagonais(int Mat[][], int somaDiagonalPri, int somaDiagonalSec) {
        for(int x = 0; x < Mat.length; x++) {
            somaDiagonalPri = somaDiagonalPri + Mat[x][x];
            somaDiagonalSec = somaDiagonalSec + Mat[x][Mat.length - x - 1];
        }
        System.out.println("Soma diagonal principal: " + somaDiagonalPri);
        System.out.println("Soma diagonal secundária: " + somaDiagonalSec);
    }     
    public static void main(String[] args) {
        int Mat[][] = new int [10][10];
        int somaPrimeiraLin = 0;
        int somaUltimaLin = 0;
        int somaPrimeiraCol = 0;
        int somaUltimaCol = 0;
        int somaDiagonalPri = 0;
        int somaDiagonalSec = 0;
        for(int x=0; x<Mat[0].length; x++){
            somaPrimeiraLin = 0;
            somaUltimaLin = 0;
            System.out.println("");         
            for(int y=0; y<Mat.length; y++){
                Mat[x][y] = (int)(Math.random()*100);
                somaPrimeiraLin = somaPrimeiraLin + Mat[0][y];
                somaUltimaLin = somaUltimaLin + Mat [9][y];              
                System.out.print(Mat[x][y] + "\t");
            }
            somaPrimeiraCol = somaPrimeiraCol + Mat [x][0];
            somaUltimaCol = somaUltimaCol + Mat [x][9];
        }  
        System.out.println("");
        System.out.println("Soma da primeira linha: " + somaPrimeiraLin);
        System.out.println("Soma da última linha: " + somaUltimaLin);
        System.out.println("Soma da primeira coluna: " + somaPrimeiraCol);
        System.out.println("Soma da última coluna: " + somaUltimaCol);
        somaDiagonais(Mat, somaDiagonalPri, somaDiagonalSec);
        System.exit(0);
    }
}