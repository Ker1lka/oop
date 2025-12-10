package ua.com.kisit.laba5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Readers reader = new Readers();
        reader.setId(1L);
        reader.setFirstName("Stepan");
        reader.setLastName("Moroz");
        reader.setEmail("first@example.com");
        reader.setPhone("09745645");
        Readers reader2 = new Readers();
        reader2.setId(2L);
        reader2.setFirstName("Kolya");
        reader2.setLastName("Karnatov");
        reader2.setEmail("second@example.com");
        reader2.setPhone("09723423");
        Readers reader3 = new Readers();
        reader3.setId(3L);
        reader3.setFirstName("Nazar");
        reader3.setLastName("Shelemaha");
        reader3.setEmail("third@example.com");
        reader3.setPhone("09790832");


        Users user = new Users();
        user.setId(1L);
        user.setLogin("stepa");
        user.setPassword("1111");
        Users user2 = new Users();
        user2.setId(2L);
        user2.setLogin("kolya");
        user2.setPassword("2222");
        Users user3 = new Users();
        user3.setId(3L);
        user3.setLogin("nazar");
        user3.setPassword("3333");

        Roles role1 = new Roles();
        role1.setId(1L);
        role1.setName("admin");

        Roles role2 = new Roles();
        role2.setId(2L);
        role2.setName("user");

        Set<Roles> rolesList = new HashSet<>();
        rolesList.add(role1);
        rolesList.add(role2);

        user.setRoles(rolesList);
        user2.setRoles(rolesList);
        user3.setRoles(rolesList);
        reader.setUser(user);
        reader2.setUser(user2);
        reader3.setUser(user3);

        Categories category = new Categories();
        category.setId(1L);
        category.setName("Americans Books");
        category.setDescription("English language");
        category.setImage("/pictures/USA_flag.jpg");

        Categories category2 = new Categories();
        category2.setId(2L);
        category2.setName("Europian Books");
        category2.setDescription("Spanish, German, French, Italian languages");
        category2.setImage("/pictures/Euro_flag.jpg");

        Books book = new Books();
        book.setId(1L);
        book.setCategory(category);
        book.setTitle("The Thorn Birds");
        book.setAuthor("Kolin Makkalou");
        book.setDescription("Dramatic story about love in 1980`s");
        book.setImage("/pictures/thorn_bird.jpg");

        Books book2 = new Books();
        book2.setId(2L);
        book2.setCategory(category);
        book2.setTitle("Lonesome Dove");
        book2.setAuthor("Larri Makmertri");
        book2.setDescription("Lonely dove fall in love, book writed in 1986");
        book2.setImage("/pictures/lone.jpg");

        Books book3 = new Books();
        book3.setId(3L);
        book3.setCategory(category2);
        book3.setTitle("Duck");
        book3.setAuthor("Lina Kostenko");
        book3.setDescription("Dirty duck dreams of traveling");
        book3.setImage("/pictures/duck.jpg");

        Address address = new Address();
        address.setId(1L);
        address.setCity("Lviv");
        address.setCountry("Ukraine");
        address.setStreet("Kvitneva");
        address.setZip("54321");

        Address address2 = new Address();
        address2.setId(2L);
        address2.setCity("Tokyo");
        address2.setCountry("Japan");
        address2.setStreet("London");
        address2.setZip("12345");

        Address address3 = new Address();
        address3.setId(3L);
        address3.setCity("Paris");
        address3.setCountry("French");
        address3.setStreet("Lobvi");
        address3.setZip("87875");

        Address address4 = new Address();
        address4.setId(4L);
        address4.setCity("Berlin");
        address4.setCountry("Germany");
        address4.setStreet("Frichs");
        address4.setZip("98982");

        Issuances issuance = new Issuances();
        issuance.setId(1L);
        issuance.setName("In Library");
        issuance.setAddress(address);

        Issuances issuance2 = new Issuances();
        issuance2.setId(2L);
        issuance2.setName("To Home");
        issuance2.setAddress(address2);

        Issuances issuance3 = new Issuances();
        issuance3.setId(3L);
        issuance3.setName("To Home");
        issuance3.setAddress(address3);

        Issuances issuance4 = new Issuances();
        issuance4.setId(4L);
        issuance4.setName("To Home");
        issuance4.setAddress(address4);

        Orders order = new Orders();
        order.setId(1L);
        order.setReader(reader);
        order.setDate(new Date());
        order.setIssuance(issuance);

        Orders order2 = new Orders();
        order2.setId(2L);
        order2.setReader(reader2);
        order2.setDate(new Date());
        order2.setIssuance(issuance2);

        BooksHasOrders booksHasOrders = new BooksHasOrders();
        booksHasOrders.setId(1L);
        booksHasOrders.setBook(book);
        booksHasOrders.setIssuance(issuance2);
        booksHasOrders.setQuantity(1);

        BooksHasOrders booksHasOrders2 = new BooksHasOrders();
        booksHasOrders2.setId(2L);
        booksHasOrders2.setBook(book3);
        booksHasOrders2.setIssuance(issuance4);
        booksHasOrders2.setQuantity(2);

        List<Readers> readersList = new ArrayList<>();
        readersList.add(reader);
        readersList.add(reader2);
        readersList.add(reader3);
        System.out.println(readersList);

        List<Books> booksList = new ArrayList<>();
        booksList.add(book);
        booksList.add(book2);
        booksList.add(book3);
        System.out.println(booksList);

        List<Orders> ordersList = new ArrayList<>();
        ordersList.add(order);
        ordersList.add(order2);
        System.out.println(ordersList);


        List<BooksHasOrders> booksHasOrdersList = new ArrayList<>();
        booksHasOrdersList.add(booksHasOrders);
        booksHasOrdersList.add(booksHasOrders2);
        System.out.println(booksHasOrdersList);

    }
}
