//Metodos estaticos: Acceso a metodo dinamico
class Clase
{
	public int a;
	
	static void main()
	{
		int b;
		b = met1();
	}
	
	dynamic int met1()
	{
		return 4;
	}
}