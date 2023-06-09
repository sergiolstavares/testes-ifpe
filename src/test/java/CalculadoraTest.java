import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    //@BeforeAll
    int value1 = 0;
    public String valores = "1+1";
    Calculadora c = new Calculadora();
    @Test
    void receberEntrada() {
        //Calculadora c = new Calculadora();
        //this.valores = valores;
        assertTrue(c.isNotEmpty());
    }
    //@Test
//    void apagarEntrada(){
//            c.clear();
//        assertNotNull(c);
//    }

    @Test
    void entradaSemOperacao() {
         int n = c.converterParaInt("11");
        System.out.println(n);
    }

    //Soma
    @Test
    void somarNumeros() {
       double soma =  c.somar(1,-15);
        System.out.println(soma);
        assertEquals(-14, soma);
    }

    //Subtração
    @Test
    void subtrairNumeros() {
        double subtracao = c.subtrair(2,1);
        System.out.println(subtracao);
        assertEquals(1, subtracao);
    }
    //Multiplicação
    @Test
    void multiplicarNumeros() {
        double mult = c.mult(1,1);
        System.out.println(mult);
        assertEquals(1,mult);
    }
    //Divisão
    @Test
    void dividirNumeros() {
        double div = c.div(1,1);
        System.out.println(div);
        assertEquals(1, div);
    }
    @Test
    void dividirNumerosPorZero() {
        boolean d = c.divisaoPorZero(0);
        System.out.println(d);
        assertTrue(d);
    }
    @Test
    void encontrarRestoDiv() {
        double resultadoResto = c.resto(2, 2);
        assertEquals(0, resultadoResto);
    }
    //Exponencial
    @Test
    void elevarNumeros(){
        double elev = c.elevar(2, 3);
        System.out.println(elev);
        assertEquals(8, elev);
    }
    //Raiz
    @Test
    void raizQuadradaDeNumeros(){
        double raiz =  c.raizQ(16);
        System.out.println(raiz);
        assertEquals(4, raiz);
    }
    @Test
    void raizCubicaDeNumeros(){
        double raizC =  c.raizC(64);
        System.out.println(raizC);
        assertEquals(4, raizC);
    }
    //Porcentagem
    @Test
    void CalcularPorcentagem(){
        double valorPorc = c.porc(20);
        double porc = c.porcDeUmNum(valorPorc);
        System.out.println(porc + "%");
        assertEquals(20d, porc);
    }
}