//Error en llamada a metodo: Error de tipos de parametros
class Clase
{
	static void main()
	{}
	
	dynamic int met1()
	{
		Clase2 c;
		c = new Clase2();
		(met2(c,2));
		return 4;
	}
	
	dynamic void met2(Clase2 c, boolean b)
	{
		
	}
}

class Clase2 extends Clase
{
	
}