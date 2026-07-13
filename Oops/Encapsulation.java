class Author {
    private String name;
    private String email;
    private char gender; 

    Author(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String e) {
        email = e;
    }

    public char getgender() {
        return gender;
    }

    public void setgender(char g) {
        gender = g;
    }
}

class Book {
    private String name;
    private Author author;
    public double price;
    public int qtyInStock;

    Book(String n, Author a, double p, int q) {
        name = n;
        author = a;
        price = p;
        qtyInStock = q;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }

    // This method MUST say Author, not String
    public Author getauthor() {
        return author;
    }

    public void setauthor(Author a) {
        author = a;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double p) {
        price = p;
    }

    public int getqtyInStock() {
        return qtyInStock;
    }

    public void setqtyInStock(int q) {
        qtyInStock = q;
    }

    public static void main(String args[]) {
        Author auth = new Author("hima", "himasri@gmail.com", 'f');
        Book b = new Book("sri", auth, 50, 5);

        System.out.println("--- BOOK DETAILS ---");
        System.out.println("Book Name: " + b.getname());
        System.out.println("Price: $" + b.getprice());
        System.out.println("Quantity in Stock: " + b.getqtyInStock());
        
        System.out.println("\n--- AUTHOR DETAILS ---");
        System.out.println("Author Name: " + b.getauthor().getname());
        System.out.println("Author Email: " + b.getauthor().getemail());
        System.out.println("Author Gender: " + b.getauthor().getgender());
    }
}
