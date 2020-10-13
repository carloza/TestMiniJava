//Error en llamada a constructor: Error de tipos de parametros
class Clase
{
	static void main()
	{}
	
	dynamic int met1()
	{
		Clase c;
		c = new Clase2(c,2);
		return 4;
	}
}

class Clase2 extends Clase
{
	Clase2(Clase2 c, int a)
	{
		
	}
}