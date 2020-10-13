class Clase
{
	private int a;
	private int b;
	private Object c;
	private Clase2 cl2;
	
	
	Clase(int aux, int aux2)
	{
		a = aux;
		b = aux2;
		c = new Object();
		cl2 = new Clase2('f');
		
	}
	
	static void main()
	{
		int num;
		num = getNum(2);
	}
	
	static int getNum(int par)
	{
		return par+2;
	}
	
	dynamic int metA()
	{
		if((a == b))
		{
			a = a + 1;
			if(a > 0)
			{
				b = b + 1;
			}
			else
			{
				b = b - 1;
			}
		}
		else
		{
			int aux;
			aux = (System.read());
			(System.printI(a));
		}
		while(true)
		{
			{
				String cadena;
				if(b <= a)
				{
					int exp;
					exp = 1 + 1;
					cadena = "Hola";
				}
			}
			{
				int c, s, d, x;
				{
					c = 5;
					d = 2+3-(6+2*7);
					s = c + d;
					boolean t;
					{
						char ch, ch2;
						ch = 'c';
						ch2 = '1';
					}
				}
			}
			while(!false)
			{
				a = +a;
				b = -b;
				boolean cond;
				cond = ((!(cond))&&(true));
			}
		}
		return a;
	}
	
	dynamic void metB()
	{
		this.a = (System.read());
		this.b = 2-1;
		this.c = (metC());
		return ;
	}
	
	dynamic Object metC()
	{
		c = new Object();
		return c;
	}
	
	dynamic void metD(int i, int j)
	{
		
		cl2.ch = cl2.getC();
		cl2.ch = 'y';
		(metC());
		int k,l;
		k = i;
		l = j;
		Clase2 cl3;
		cl3 = cl2;
		cl2 = new Clase2('n');
	}
}

class Clase2
{
	public char ch;
	
	Clase2(char c)
	{
		ch = c;
	}
	
	dynamic char getC()
	{
		ch = 'f';
		if(1>0)
		{
			if(0>9)
			{
				return ch;
			}
			return ch;
		}
		else
		{
			return ch;
		}
	}
}

class Clase3 extends Clase2
{
	public Clase3 c1;
	public Clase2 c2;
	
	dynamic void comparar()
	{
		c1 = new Clase3();
		c2 = new Clase3();
		if(c2 == c1)
		{
			boolean b;
			b = metA(c1);
			b = metA(c2);
		}
		return;
	}
	
	dynamic boolean metA(Clase2 clase)
	{
		return (clase.ch == clase.getC());
	}
}