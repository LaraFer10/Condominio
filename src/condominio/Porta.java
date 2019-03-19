
package condominio;


public class Porta {
    private String aberta;
    private String cor;
    private int x;
    private int y;
    private int z;

    
    public String getAberta() {
        return aberta;
    }

    public void setAberta(String aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void pintar(String cor) {
        this.cor = cor;
    }

    public int getX() {
        return x;
    }

  
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public void abre(){
        this.aberta = "aberta";
    }
    public void fecha(){
        this.aberta = "fechada";
    }
    public boolean estaAberta(){
        if("aberta".equals(this.aberta)){
            return true;
        }else{
            return false;
        }
    }
    
    
}
