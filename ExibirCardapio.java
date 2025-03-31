import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ExibirCardapio {

    public List<Cardapio> listaCardapio = Arrays.asList(Cardapio.values());

        public void cardapio() {
        
            for (Cardapio itemCardapio : Cardapio.values()) {
                System.out.println("Disponíveis: " + itemCardapio.name() + " - Valor: " + itemCardapio.getPreco());
            }
            
            
        }}