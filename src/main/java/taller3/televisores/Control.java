package taller3.televisores;

public class Control {
	private TV tv;
	
	public void turnOn() {
		tv.estado = true;
	}
	
	public void turnOff() {
		tv.estado = false;
	}
	
	public boolean getEstado() {
		return tv.estado;
	}
	
	public void canalUp() {
		if (tv.canal < 120) {
			tv.canal++;
		}
	}
	
	public void canalDown() {
		if (tv.canal > 1) {
			tv.canal--;
		}
	}
	
	public void volumenUp() {
		if(tv.volumen < 7) {
			tv.volumen++;
		}
	}
	
	public void volumenDown() {
		if(tv.volumen > 0) {
			tv.volumen--;
		}
	}
	
	public void setCanal(int canal) {
		tv.canal = canal;
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
