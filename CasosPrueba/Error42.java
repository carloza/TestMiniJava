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
			{
				//falta return
				
			}
			else
			{
				return 1;
			}
		}
	}	
}
