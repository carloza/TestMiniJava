//Logro Caminos de retorno
class Clase
{
	static void main()
	{}
	
	dynamic int met1()
	{
		if(true)
		{
			return 1;
		}
		else
		{
			if(true)
			{}
			else
			{
				return 1;
			}
		}
		while(false)
		{
			return 1;
		}
		
		//falta return
	}	
}
