import java.util.Random;

public class Jogo {

    public static void main(String[] args) throws Exception {
        Personagem cacador = new Personagem (10, 0, 0);
        Personagem soneca = new Personagem (2, 4, 0); 
        cacador.setNome("Caçador");
        soneca.setNome("Soneca");
        Random gerador = new Random();  

        while(true){
            int oQueFazerc = gerador.nextInt(3)+ 1;
                switch(oQueFazerc){
                    case 1:
                    cacador.cacar();
                    break;
                    case 2: 
                    cacador.comer();
                    break;
                    case 3:
                    cacador.dormir();
                    break;
                }

            int oQueFazers = gerador.nextInt(3)+ 1;
                switch(oQueFazers){
                    case 1:
                    soneca.cacar();
                    break;
                    case 2:
                    soneca.comer();
                    break;
                    case 3:
                    soneca.dormir();
                    break;
                }

            cacador.imprimir();
            soneca.imprimir();  
            System.out.println();
            Thread.sleep(5000);            
        }
    }
}