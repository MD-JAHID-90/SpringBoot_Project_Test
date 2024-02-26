package MeritechDemoProject.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor

public class User {

    private Long id;
    private String username;
    private String email;
    private String phone;
}
