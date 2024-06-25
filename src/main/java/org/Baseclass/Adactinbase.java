package org.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Adactinbase {
	 public static WebDriver driver;
	   
	   public static void url(WebDriver driver, String u) {
		driver.get(u);
	  }
	   
	    public static void maximize(WebDriver driver) {
	    	driver.manage().window().maximize();		
		}
	   
	   public static void toclick(WebElement c) {
		c.click();

	}
	  	   
	   public static void tosenduser(WebElement user,String n) {
		   user.sendKeys(n);
	   
	   }
	   public static void tosendvalue(WebElement pw, String p) {
		pw.sendKeys(p);

	} 
	   public static void tologin(WebElement login) {
		login.click();

	}
	   public static void toselect(WebDriver driver, WebElement e, String s) {
		Select dropdown = new Select(e);
		dropdown.selectByVisibleText(s);
		
	}
	   public static void toselect1(WebDriver driver, WebElement hotel, int h) {
		
        Select drophotel = new Select(hotel);
        drophotel.selectByIndex(h);
	}
	   public static void toselect2(WebDriver driver, WebElement room, String r) {
		Select droproom = new Select(room);
		droproom.selectByValue(r);

	}
	   
	   public static void toselect3(WebDriver driver, WebElement num, String t) {
		Select droptype = new Select (num);
		droptype.selectByValue(t);

	}
	   public static void tosenddate(WebElement dt, String d) {
			dt.sendKeys(d);

		} 
	   public static void tosendout(WebElement dt1, String dt) {
			dt1.sendKeys(dt);

		} 
	   public static void toselect4(WebDriver driver, WebElement adults, String a) {
			Select droproom = new Select (adults);
			droproom.selectByValue(a);

		} 
	   public static void toselect5(WebDriver driver, WebElement child, String c) {
			Select dropchild = new Select (child);
			dropchild.selectByValue(c);

		}
	   public static void tosearch(WebElement search) {
		search.click();

	} 
	   public static void toselect(WebElement select) {
			select.click();

		} 
	   
	   public static void cont(WebElement contn) {
		contn.click();

	}
	   
	  public static void fname(WebElement f, String n) {
		f.sendKeys(n);

	} 
	   
	  public static void lname(WebElement l, String na) {
			l.sendKeys(na);

		}  
	  
	  public static void add(WebElement add, String a) {
			add.sendKeys(a);

		} 
	  
	  public static void credit(WebElement crdt, String c) {
			crdt.sendKeys(c);

		} 
	  
	  public static void toselect6(WebDriver driver, WebElement credit, String ty) {
			Select dropcredit = new Select (credit);
			dropcredit.selectByValue(ty);

		}
	  
	  public static void toselect7(WebDriver driver, WebElement month, String m) {
			Select dropmonth = new Select (month);
			dropmonth.selectByValue(m);

		}
	  
	  public static void toselect8(WebDriver driver, WebElement year, String y) {
			Select dropyear = new Select (year);
			dropyear.selectByValue(y);

		}
	  public static void cvv(WebElement cvv, String cv) {
			cvv.sendKeys(cv);
	  }
	  
	  public static void booknow(WebElement book) {
			book.click();;
	  }
	  
	  public static void log(WebElement logout) {
			logout.click();
}
}
	  











