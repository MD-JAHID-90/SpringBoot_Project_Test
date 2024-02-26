package MeritechDemoProject.Controller;


import MeritechDemoProject.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id) {
        // Return user information based on ID
        return "User with ID : " + id;
    }

    @PostMapping("/post")
    public String addUser(@RequestBody User user) {
        // Process the user data received in the request
        // For simplicity, just returning a sample response
        return "User added successfully";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody User user) {
        // Update user information based on ID
        // For simplicity, just returning a sample response
        return "User with ID " + id + " updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        // Delete user information based on ID
        // For simplicity, just returning a sample response
        return "User with ID " + id + " deleted successfully";
    }



}
