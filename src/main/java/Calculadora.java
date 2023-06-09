public class Calculadora {
    private String entrada = "1+1";
    private int resultado;

    public Calculadora() {

    }
    public Calculadora(int value1, char op, int value2) {

    }

    //Calculadora c = new Calculadora();
    public void receberEntrada(String calcs) {
        if(isNotEmpty())
            entrada = calcs;
    }              //ok

    public int identificarOperacao(int value1, char op, int value2) {
        resultado = value1 + op + value2;
        return resultado;
    }

    public boolean isNotEmpty() {
        return entrada != null;
    }

//    public int converterParaInt(String entrada) {
//        this.entrada = entrada;
//        resultado = Integer.parseInt(entrada);
//        return resultado;
//    }

    public double somar(double n1, double n2) {
        double resultadoSoma = n1 + n2;
        return resultadoSoma;
    }

    public double subtrair(double n1, double n2) {
        double resultadoSubtracao = n1 - n2;
        return resultadoSubtracao;
    }

    public double mult(double n1, double n2) {
        double resultadoMult = n1 * n2;
        return resultadoMult;
    }

    public double div(double n1, double n2) {
        double resultadoDiv = n1 / n2;
        if (!divisaoPorZero(n2)) {
            return resultadoDiv;
        }else {
            throw new ArithmeticException("Não é possível dividir por zero");
        }
    }

    public boolean divisaoPorZero( double n){
        return n == 0;
    }

    public double resto(double n1, double n2) {
        double resultadoResto = n1 % n2;
        return resultadoResto;
    }

    public double elevar(double n1, double n2) {
        double resultadoElev = Math.pow(n1, n2);
        return resultadoElev;
    }

    public double raizQ(double n) {
        double resultadoRaizQ = Math.sqrt(n);
        return resultadoRaizQ;
    }

    public double raizC(double n) {
        double resultadoRaizC = Math.cbrt(n);
        return resultadoRaizC;
    }

    public double porc(double n) {
        double valorPorc = n / 100d;
        return valorPorc;
    }
    public double porcDeUmNum(double n) {
        double valorPorcdN = n * 100d;
        return valorPorcdN;
    }
}
