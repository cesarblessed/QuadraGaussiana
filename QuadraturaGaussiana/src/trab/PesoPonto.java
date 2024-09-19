package trab;

import java.util.ArrayList;

public class PesoPonto {
    ArrayList<Double> pesos;
    ArrayList<Double> pontos;
    
    public PesoPonto(int n) {
        pesos = new ArrayList<>();
        pontos = new ArrayList<>();
        switch(n){
            case 2:
                inicializa2Pontos();
                break;
            case 3:
                inicializa3Pontos();
                break;
            case 4:
                inicializa4Pontos();
                break;
            case 5:
                inicializa5Pontos();
                break;
        }
    }

    PesoPonto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void inicializa2Pontos() {
        pesos.add(1.0);
        pesos.add(1.0);
        pontos.add(0.5773502692);
        pontos.add(-0.5773502692);
    }
    
    private void inicializa3Pontos() {
        pesos.add(0.5555555556);
        pesos.add(0.8888888889);
        pesos.add(0.5555555556);
        pontos.add(0.7745966692);
        pontos.add(0.0000000000);
        pontos.add(-0.7745966692);
    }
    
    private void inicializa4Pontos() {
        pesos.add(0.3478548451);
        pesos.add(0.6521451549);
        pesos.add(0.6521451549);
        pesos.add(0.3478548451);
        pontos.add(0.8611363116);
        pontos.add(0.3399810436);
        pontos.add(-0.3399810436);
        pontos.add(-0.8611363116);
    }
    
    private void inicializa5Pontos() {
        pesos.add(0.2369268850);
        pesos.add(0.4786286705);
        pesos.add(0.5688888889);
        pesos.add(0.4786286705);
        pesos.add(0.2369268850);
        pontos.add(0.9061798459);
        pontos.add(0.5384693101);
        pontos.add(0.0000000000);
        pontos.add(-0.5384693101);
        pontos.add(-0.9061798459);
    }
    
    public ArrayList<Double> getPesos() {
        return this.pesos;
    }
    
    public ArrayList<Double> getPontos() {
        return this.pontos;
    }
    
    @Override
    public String toString() {
        return "PesoPonto{" + "pesos=" + pesos + ", pontos=" + pontos + "}";
    }
}