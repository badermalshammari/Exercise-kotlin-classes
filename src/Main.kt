class Book(var Title: String, var Author: String, var yearPublished: Int) {
    var genre: String = ""
    fun getBookInfo(): String {
        if (genre == "") {
            return "$Title by $Author ($yearPublished)"
        }
        return "$Title by $Author $genre ($yearPublished)"
    }

}


fun main() {
    var book = Book("Life","Bader",2025)
    book.genre = "Horror"
    println(book.getBookInfo())
}