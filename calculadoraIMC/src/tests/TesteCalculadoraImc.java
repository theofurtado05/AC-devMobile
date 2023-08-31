package tests;

import control.CalculadoraIMC;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteCalculadoraImc {

    CalculadoraIMC calcIMC;

    @Before
    public void setup(){
        calcIMC = new CalculadoraIMC();
    }

    @Test
    public void testeAdultoBaixoPesoMuitoGrave(){
        Assert.assertEquals(
                "Resposta esperada",
                calcIMC.calcularImc(10, 10, 10,"Homem"),
                0);
        //so um exemplo
    }
}
