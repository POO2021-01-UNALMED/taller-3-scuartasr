package taller3.televisores;

public class Control {
	private TV tv;
	
	public void turnOn() {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
	
	public boolean getEstado() {
		return tv.estado;
	}
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	public void setCanal(int canal) {
		if (canal >= 1 && canal <= 120 && this.tv.getEstado() == true) {
			this.tv.setCanal(canal);
		}
	}	
	
	public void enlazar(TV tv) {
		tv.control = this;
		this.tv = tv;
	}

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}		

}
