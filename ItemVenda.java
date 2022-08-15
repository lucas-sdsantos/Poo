public class ItemVenda {
    private int quantidade;
    private Produto prod;

    
    public ItemVenda(int umaQtde, Produto umProd){
      this.quantidade = umaQtde;
      this.prod = umProd;
    }
    
    public double getValor(){
      return prod.getPreco();
    }

    public String toString(){
      return String.format("%d, %s", quantidade, prod.getNome());
    }
  }