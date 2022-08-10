package CuentaBanco;

public class CuentaBanco {

	private String Numero;
	private double Balance;
	private String Nombre_Cliente;
	private String Email;
	private String Telefono;
	
	public  void Depositar (double MontoDepositado) {
		this.Balance += MontoDepositado;
		System.out.println("El deposito de $ " + MontoDepositado);
		System.out.println("En la cuenta tiene $ " + this.Balance);
	}
	public void retirar(double MontoRetirado) {
		if (this.Balance-MontoRetirado <0) {
			System.out.println("No tiene saldo suficiente");
			System.out.println("en la cuenta tienes $ " + this.Balance);
		}else {
			this.Balance -= MontoRetirado;
			System.out.println("Ha retirado $" + MontoRetirado);
			System.out.println("En la cuenta tiene $ " + this.Balance);
		}
		
	}
	public String getNumero() {
		return this.Numero;
	}
	public void setNumero(String numero) {
		this.Numero = numero;
	}
	public double getBalance() {
		return this.Balance;
	}
	public void setBalance(double balance) {
		this.Balance = balance;
	}
	public String getNombre_Cliente() {
		return this.Nombre_Cliente;
	}
	public void setNombre_Cliente(String nombre_Cliente) {
		this.Nombre_Cliente = nombre_Cliente;
	}
	public String getEmail() {
		return this.Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getTelefono() {
		return this.Telefono;
	}
	public void setTelefono(String telefono) {
		this.Telefono = telefono;
	}
}
