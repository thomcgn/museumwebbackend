package com.museum.mkbackend.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String drinkName;
    private String drinkSize;
    private String drinkPrice;

    @ManyToOne()
    @JoinColumn(name = "fk_category")
    @JsonBackReference
    private DrinkCategory drinkCategory;

}
