public class Journal implements LibraryResource {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing journal: " + title);
    }
}
