//Logro Codigo inalcanzable
class Clase
{
	static void main()
	{}
	
	dynamic int met1()
	{
		if(true)
		{
			return 1;
			;	//se permiten sentencias vacias
		}
		else
		{
			if(true)
			{
				return 1;
				{			//
					{		//
						{}	// Se permiten bloques vacios
					}		//
				}			//
			}
			else
			{
				return 1;
			}
		}
		//codigo inalcanzable
		while(false)
		{
			return 1;
		}
	}	
}
