//Metodos estaticos: Acceso a metodo dinamico
class Clase
{
	public int a;
	
	static void main()
	{
		this.a = 3;
	}
	
	dynamic int met1()
	{
		return 4;
	}
}