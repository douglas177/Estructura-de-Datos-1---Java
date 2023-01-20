/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Estudiante
 */
public final class Fraccion {
    int Numerador; //Contiene el Numerador y Signo
    int Denominador; // Contiene el Denominador
    
    public Fraccion(){
        this.Numerador = 0;
        this.Denominador = 1;
    }

    public Fraccion(char signo, int num, int deno) {
        if(deno == 0)
        {
            System.out.println("Error:Fraccion:El Denominador es 0");
            System.exit(1);
        }
        else{
            if(signo=='+')
            this.Numerador=+Math.abs(num);
            else 
                this.Numerador=-Math.abs(num);
            this.Denominador=Math.abs(deno);
        }  
        simplificar();
    }

    public void setNumerador(int Num) {
        if(this.Numerador>=0)
            this.Numerador = +Math.abs(Num);
        else 
            this.Numerador = -Math.abs(Num);
       simplificar();
    }

    public void setDenominador(int Deno) {
        if(Deno==0)
        {
            System.out.println("Error:SetDenominador:El Denominador es 0");
            System.exit(1); 
        }  
        else
            this.Denominador = Math.abs(Deno);
        simplificar();
    }
    public void setSigno(char signo){
        if(signo=='+')
            this.Numerador = +Math.abs(Numerador);
        else
            this.Numerador = -Math.abs(Numerador);
    }

    public int getNumerador() {
        return Math.abs(Numerador);
    }

    public int getDenominador() {
        return Denominador;
    }
    
    public char getSigno(){
        if(this.Numerador>=0)
            return '+';
        else
            return '-';
    }

    @Override
    public String toString() {
        String S = "";
        S=S+"    "+getNumerador()+"\n"+   getSigno()+"  ---\n    " +getDenominador();
        return S;
    }
    private int MCD(){
        int num = Math.abs(this.Numerador);
        int den = Math.abs(this.Denominador);
        if(den == 0){
            return num;
        }
        else{
            while(den!=0){
                int c = num%den;
                num = den;
                den = c;
            }
            return num;
        }
                
    }
    public void simplificar(){
        int x = MCD();
        this.Numerador = Numerador/x;
        this.Denominador = Denominador/x;
    }
    
    public void suma(Fraccion A, Fraccion B){
        this.Denominador=A.Denominador* B.Denominador;
        this.Numerador =(this.Denominador/A.Denominador*A.Numerador)+(this.Denominador/B.Denominador*B.Numerador);
        simplificar();
    }
    
    public void resta(Fraccion A, Fraccion B){
      this.Denominador=A.Denominador* B.Denominador;
        this.Numerador =(this.Denominador/A.Denominador*A.Numerador)-(this.Denominador/B.Denominador*B.Numerador);
        simplificar();
     }
    public void multiplicacion(Fraccion A, Fraccion B){
        this.Denominador=A.getDenominador()* B.getDenominador();
        this.Numerador =A.Numerador*B.Numerador;
        simplificar();
    }
    
    public void division(Fraccion A, Fraccion B){
        this.Denominador=A.Denominador* B.Numerador;
        this.Numerador =A.Numerador*B.Denominador;
        if(Numerador/Denominador>=0)
            Numerador = + Math.abs(Numerador);
        else
            Numerador = - Math.abs(Numerador);
        Denominador = Math.abs(Denominador);
        simplificar();
    }
    
}
