//Asignacion: Acceso this: variable inexistente
class Clase
{
	private int a;
	
	static void main()
	{}
	
	dynamic void met1()
	{
		this.met2() = 2;
	}
	
	dynamic int met2()
	{
		return 2;
	}
}