package py.edu.uaa.practica;

import java.util.Date;

public class TarjetaCredito extends Tarjeta {

	public Date fechaVencimiento;
	public int saldoDisponible;
	public int montoCompra;
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public int getSaldoDisponible() {
		return saldoDisponible;
	}
	public void setSaldoDisponible(int saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}
	public int getMontoCompra() {
		return montoCompra;
	}
	public void setMontoCompra(int montoCompra) {
		this.montoCompra = montoCompra;
	}
	
	public TarjetaCredito(String nombreTitular, int nroTarjeta, Date fechaVencimiento, int saldoDisponible) {
		this.setNombreTitular(nombreTitular);
		this.setNroTarjeta(nroTarjeta);
		this.setFechaVencimiento(fechaVencimiento);
		this.setSaldoDisponible(saldoDisponible);
		
	}
	
	public TarjetaCredito() {
		// TODO Auto-generated constructor stub
	}
	public String compra(int montoCompra) {
        
        if(saldoDisponible >= montoCompra){
			resultado = "aprobada";
			}
			
		else {
				resultado = "rechazada";	
				}
			
			return resultado;
	}
	
	public static void main(String[] args) {
		TarjetaCredito T1 = new TarjetaCredito();
		T1.setNroTarjeta(22365336);
		T1.setSaldoDisponible(25000);
		T1.setMontoCompra(12000);
		T1.setResultado(resultado);
		
		System.out.println("La tarjeta de nro" + " " + T1.getNroTarjeta() + " " + "está:" + " " + T1.getResultado());
		
	}
}
