package filim.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class FilimBookingApplication {

    public static void main(String[] args) {

        SpringApplication.run(FilimBookingApplication.class, args);
        System.out.println("\n");
        System.out.println("***************************************\n");
        System.out.println("Connection to the server successfully obtained\n");
        System.out.println("***************************************\n");


    }


}
