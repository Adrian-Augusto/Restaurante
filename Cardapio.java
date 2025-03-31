
    public enum Cardapio {
        HAMBURGUER("Hambúrguer", "Pão, carne, queijo e salada", 15.99),
        PIZZA("Pizza", "Massa crocante com molho e queijo", 39.99),
        REFRIGERANTE("Refrigerante", "Lata 350ml", 5.50),
        SUCO("Suco Natural", "Suco de laranja natural", 7.00),
        BATATA_FRITA("Batata Frita", "Porção média de batatas fritas", 12.50),
        SORVETE("Sorvete", "Casquinha com 2 bolas de sorvete", 10.00);

        private final String nome;
        private final String descricao;
        private final double preco;
        private Cardapio(String nome, String descricao, double preco) {
            this.nome = nome;
            this.descricao = descricao;
            this.preco = preco;
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