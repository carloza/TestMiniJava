//Error en llamada a constructor: Clase inexistente
class Clase
{
	static void main()
	{}
	
	dynamic int met1()
	{
		Clase2 c;
		int v;
		v = new Clase3(c,2);
		return 4;
	}
}

class Clase2 extends Clase
{
	public int a;
	
	Clase2(Clase2 c, int a1)
	{
		
	}
}