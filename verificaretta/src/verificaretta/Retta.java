/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaretta;
/**
 *
 * @author studente
 */
public class Retta {
    double a;
    double b;
    double c;
    public Retta(double a,double b,double c) throws Exception{
        if((a==0)&&(b==0)){
            throw new Exception();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     *
     * @return
     */
    public String getTipo(){
        String risp;
        if((a!=0)&&(b!=0)){
            risp="obliqua";
            return risp;
        }
        if(a==0){
            risp="orizzontale";
            return risp;
        }
        if(b==0){
            risp="verticale";
            return risp;
        }
        return null;
    }
    public boolean appartiene(double x,double y){
        double verifica;
        verifica = ((a*x)+(b*y)+c);
        if(verifica==0){
            return true;
        }else{
            return false;
        }
        
    }
    public String stampa(){
        String r = "";
        if(a!=0){
            r += a+"x ";
        }
        if(b!=0){
            if(b>0){
                r += "+ ";
            }
            r += b+"y ";
        }
        if(c!=0){
            if(c>0){
                r += "+ ";
            }
            r += c;
        }
        r += "= 0";
        return r;
    }
}
