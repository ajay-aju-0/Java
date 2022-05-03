/* Write a program has class Publisher, Book, Literature and Fiction. Read the information 
and print the details of books from either the category, using inheritance.  */

class Publisher{
	String pname;
	Publisher(String p){
		pname=p;
	}
	void display(){
		System.out.println("Publisher name:"+pname);
	}
}
class Book extends Publisher{
	String bookname;
	Book(String p,String b){
		super(p);
		bookname=b;
	}
	void display(){
		super.display();
		System.out.println("Book name:"+bookname);
	}
}
class Literature extends Book{
	String litname;
	Literature(String p,String b,String l){
		super(p,b);
		litname=l;
	}
	void display(){
		super.display();
		System.out.println("Literature name:"+litname);
	}
}
class Fiction extends Book{
	String fname;
	Fiction(String p,String b,String f){
		super(p,b);
		fname=f;
	}
	void display(){
		super.display();
		System.out.println("Fiction name:"+fname);
	}

}
class BooksInfo{
	public static void main(String ar[]){
		Literature obl=new Literature("Prakash Books","The Story of My Experiments with Truth","An autobiography of Mahathma Gandhi");
		Fiction obf=new Fiction("Random house USA","Anna karenina","Leo Tolstoy");
		System.out.println("Literature");
		System.out.println("---------------------------------------");
		obl.display();
		System.out.println();
		System.out.println("Fiction");
		System.out.println("---------------------------------------");
		obf.display();
		
	}
}
