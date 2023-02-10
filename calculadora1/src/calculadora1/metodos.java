/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

/**
 *
 * @author famtu
 */
public class metodos {
    private String cadena;
    private double resultado ;
    private boolean  suma;
    private boolean  resta;
    private boolean  multiplicacion;      
    private boolean division;
    private boolean raiz;
     private boolean  seno;
    private boolean   coseno;
   private boolean  tangente;
    private boolean     contagente;
     private boolean secante;
      private boolean cosecante;
    private boolean   alcuadrado;  
    private boolean   alapotencia;   
      
     public metodos(){
         cadena="";
         suma=false;
         resta=false;
         multiplicacion=false;
         division=false;
         raiz=false;
         coseno=false;
         tangente=false;
         contagente=false;
         secante=false;
         alcuadrado=false;
         alapotencia=false;
         
         
     } 
     
     public String concatamiento(String cadena){
         
         this.cadena=this.cadena+cadena;
         return this.cadena;
         
     }
     public void suma(String cadena){
         this.resultado=Double.parseDouble(cadena);
         suma=true;
         this.cadena="";
     }
     public void resta(String cadena){
         this.resultado=Double.parseDouble(cadena);
         resta=true;
         this.cadena="";
     }
     
     public void multiplicacion(String cadena){
         this.resultado=Double.parseDouble(cadena);
         multiplicacion=true;
         this.cadena="";
     }
     public void division(String cadena){
         this.resultado=Double.parseDouble(cadena);
         division=true;
         this.cadena="";
     }
     public void raiz(String cadena){
         this.resultado=Double.parseDouble(cadena);
         raiz=true;
         this.cadena="";
     }
      public void seno(String cadena){
         this.resultado=Double.parseDouble(cadena);
         seno=true;
         this.cadena="";
     }
     public void coseno(String cadena){
         this.resultado=Double.parseDouble(cadena);
         coseno=true;
         this.cadena="";
     }
     public void tangenta(String cadena){
         this.resultado=Double.parseDouble(cadena);
         tangente=true;
         this.cadena="";
     }
     public void contagente(String cadena){
         this.resultado=Double.parseDouble(cadena);
         contagente=true;
         this.cadena="";
     }
     public void secane(String cadena){
         this.resultado=Double.parseDouble(cadena);
         secante=true;
         this.cadena="";
     }
     public void cosecante(String cadena){
         this.resultado=Double.parseDouble(cadena);
         cosecante=true;
         this.cadena="";
     }
     public void alcuadrado(String cadena){
         this.resultado=Double.parseDouble(cadena);
         alcuadrado=true;
         this.cadena="";
     }
     public void alapotencia(String cadena){
         this.resultado=Double.parseDouble(cadena);
         alapotencia=true;
         this.cadena="";
     }
     ///////////////////////////////////////////////////////////////////

public double resultado(String numero){
    if(suma==true){
        resultado=resultado+Double.parseDouble(numero);
    }
    else if(resta==true){
        resultado=resultado-Double.parseDouble(numero);
    }
    else if(multiplicacion==true){
        resultado=resultado*Double.parseDouble(numero);
    }
   else if(division==true){
        resultado=resultado/Double.parseDouble(numero);
    }
    else if(raiz==true){
        resultado=Math.sqrt(Double.parseDouble(numero));
    }
    
    else if(seno==true){
        double seno=Math.toRadians(resultado);
        resultado=Math.sin(seno);
    }
    else if(coseno==true){
        double coceno=Math.toRadians(resultado);
        resultado=Math.sin(coceno);
    }
    else if(tangente==true){
        double tangente=Math.toRadians(resultado);
        resultado=Math.sin(tangente);
    }
    else if(contagente==true){
        double contagente=Math.toRadians(resultado);
        resultado=1/Math.tan(contagente);
    }
    else if(secante==true){
        double secante=Math.toRadians(resultado);
        resultado=1/Math.cos(secante);
    }
    else if(cosecante==true){
        double cosecante=Math.toRadians(resultado);
        resultado=1/Math.cos(cosecante);
    }
    else if(alcuadrado==true){
        resultado=Math.pow(resultado, 2);
    }
    else if(alapotencia==true){
        resultado=Math.pow(resultado, Double.parseDouble(numero));
    }
    
     suma=false;
         resta=false;
         multiplicacion=false;
         division=false;
         raiz=false;
         coseno=false;
         tangente=false;
         contagente=false;
         secante=false;
         alcuadrado=false;
         alapotencia=false;
        
         return resultado;
        
    
    
    
    
}


}
