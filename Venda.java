import java.util.ArrayList;

public class Venda {
    private Cliente clientes;
    private ArrayList<ItemVenda> itens;
    
    public Venda(){
        Cliente cli;
        itens = new ArrayList<>();
    }

    public void inserir(Produto umProd){
        ItemVenda item = new ItemVenda(1, umProd);
        itens.add(item);
    }

    public void inserir(Produto umProd, int umaQtde){
        ItemVenda item = new ItemVenda(umaQtde, umProd);
        itens.add(item);
    }

    public double valorTotal(){
        int a = 0;
        for (ItemVenda item : itens){
            a += item.getValor();
        }
        return a;
    }

    public String toString(){
        
    }
}