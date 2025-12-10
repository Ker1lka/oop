package ua.com.kisit.laba5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Attribute {
    private Long id;
    private String name;
    private String description;
    private String value;
}
