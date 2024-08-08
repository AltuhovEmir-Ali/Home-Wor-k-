public class Book {
        private String code;
        private String author;
        private String title;
        private int year;

        public Book(String code, String author, String title, int year) {
            this.code = code;
            this.author = author;
            this.title = title;
            this.year = year;
        }

        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "Код: " + code + ", Автор: " + author + ", Название: " + title + ", Год: " + year;
        }
    }
