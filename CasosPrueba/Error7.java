//Asignacion: lado izquierdo invalido
class Clase
{
	private Clase a;
	
	static void main()
	{}
	
	dynamic void met1()
	{
		a.met2() = 4;
	}
	
	dynamic int met2()
	{
		return 2;
	}
}