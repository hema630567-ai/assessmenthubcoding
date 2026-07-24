// package com.famehub.famehub;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.security.autoconfigure.SecurityAutoConfiguration;
// import org.springframework.boot.security.autoconfigure.UserDetailsServiceAutoConfiguration;

// @SpringBootApplication(exclude = { 
//     SecurityAutoConfiguration.class, 
//     UserDetailsServiceAutoConfiguration.class 
// })
// public class quizappApplication {
//     public static void main(String[] args) {
//         SpringApplication.run(quizappApplication.class, args);
//     }
// }


package com.famehub.famehub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class quizappApplication {

    public static void main(String[] args) {
        SpringApplication.run(quizappApplication.class, args);
    }
}