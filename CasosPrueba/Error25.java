//Error en llamada a metodo: Error de tipos parametro
class Clase
{
	static void main()
	{}
	
	dynamic int met1()
	{
		Clase c;
		c = new Clase2();
		(met2(c));
		return 4;
	}
	
	dynamic void met2(Clase2 c)
	{
		
	}
}

class Clase2 extends Clase
{
	
}