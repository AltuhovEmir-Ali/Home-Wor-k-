//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Pizza pepperoni =  new Pepperoni(450,5,true);
//        Pizza margherita = new Margherita(500,6,false);
//        Pizza laFinta = new LaFinta(355,4,true);
//        laFinta.prepare();
//        laFinta.deliver();
//        margherita.prepare();
//        margherita.deliver();
//        pepperoni.prepare();
//        pepperoni.deliver();
//    }
//}
        Department fiction = new Department("Художественная литература");
        Department legal = new Department("Юридическая литература");
        Department technical = new Department("Техническая литература");
        Book book = new Book("001", "Антон Чехов", "Вишневый сад", 1904);
        fiction.addBook(book);
        Library library = new Library();
        library.addDepartment(fiction);
        library.addDepartment(legal);
        library.addDepartment(technical);
        System.out.println("Библиотека:");
        System.out.println(library);
        }
    }
