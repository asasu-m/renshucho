package sukkirijavaoyo;

public class Account implements Comparable<Account>{
	String accountNo;//口座番号
	int number;//口座番号
	int zandaka;//残高
	
	@Override
	public int compareTo(Account obj)
	{
		if(this.number < obj.number)
		{
			return -1;
		}
		if(this.number > obj.number)
		{
			return 1;
		}
		return 0;	
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o==this)return true;
		if(o==null)return false;
		if(!(o instanceof Account))return false;
		Account r = (Account)o;
		if(!this.accountNo.trim().equals(r.accountNo.trim())) {
			return false;
		}
		return true;
	}
}
