import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Trabalho4ListOOP {
    
    private final ArrayList<String> nome = new ArrayList<>();
    private final ArrayList<String> marca = new ArrayList<>();
    private final ArrayList<Double> preco = new ArrayList<>();
    
    public Trabalho4ListOOP(){//String nome, String marca, double preco
        //this.nome.add(nome);
        //this.marca.add(marca);
        //this.preco.add(preco);
    }//Fim do método Construtor 
    
    public void setNome(String nome){ // Setar o nome
        this.nome.add(nome);
    }//Fim do método 
    
    public void setMarca(String marca){ // Setar a marca
        this.marca.add(marca);
    }//Fim do método 
    
    public void setPreco(double preco){ // Setar o preço
        this.preco.add(preco);
    }//Fim do método 
    
    public String getNome(int pos){ // Pegar o nome
        return nome.get(pos);
    }//Fim do método 
    
    public String getMarca(int pos){ // Pegar a marca
        return marca.get(pos);
    }//Fim do método 
    
    public double  getPreco(int pos){ // Pegar o preço
        return preco.get(pos);
    }//Fim do método 
    
    public void menu(){ 
        do{
            //Menu
            String op = JOptionPane.showInputDialog(null, "1 - Cadastrar veículos\n"
                                                  +"2 - Exibir mais barato/mais caro\n"
                                                  +"3 - Localizar um veículo\n"
                                                  +"4 - Mostrar todos os veículos\n"
                                                  +"5 - sair\n", "Menu - Escolha uma opção", JOptionPane.PLAIN_MESSAGE);
            switch(op){ //Opções e funcionalidades
                case "1":
                    cadastrarVeiculo();
                    break;
                case "2":
                    exibirVeiculoMaisBarato();
                    exibirVeiculoMaisCaro();
                    break;
                case "3":
                    localizarVeiculo();
                    break;
                case "4":
                    mostrarTodosVeiculos();
                    break;
                case "5":
                    sair();
                default:
                    mensagemDeErro();
            }
        }while(true);
    }//Fim do método 
    
    public void cadastrarVeiculo(){
        if(nome.size() == 10) // Verificar capacidade máxima
            JOptionPane.showInternalMessageDialog(null, "Capacidade máxima atingida", "Aviso", JOptionPane.WARNING_MESSAGE); // Mensagem de erro
        else{ // Adicionar veículos
            setNome(JOptionPane.showInputDialog(null, "Digite o nome de seu carro", "Cadastramento de carros", JOptionPane.PLAIN_MESSAGE));
            setMarca(JOptionPane.showInputDialog(null, "Digite a marca de seu carro", "Cadastramento de carros", JOptionPane.PLAIN_MESSAGE));
            setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço de seu carro", "Cadastramento de carros", JOptionPane.PLAIN_MESSAGE)));
        }  
    }//Fim do método 
    
    public double exibirVeiculoMaisCaro(){
        double min = Double.MIN_VALUE; // Número minímo de 32 bits
        int pos = 0; // Posição
        
        for(int x = 0; x < preco.size(); x++) //Laço de repetição
            if(preco.get(x) > min){ //Operação para verificar maior preço
                min = preco.get(x);
                pos = x;
            }
        JOptionPane.showMessageDialog(null, "Nome: " + getNome(pos) + "\n" 
                                          + "Marca: " + getMarca(pos) + "\n"  
                                          + "Preço: " + getPreco(pos), "Informações do veículo mais caro", JOptionPane.INFORMATION_MESSAGE);
        return min;
    }//Fim do método 
    
    public double exibirVeiculoMaisBarato(){
        double max = Double.MAX_VALUE; // Número máximo de 32 bits
        int pos = 0; // Posição
        
        for(int x = 0; x < preco.size(); x++) //Laço de repetição
            if(preco.get(x) < max){ //Operação para verificar menor preço
                max = preco.get(x);
                pos = x;
            }
        JOptionPane.showMessageDialog(null, "Nome: " + getNome(pos) + "\n" 
                                          + "Marca: " + getMarca(pos) + "\n" 
                                          + "Preço: " + getPreco(pos), "Informações do veículo mais barato", JOptionPane.INFORMATION_MESSAGE);
        return max;
    }//Fim do método 
    
    public void localizarVeiculo(){
        //Janela para localizar o veículo
        String localizar = JOptionPane.showInputDialog(null, "Digite o nome do veículo", "Veículo a ser localizado", JOptionPane.PLAIN_MESSAGE);
        
        if(!nome.contains(localizar)) // Verificação se veículo existe na lista
            JOptionPane.showMessageDialog(null, "Veículo não localizado", "Aviso", JOptionPane.WARNING_MESSAGE); // Mensagem de erro
        else // Encontrando posição de veículo na lista
            for(int x = 0; x < nome.size(); x++) // Laço de repetição
                if(nome.get(x).contains(localizar))
                    JOptionPane.showMessageDialog(null, "Nome: " + getNome(x) + "\n"
                                                      + "Marca: " + getMarca(x) + "\n"
                                                      + "Preço: " + getPreco(x), "Informações do veículo", 
                                                      JOptionPane.INFORMATION_MESSAGE);
                
            
    }//Fim do método 
    
    public void mostrarTodosVeiculos(){
        for(int x = 0; x < nome.size(); x++) // Laço de repetição
            JOptionPane.showMessageDialog(null, "Nome: " + getNome(x) + "\n" // Tela com todos os carros
                                              + "Marca: " + getMarca(x) + "\n"
                                              + "Preço: " + getPreco(x), "Informações do veículo nº" + (x+1), 
                                              JOptionPane.INFORMATION_MESSAGE);
        
    }//Fim do método 
    
    public void sair(){
        System.exit(0); // Sair do sistema
    }//Fim do método 
    
    public void mensagemDeErro(){
        // Utilizada se o usuário colocar um comando inválido no menu
        JOptionPane.showMessageDialog(null, "Comando inválido inserido", "ERRO", JOptionPane.ERROR_MESSAGE);
    }//Fim do método 
    
}//Fim da classe
