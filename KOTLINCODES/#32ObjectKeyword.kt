
data class Book(var name : String , var price : Int )  

object BookShelf
{
    var books = arrayListOf<Book>()

    fun showBooks()
    {
        for(i in books)
        {
            println(i)  //if we not given 'data' keyword it may print hashCode instead of printing books or value of 'i' 
        }
    }
}

fun main()
{
    BookShelf.books.add(Book("java",49))
    BookShelf.books.add(Book("kotlin",44))
    BookShelf.books.add(Book("c language",86))
    BookShelf.books.add(Book("python",88))
    BookShelf.books.add(Book("SQL",74))

    BookShelf.showBooks()

}

/*
OUTPUT:
    Book(name = jave, price = 49)
    Book(name - kotlin, price = 44)
    etc...
*/