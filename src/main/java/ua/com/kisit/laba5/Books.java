package ua.com.kisit.laba5;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Books {

    private Long id;
    private String title;
    private String description;
    private String author;
    private String image;

    private Categories category;
}
