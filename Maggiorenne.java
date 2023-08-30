package com.casa.esercitazione24.it;

public class Maggiorenne {

	    private String nome;
	    private TesseraElettorale tesseraElettorale;
	    private SchedaElettorale schedaElettorale;
	    private static int elettori = 0;
	    private static int votanti = 0;
	    private static int schede = 0;



	    public Maggiorenne(String nome) {
	        this.nome = nome;
	        setTesseraElettorale();
	        setSchedaElettorale();
	        elettori++;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public SchedaElettorale getSchedaElettorale() {
	        return schedaElettorale;
	    }
	    
	    public TesseraElettorale getTesseraElettorale() {
	        return tesseraElettorale;
	    }

	    public void setSchedaElettorale() {
	        this.schedaElettorale = new SchedaElettorale();
	    }
	    
	    
	    public void setTesseraElettorale() {
	        this.tesseraElettorale = new TesseraElettorale();
	    }

	    
	    
	    
	    public void vota() {
	    this.tesseraElettorale.setTimbroDiVoto(true);
	    this.schedaElettorale.setSchedaElettorale(Opzione.REPUBBLICA);
	    }

	    
	    public void haVotato() {

	        if(this.tesseraElettorale.istimbroDiVoto()) {
	            System.out.println(nome + " ha votato!");
	            votanti ++;
	            }
	        else System.out.println(nome + " non ha votato!");
	        
	         if(this.schedaElettorale.isschedaElettorale() != null) {
	            schede ++;
	            }
	        

	    }

	    public static int getElettori() {
	        return elettori;
	    }

	    public static int getVotanti() {
	        return votanti;
	    }
	    
	    public static int getSchede() {
	        return schede;
	    }


	}
