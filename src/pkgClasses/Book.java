package pkgClasses;

public class Book {
		
	private int ID;
	private String Name;
	private int PageNum;

	public Book(int pID, String pName, int pPageNum) {
		this.ID = pID;
		this.Name = pName;
		this.PageNum = pPageNum;
	}

	public int getID() {
		return this.ID;
	}

	public String getNombre() {
		return this.Name;
	}

	public int getNumeroPaginas() {
		return this.PageNum;
	}

	public void setID(int pID) {
		this.ID = pID;
	}

	public void setNombre(String pNombre) {
		this.Name = pNombre;
	}

	public void getNumeroPaginas(int pNumeroPaginas) {
		this.PageNum = pNumeroPaginas;
	}
		
	public String toString() {
		return "The name of the book is " + this.Name + " and its ID is " + this.ID + ". It has a total of " + this.PageNum + " pages ";
	}
}
