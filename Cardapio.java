public enum Cardapio {
    HAMBURGUER(1, "Hambúrguer", "Pão, carne, queijo e salada", 15.99),
    PIZZA(2, "Pizza", "Massa crocante com molho e queijo", 39.99),
    REFRIGERANTE(3, "Refrigerante", "Lata 350ml", 5.50),
    SUCO(4, "Suco Natural", "Suco de laranja natural", 7.00),
    BATATA_FRITA(5, "Batata Frita", "Porção média de batatas fritas", 12.50),
    SORVETE(6, "Sorvete", "Casquinha com 2 bolas de sorvete", 10.00);

    private final int id;
    private final String nome;
    private final String descricao;
    private final double preco;

    // Construtor privado do enum
    private Cardapio(int id, String nome, String descricao, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Métodos getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}
