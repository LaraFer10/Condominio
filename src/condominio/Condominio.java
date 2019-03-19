
package condominio;


import javax.swing.JOptionPane;

public class Condominio {

    
    public static void main(String[] args) {
        //Teste da Porta
       Porta porta = new Porta();
       porta.pintar(JOptionPane.showInputDialog("Cor da porta"));
       String t;
       t=JOptionPane.showInputDialog("(1)Para fechar portas\n(2)Para abrir");
       int co = Integer.parseInt(t);
       switch(co){
           case 1:
               porta.fecha();
               break;
           case 2:
               porta.abre();
               break;
       }
       if(porta.estaAberta()){
        JOptionPane.showMessageDialog(null, "Porta esta aberta");
       }else{
           JOptionPane.showMessageDialog(null, "Esta fechada");
       }
       JOptionPane.showMessageDialog(null, "Cor da porta: "+porta.getCor());
       
       //Teste da Casa
       Casa casa = new Casa();
       int cont=0;
       
       casa.pinta(JOptionPane.showInputDialog("Escolha a cor da casa: "));
     
       while(cont == 0){
           Porta porta1 = new Porta();
           porta1.pintar(JOptionPane.showInputDialog("Escolha a cor da porta: "));
           String x, y, z;
           int xx, yy, zz;
           
           x = JOptionPane.showInputDialog("Escreva dimensão X: ");
           xx = Integer.parseInt(x);
           porta1.setX(xx);
           y = JOptionPane.showInputDialog("Escreva dimensão Y: ");
           yy = Integer.parseInt(y);
           porta1.setY(yy);
           z = JOptionPane.showInputDialog("Escreva dimensão Z: ");
           zz = Integer.parseInt(z);
           porta1.setZ(zz);
           casa.cadastrarPorta(porta1);
           cont = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais portas?");
       }
        int i;
       for(i=0;i<casa.getPortas().size();i++){
           int resto = i%2;
           if(resto==0){
               casa.getPortas().get(i).fecha();
           }else{
               casa.getPortas().get(i).abre();
           }
       }
       JOptionPane.showMessageDialog(null, "Numero de portas abertas "+casa.portasAbertas());
       
       //Teste de Edificios
       Edificio edificio = new Edificio();
       edificio.pinta(JOptionPane.showInputDialog("Cor do predio"));
       Porta porta1 = new Porta();
       int quant=0;
       while(quant==0){
           porta1.pintar(JOptionPane.showInputDialog("Escolha a cor da porta: "));
           String x, y, z;
           int xx, yy, zz;
           
           x = JOptionPane.showInputDialog("Escreva dimensão X: ");
           xx = Integer.parseInt(x);
           porta1.setX(xx);
           y = JOptionPane.showInputDialog("Escreva dimensão Y: ");
           yy = Integer.parseInt(y);
           porta1.setY(yy);
           z = JOptionPane.showInputDialog("Escreva dimensão Z: ");
           zz = Integer.parseInt(z);
           porta1.setZ(zz);
           edificio.adicionarPorta(porta1);
           quant = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais portas?");
       }
       
       for(i=0;i<edificio.getPortas().size();i++){
           int div;
           div = i%3;
           if(div==0){
               edificio.getPortas().get(i).abre();
           }else{
               edificio.getPortas().get(i).fecha();
           }
         
        }
       JOptionPane.showMessageDialog(null, "Número de portas Abertas: "+edificio.portasAbertas()+"\nTotal de portas: "+edificio.totalPortas());
       int cal=0;
       while(cal == 0){
           edificio.adicionarAndar(JOptionPane.showInputDialog("Digite nome do andar"));
           cal = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais andares?");
           
       }
       JOptionPane.showMessageDialog(null, "Total de andares"+edificio.totalAndares());
       
       
      
    }
    
}
