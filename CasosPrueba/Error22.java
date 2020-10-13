//Encadenado mal formado: Clase no definida
class Clase
{
	public int a;
	
	static void main()
	{}
	
	dynamic int met1()
	{
		a =	Clase2.met1();
		return 4;
	}
}