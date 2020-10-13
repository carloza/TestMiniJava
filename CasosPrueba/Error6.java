//Asignacion: Acceso this: variable inexistente
class Clase
{
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