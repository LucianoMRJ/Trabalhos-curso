//Luciano Moraes da Rocha Júnior
public class Trabalho4 {
    public static void main(String[] args) {
        String nome[] = new String [3];
        String marca [] = new String [3];
        double preco [] = new double [3];
        int x = 0;
        while(true){
            char op = Entrada.leiaChar("1 - Cadastrar veículos\n"
                +"2 - Exibir mais barato/mais caro\n"
                +"3 - Localizar um veículo\n"
                +"4 - sair\n");
            switch(op){
                case '1':
                    if(nome.length == x){
                        Entrada.escrever("Cadastramento cheio");
                        continue;
                    }
                    System.out.println("Cadastramento de carros");
                    System.out.println("Nome \t\t" + "Marca \t\t" + "Preço \t\t");     
                    while(x < preco.length){                
                        nome[x] = Entrada.leiaString("Digite o nome do carro[" + x + "]");
                        marca[x] = Entrada.leiaString("Digite a marca do carro[" + x + "]");
                        preco[x] = Entrada.leiaInt("Digite o preço do carro[" + x + "]");                  
                        System.out.print(nome[x] + "\t\t");
                        System.out.print(marca[x] + "\t\t");
                        System.out.print(preco[x] + "\t\t");
                        System.out.println("");
                        x++;
                        }
                break;
                case '2':
                     int k = 0;
                     int l = 0;
                     double maior = 999999999;
                     double menor = -1;
                    for(int i = 0; i <preco.length; i++){
                        if(preco[i] < maior){
                            maior = preco[i];                           
                        }
                        while(k < preco.length){
                            if(maior == preco[k]){
                                preco[k] = maior;
                                break;
                            }else{
                                k++;
                            }
                        }
                    }
                    for(int j = 0; j <preco.length; j++){
                        if(preco[j] > menor){
                            menor = preco[j];
                        }
                        while(l < preco.length){
                            if(menor == preco[l]){
                                preco[l] = menor;
                                break;
                            }else{
                                l++;
                            }
                        }
                    }
                    System.out.println("");
                    System.out.println("Veículo mais caro");
                    System.out.println("Nome do veículo["+ l +"]: " + nome[l]);
                    System.out.println("Marca do veículo["+ l +"]: " + marca[l]);
                    System.out.println("Preço do veículo["+ l +"]: " + preco[l]);
                    System.out.println("Veículo mais barato");
                    System.out.println("Nome do veículo["+ k +"]: " + nome[k]);
                    System.out.println("Marca do veículo["+ k +"]: " + marca[k]);
                    System.out.println("Preço do veículo["+ k +"]: " + preco[k]);          
                    break;
                case '3':
                    String localizar = Entrada.leiaString("Veículo a localizar");
                    for(int y = 0; y < nome.length; y++){
                        if(nome[y].contains(localizar)){
                            System.out.println("");
                            System.out.println("Veículo encontrado:");
                            System.out.println("Nome do veículo["+ y +"]: " + nome[y]);
                            System.out.println("Marca do veículo["+ y +"]: " + marca[y]);
                            System.out.println("Preço do veículo["+ y +"]: " + preco[y]);
                            break;
                        }else if(y == nome.length - 1){
                            System.out.println("");
                            System.out.println("Veículo não encontrado");
                        }                        
                    }
                    break;
                case '4':
                    System.exit(0);
                default:
                    Entrada.escrever("Comando inválido inserido");
                break;
            }
        }
    }
}