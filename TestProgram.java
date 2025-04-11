public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student();

        LibraryResource book = new Book();
        LibraryResource journal = new Journal();
        LibraryResource thesis = new Thesis();
        LibraryResource audioBook = new AudioBook();

        student.borrowResource(book, "Java for Beginners");
        student.borrowResource(journal, "Nature Weekly");
        student.borrowResource(thesis, "Quantum Computing Thesis");
        student.borrowResource(audioBook, "Effective Java - Audiobook");
    }
}
