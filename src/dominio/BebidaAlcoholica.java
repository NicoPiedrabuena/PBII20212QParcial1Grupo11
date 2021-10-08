package dominio;

public class BebidaAlcoholica extends Bebida {


	private Double gradoDeAlchol;
	
	


	public BebidaAlcoholica(Double precio, Marca marca, CantidadMiliLitros mililitros) {
		super(precio, marca, mililitros);
		
	      switch (getMarca()) {

	        case FERNET:
	            this.gradoDeAlchol = 39.0;
	            break;
	        case GANCIA:
	            this.gradoDeAlchol = 14.9;
	            break;
	        case SMIRNOFF:
	            this.gradoDeAlchol= 37.0;
	            break;
	        case QUILMES:
	        	this.gradoDeAlchol = 4.5;
	        default:
	            break;
	        }
	}



	public Double getGradoDeAlchol() {
		return gradoDeAlchol;
	}


	public void setGradoDeAlchol(Double gradoDeAlchol) {
		this.gradoDeAlchol = gradoDeAlchol;
	}

}