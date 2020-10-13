//Encadenados mal formados
class Clase
{
	public Clase a;
	
	static void main()
	{}
	
	dynamic int met1()
	{
		Clase c;
		int b;
		b = (c.a.met2());
		return 4;
	}
	
	dynamic int met2()
	{
		return 4;
	}
}
