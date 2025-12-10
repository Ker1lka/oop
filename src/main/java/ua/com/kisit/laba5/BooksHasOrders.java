package ua.com.kisit.laba5;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class BooksHasOrders {
    private Long id;
    private Books book;
    private Issuances issuance;
    private int quantity;
}
