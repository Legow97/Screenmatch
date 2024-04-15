package com.alura.screenmatch.calculos;

public class RecomendationFilter {
    public void filter(Clasification clasification){
        if(clasification.getClasification()>=4){
            System.out.println("Muy bien evaluado");
        }else if(clasification.getClasification()>=2){
            System.out.println("Popular en el momento");
        }else{
            System.out.println("Colocar en lista para ver después");
        }
    }
}
