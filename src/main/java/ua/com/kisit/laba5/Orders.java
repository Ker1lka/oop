package ua.com.kisit.laba5;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Orders {
    private Long id;
    private Date date;
    private Issuances issuance;
    private Readers reader;
}
