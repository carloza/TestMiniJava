//Error en llamada a metodo: Error de numero de parametros
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
	
	dynamic void met2(Clase2 c)
	{
		
	}
}

class Clase2 extends Clase
{
	
}