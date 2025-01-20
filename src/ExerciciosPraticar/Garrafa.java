package ExerciciosPraticar;

public class Garrafa {
    int capacidade;
    boolean tampada;
    String material;
    void status(){
        System.out.println("Capacidade(Ml): "+ this.capacidade);
        System.out.println("Material: "+ this.material);
        System.out.println("Está tampada? "+ this.tampada);
    }
    void beber(){
    if (this.tampada){
        System.out.println("Não posso beber água");
    }
    else{
        System.out.println("Bebendo água...");
    }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;

    }
}
