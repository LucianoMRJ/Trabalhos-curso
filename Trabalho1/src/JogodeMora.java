public class JogodeMora {
    public static void main(String[] args){      
       int computador = (int)(Math.random()*6);
       int apostamaquina = (int)(Math.random()*11);
       int jogador = 0;
       int apostajogador = 0;   
       int resultado = 0;
       
       jogador = Entrada.leiaInt("Informe seu jogo (0-5)");
       apostajogador = Entrada.leiaInt("Informe seu jogo (1-10)");
       resultado = computador + jogador;  
     
       System.out.println("O jogador jogou " + jogador);
       System.out.println("O jogador apostou no resultado " + apostajogador);
       System.out.println("O computador jogou " + computador);
       System.out.println("O computador apostou no resultado " + apostamaquina);
       System.out.println("Resultado do jogo:" + resultado);
       
        if (apostajogador == resultado){
            Entrada.escrever("Jogador ganhou o jogo");               
        }else if (apostamaquina == resultado){
                Entrada.escrever("Computador ganhou o jogo");
        }else{
                Entrada.escrever("Ninguém ganhou o jogo");
            }
        System.exit(0);
    }
}
