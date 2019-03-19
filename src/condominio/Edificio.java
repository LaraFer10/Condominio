
package condominio;

import java.util.ArrayList;

public class Edificio {
    private String cor;
    private ArrayList<String> nomeAndar ;
    private ArrayList<Porta> portas;
    
    public Edificio(){
        this.nomeAndar = new ArrayList();
        this.portas = new ArrayList();
    }

    public String getCor() {
        return cor;
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public ArrayList<String> getNomeAndar() {
        return nomeAndar;
    }

    public void setNomeAndar(ArrayList<String> nomeAndar) {
        this.nomeAndar = nomeAndar;
    }
    public void adicionarAndar(String nomeAndar){
        this.nomeAndar.add(nomeAndar);
    }

    public ArrayList<Porta> getPortas() {
        return portas;
    }

    public void adicionarPorta(Porta portas) {
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
    public int totalAndares(){
        int cont=0,i;
        for(i=0;i<this.getNomeAndar().size();i++){
            cont++;
        }
        return cont;
    }
    
}
