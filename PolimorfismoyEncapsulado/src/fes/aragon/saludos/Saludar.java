package fes.aragon.saludos;

public class Saludar {
	private int num_anios;
	public	String nombre;
			
			public Saludar() {
				num_anios = 1;
				nombre = "Jhon Doe";
			}
			
			public String saludar() {
				return "hola" + nombre;
			}
			
			public void saludar(int num_anios) {
				setNum_anios(num_anios);
				System.out.println("Tu edad es " + getNum_anios());
			}
			
			public static void saludar(String nombre) {
				System.out.println("hola " + nombre);
			}
			
			public int getNum_anios() {
				return num_anios;
			}
			
			public void setNum_anios(int num_anios) {
				if(num_anios >= 1 && num_anios <= 100) {
					this.num_anios = num_anios;
				} else {
					this.num_anios = 0;
				}
				
			}
			
			
}
