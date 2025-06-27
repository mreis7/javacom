public class OperadoresRelacionais {
  public static void main(String[] args) {
    //Operador relacional RESTO - mostra o resto da divisão (%)
    int resto = 21 % 2;
    //Operador relacional BOOLEANO - mostra true ou false (< > <= >= == !=)
    boolean isDezMaiorQueVinte = 10 > 20;
    boolean isDezMenorQueVinte = 10 < 20;
    boolean isDezMaiorIgualQueVinte = 10 >= 20;
    boolean isDezMenorIgualQueVinte = 10 <= 20;
    boolean isDezIgualQueVinte = 10 == 20;
    boolean isDezDiferenteQueVinte = 10 != 20;

    System.out.println(" ");
    System.out.println("Resto da divisão de 21/2: " + resto);
    System.out.println(" ");
    System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
    System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
    System.out.println("isDezMaiorIgualQueVinte: " + isDezMaiorIgualQueVinte);
    System.out.println("isDezMenorIgualQueVinte: " + isDezMenorIgualQueVinte);
    System.out.println("isDezIgualQueVinte: " + isDezIgualQueVinte);
    System.out.println(" isDezDiferenteQueVinte: " + isDezDiferenteQueVinte);
    System.out.println(" ");
  }
}