package ar.edu.unlam.tp1;

public class Circulo {
Double radio;
Double area;
Double perimetro;

public Circulo (double radio){
	
	this.radio = radio;
}

public void setRadio(double radio) {
	this.radio = radio;
}

public double getPerimetro() {
	return perimetro;
}

public void setArea(double area) {
	this.area = area;
}


public double obtenerRadio(){
	return this.radio;
}


public double obtenerPerimetro(){
	return this.radio* Math.PI * 2;
}

public double obtenerArea(){
	return Math.PI * Math.pow(this.radio, 2);
}

}



