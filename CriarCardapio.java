import java.security.PublicKey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CriarCardapio {
 
        private static Map<Integer, Cardapio> cardapios = new HashMap<>();
           
        static{
        for(Cardapio item: cardapios.values()){
            cardapios.put(item.getId(), item);
        }}


        public static void pedirPedidos() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o ID do item desejado: ");
            int id = scanner.nextInt();
    
            // Busca eficiente pelo ID usando o Map
            Cardapio pedido = cardapios.get(id);  // Retorna o item diretamente
    
            if (pedido != null) {
                System.out.println("Você pediu: " + pedido.getNome());
                System.out.println("Descrição: " + pedido.getDescricao());
                System.out.println("Valor: R$ " + pedido.getPreco());
            } else {
                System.out.println("Item não encontrado para o ID: " + id);
            }
    
            scanner.close();
        }
    
       
        
}