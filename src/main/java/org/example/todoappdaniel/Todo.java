package org.example.todoappdaniel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    private String id;
    private String description;
    private String status;
}
