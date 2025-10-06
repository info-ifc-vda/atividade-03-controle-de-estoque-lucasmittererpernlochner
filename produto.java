public class produto {


    private int codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private int estoqueMinimo;

    public produto(int codigo, String nome, double preco, int quantidadeEstoque, int estoqueMinimo) {
        this.codigo = codigo;
        this.nome = nome;
        setPreco(preco);
        this.quantidadeEstoque = quantidadeEstoque;
        this.estoqueMinimo = estoqueMinimo;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preco não pode ser negativo");
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }


    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade invalida para venda");
            return;
        }

        if (quantidade > quantidadeEstoque) {
            System.out.println("Nao e possivel vender mais do que o estoque disponvel");
        } else {
            quantidadeEstoque -= quantidade;
            System.out.println("Venda realizada com sucesso - Estoque atual: " + quantidadeEstoque);

            if (verificarEstoqueBaixo()) {
                System.out.println("Atencao: estoque abaixo do minimo");
            }
        }
    }

    public void repor(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
            System.out.println("Reposicao realizada - Estoque atual " + quantidadeEstoque);
        } else {
            System.out.println("Quantidade invalida para reposição");
        }
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            double novoPreco = preco - (preco * percentual / 100);
            setPreco(novoPreco);
            System.out.println("Desconto aplicado Novo preco: R$ " + preco);
        } else {
            System.out.println("Percentual de desconto invalido");
        }
    }

    private boolean verificarEstoqueBaixo() {
        return quantidadeEstoque < estoqueMinimo;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome);
        System.out.println("Codigo: " + codigo);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Estoque: " + quantidadeEstoque);
        System.out.println("Estoque minimo: " + estoqueMinimo);
    }
}
