package MyWebApp.manyToOne.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String street;
    private String city;

    @ManyToOne
    //@JoinColumn(name = "employee_id")
   // @JoinTable(name = "employee_address", joinColumns = {@JoinColumn(name = "employee_id")}, inverseJoinColumns = {@JoinColumn(name = "address_id")})
    private Employee employee;

}
