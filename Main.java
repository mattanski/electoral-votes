package com.casa.esercitazione24.it;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Maggiorenne riccardo = new Maggiorenne("Riccardo");
		Maggiorenne luca = new Maggiorenne("Luca");
		Maggiorenne giovanni = new Maggiorenne("Giovanni");
		Maggiorenne federica = new Maggiorenne("Federica");
		Maggiorenne berry = new Maggiorenne("Berry");
		Maggiorenne lucio = new Maggiorenne("Lucio");
		Maggiorenne frank = new Maggiorenne("Frank");
		Maggiorenne mattia = new Maggiorenne("Mattia");
		SchedaElettorale scheda1 = new SchedaElettorale();
		
		List<Maggiorenne> Elettori = new ArrayList<Maggiorenne>();
		List<Maggiorenne> Votanti = new ArrayList<Maggiorenne>();
		List<SchedaElettorale> ListaSchedeElettorali = new ArrayList<SchedaElettorale>();
		
		
		mostraMaggiorenni();
        mostraVotanti();
        mostraSchede();

        riccardo.vota();
        riccardo.haVotato();

        luca.vota();
        luca.haVotato();
        
        giovanni.vota();
        giovanni.haVotato();
        
        federica.vota();
        federica.haVotato();
        
        berry.vota();
        berry.haVotato();
        
        lucio.vota();
        lucio.haVotato();
        
       
        frank.haVotato();
        mattia.haVotato();
   
            
        mostraMaggiorenni();
        mostraVotanti();
        mostraSchede();
        stampaAVideo(ListaSchedeElettorali);
         
    }
	
			
			public static void stampaAVideo(List<SchedaElettorale>ListaSchedeElettorali) {  
	        for(SchedaElettorale x : ListaSchedeElettorali) {
	        	System.out.println(x);
	    		}
	        }
	


	public static void mostraMaggiorenni() {
        System.out.println("Numero totale elettori: " + Maggiorenne.getElettori() );
    }

    public static void mostraVotanti() {
        System.out.println("Numero totale votanti: " + Maggiorenne.getVotanti());
    }

    
    public static void mostraSchede() {
        System.out.println("Numero totale Schede Elettorali: " + Maggiorenne.getVotanti());
    }

}
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		

