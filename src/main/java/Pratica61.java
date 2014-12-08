import java.util.Map;
import java.util.Set;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.Time;


public class Pratica61 {
    public static void main( String[] args ){
        Time Brasil = new Time();
        Time Argentina = new Time();
        
        Brasil.addJogador("Goleiro", new Jogador(12, "A"));
        Brasil.addJogador("Zagueiro", new Jogador(4, "B"));
        Brasil.addJogador("Atacante", new Jogador(10, "C"));
        
        Argentina.addJogador("Goleiro", new Jogador(1, "D"));
        Argentina.addJogador("Zagueiro", new Jogador(3, "E"));
        Argentina.addJogador("Atacante", new Jogador(20, "F"));
        
        System.out.println("Posição      Time 1      Time 2");
        
        Set<Map.Entry<String, Jogador>> entries = (Brasil.getJogadores()).entrySet();
        for (Map.Entry<String, Jogador> entry: entries) {
            System.out.println(entry.getKey() + " " + (Brasil.getJogadores()).get(entry.getKey()) + " " + (Argentina.getJogadores()).get(entry.getKey()));
        }
    }
    
}