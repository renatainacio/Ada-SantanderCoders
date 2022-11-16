import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Por favor informe o mês que deseja ver o gasto:");
        String mesUsuario = input.next().toUpperCase();
        System.out.println("O gasto em " + mesUsuario + " foi: " + Mes.valueOf(mesUsuario).getValor());
    }
}

 enum Mes {
    JANEIRO(1000d), FEVEREIRO(1500d), MARÇO(298d),
     ABRIL(785d), MAIO(120d), JUNHO(765d),
    JULHO(876d), AGOSTO(653d), SETEMBRO(243d),
     OUTUBRO(123d), NOVEMBRO(100d), DEZEMBRO(900d);

    private Double valor;

        Mes(Double valor) {
            this.valor = valor;
        }

     public Double getValor() {
         return valor;
     }
 }
