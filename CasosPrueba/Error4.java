//Asignacion: Acceso this: variable inexistente
class Clase
{
	private int a;
	
	static void main()
	{}
}

class Clase2
{
	dynamic void met1()
	{
		this.a = 2;
	}
}