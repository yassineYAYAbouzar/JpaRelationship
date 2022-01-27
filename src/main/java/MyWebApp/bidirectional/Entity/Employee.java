package MyWebApp.bidirectional.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter

//@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "employee")
    //@OneToMany
    //@JoinTable(name = "employee_address", joinColumns = {@JoinColumn(name = "address_id")}, inverseJoinColumns = {@JoinColumn(name = "employee_id")})
    private List<Address> addresses;

}
