class Main {
    public static void main(String[] args) {
      Produto p1 = new Produto(001, "abacate", 2.55);
      System.out.println(p1.toString());

      ItemVenda i1 = new ItemVenda(1, p1);
      System.out.println(i1.toString());

      Cliente c1 = new Cliente("A", "0000");
      System.out.println(c1.toString());
    }
  }