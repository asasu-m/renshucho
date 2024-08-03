package sukkirijavaoyo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BookList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Book> booklist = new ArrayList<Book>();
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
		String strDate1="2011/10/07";
		String strDate2="2019/06/11";
		String strDate3="2018/06/21";
		Date date1=null,date2=null,date3=null;
		try
		{
			date1 = sdFormat.parse(strDate1);
			date2 = sdFormat.parse(strDate2);
			date3 = sdFormat.parse(strDate3);
		}catch(ParseException e)
		{
			e.printStackTrace();
		}
		book1.settitle("Java入門");
		book1.setpublishDate(date1);
		book1.setcomment("すっきりわかる");

		book2.settitle("Python入門");
		book2.setpublishDate(date2);
		book2.setcomment("カレーが食べたくなる");

		book3.settitle("C言語入門");
		book3.setpublishDate(date3);
		book3.setcomment("ポインタも自由自在");
		booklist.add(book1);
		booklist.add(book2);
		booklist.add(book3);
		for(Book b : booklist)
		{
			 String str = new SimpleDateFormat("yyyy/MM/dd").format(b.getpublishDate());
			System.out.println("書名:"+b.gettitle()+"　発行日："+str+"　コメント:"+b.getcomment());
		}
	}

}
