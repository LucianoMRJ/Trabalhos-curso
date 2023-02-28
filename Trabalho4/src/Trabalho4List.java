import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Trabalho4List {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); //Input
        
        ArrayList<String> nome = new ArrayList<>(); //Nome do carro
        ArrayList<String> marca = new ArrayList<>(); //Marca do carro
        ArrayList<Double> preco = new ArrayList<>(); //Preço do carro
        
        while(true){
            System.out.print("1 - Cadastrar veículos\n"
                +"2 - Exibir mais barato/mais caro\n"
                +"3 - Localizar um veículo\n"
                +"4 - Mostrar todos os veículos\n"
                +"5 - sair\n"
                +"\n");
            String op = scan.next();
            switch(op){
                case "1":
                    if(nome.size() == 10){ //Verificar capacidade máxima
                         System.out.println("Capacidade máxima atingida");
                         break;
                    }
                    
                    System.out.println("Cadastramento de carros:");
                    System.out.println("Nome: ");
                    String carro1 = scan.next(); //Escanear o nome do carro
                    nome.add(carro1); //Adiciona o nome à lista
                    
                    System.out.println("Marca: ");
                    String carro2 = scan.next(); //Escanear a marca do carro
                    marca.add(carro2); //Adiciona a marca à lista
                    
                    System.out.println("Preço: ");
                    double carro3 = scan.nextDouble(); //Escanear o preco do carro
                    preco.add(carro3); //Adicionar o preço lista
                    
                    System.out.println(""); //Linha em branco para espaçamento
                    break;
                case "2":
                    double max = Integer.MAX_VALUE,
                           min = Integer.MIN_VALUE;
                    int i = 0,
                        j = 0;
                    
                    for(int x = 0; x < preco.size(); x++){
                        if(preco.get(x) < max){
                            max = preco.get(x);
                            i = x;
                        }
                        if(preco.get(x) > min){
                            min = preco.get(x);
                            j = x;
                        }
                    }
                    System.out.println("Veículo com maior valor: ");
                    System.out.printf("Nome: %s\n", nome.get(j));
                    System.out.printf("Marca: %s\n", marca.get(j));
                    System.out.printf("Preco: %.2f\n",preco.get(j));
                    System.out.println("Veículo com menor valor: ");
                    System.out.printf("Nome: %s\n", nome.get(i));
                    System.out.printf("Marca: %s\n", marca.get(i));
                    System.out.printf("Preco: %.2f\n",preco.get(i));
                    break;
                case "3":
                    System.out.println("Digite o nome do  veículo a ser localizado");
                    String localizar = scan.next(); // Veículo a ser localizado
                    if(!nome.contains(localizar)) // Verificação se o veículo existe
                        System.out.println("Veículo não localizado");
                    for(int x = 0; x < nome.size(); x++){ // Laço de repetição
                if(nome.get(x).contains(localizar))
                    JOptionPane.showMessageDialog(null, "Nome: " + nome.get(x) + "\n"
                                                              + "Marca: " + marca.get(x) + "\n"
                                                              + "Preço: " + preco.get(x), "Informações do veículo", 
                                                              JOptionPane.INFORMATION_MESSAGE);
                        }
                    
                    break;
                case "4":
                    //Mostrar todos os veículos
                    for(int x = 0, y = 1; x < nome.size(); x++){
                        System.out.printf("Veículo [%d]\n", y++); //Posição do veículo +1
                        System.out.printf("Nome: %s\n", nome.get(x)); //Printa o nome  
                        System.out.printf("Marca: %s\n", marca.get(x)); //Printa a marca     
                        System.out.printf("Preço: %s\n", preco.get(x)); //Printa o preço  
                    }
                    break;
                case "5": //Fechar o sistema
                    System.exit(0);
                default:
                    System.out.println("Comando inválido inserido");
                    System.out.println("");
            }
        }
        
    }//Fim do Main
}//Fim da classe
