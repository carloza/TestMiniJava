//Error en llamada a constructor: Error de numero de parametros
class Clase
{
	static void main()
	{}
	
	dynamic int met1()
	{
		Clase2 c;
		c = new Clase2(c);
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