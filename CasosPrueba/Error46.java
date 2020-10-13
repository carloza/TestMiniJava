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
				//codigo inalcanzable
				(met1());
			}
			else
			{
				return 1;
			}
		}
		
	}	
}
