
package condominio;

import java.util.ArrayList;


public class Casa {
    private String cor;
    private ArrayList<Porta> portas;
  

    public Casa(){
        this.portas = new ArrayList();
    }
    public String getCor() {
        return cor;
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    
    public ArrayList<Porta> getPortas() {
        return portas;
    }

    public void cadastrarPorta(Porta portas) {
        this.portas.add(portas);
    }
    public int totalPortas(){
        int cont=0,i;
        for(i=0;i<this.getPortas().size();i++){
            cont++;
        }
        return cont;
    }
    public int portasAbertas(){
        int i,cont=0;
        for(i=0;i<this.getPortas().size();i++){
            if(this.getPortas().get(i).estaAberta()){
                cont++;
            }
        }
        return cont;
    }
}
