//Asignacion: Tipo ladoIzq distinto a tipo ladoDer
class Clase
{
	private Clase a;
	
	static void main()
	{}
	
	dynamic void met1()
	{
		a = met2();
	}
	
	dynamic int met2()
	{
		return 2;
	}
}