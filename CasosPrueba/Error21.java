//Encadenado mal formado: 
class Clase
{
	public int a;
	
	static void main()
	{}
	
	dynamic int met1()
	{
		a =	a.met1();
		return 4;
	}
}