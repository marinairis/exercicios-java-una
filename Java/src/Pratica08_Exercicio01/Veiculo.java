package Pratica08_Exercicio01;

public class Veiculo {
    private int quant;
    private String numChassi;
    private String placa;
    private String vetorChassi[];
    private String vetorPlaca[];
    
    public void setValor(int valor) {
        this.quant = valor;
        this.vetorChassi = new String[valor];
        this.vetorPlaca = new String[valor];
    }

    public void setNumChassi(String numChassi) {
        this.numChassi = numChassi;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    public void implementar(int i){
        this.vetorChassi[i] = numChassi;
        this.vetorPlaca[i] = placa;

    }
        
    public void imprimir() {
        System.out.println("Numero do Chassi:");
        for (String elemento : vetorChassi) {
            System.out.println(elemento);
        }
    }

    public void imprimir1() {
        for (int i = 0; i < quant; i++) {
            System.out.println("Numero do Chassi: " + vetorChassi[i] + " Placa: " + vetorPlaca[i]);
        }
    }    

}
