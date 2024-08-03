package sukkirijavaoyo;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>,Cloneable{
	private String title;
	private Date publishDate;
	private String comment;
	public void settitle(String title)
	{
		this.title=title;
	}
	public String gettitle()
	{
		return this.title;
	}
	public void setpublishDate(Date publishDate)
	{
		this.publishDate=publishDate;
	}
	public Date getpublishDate()
	{
		return this.publishDate;
	}
	public void setcomment(String comment)
	{
		this.comment=comment;
	}
	public String getcomment()
	{
		return this.comment;
	}
	public Book()
	{
		
	}
	@Override
	public Book clone()
	{
		Book result = new Book();
		result.title=this.title;
		result.publishDate = this.publishDate;
		result.comment = this.comment;
		return result;
		
	}
	
	@Override
	public int compareTo(Book obj)
	{
		if(this.publishDate.before(obj.publishDate))
		{
			return -1;
		}
		if(this.publishDate.after(obj.publishDate))
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
		if(!(o instanceof Book))return false;
		Book b = (Book)o;
		if(this.title.equals(b.title)&&this.publishDate.equals(b.publishDate))
		{
			return true;
		}
		return false;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(this.title,this.publishDate);
	}
}
