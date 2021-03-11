package pl.coderslab.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "donations")
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    @Min(1)
    private int quantity;
    @NotBlank
    @ManyToMany
    private List<Category> categories;
    @NotBlank
    @ManyToOne
    private Institution institution;
    @NotBlank
    private String street;
    @NotBlank
    private String city;
    @NotBlank
    private String zipCode;
    @NotBlank
    private LocalDate pickUpDate;
    @NotBlank
    private LocalTime pickUpTime;
    private String pickupComment;
}
