package lk.ac.kln.fct.cs.oop.bookstoremanager;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javafx.application.Application;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		//SpringApplication.run(BookstoreManagerApplication.class, args);
		// This is how normal Spring Boot app would be launched
		// SpringApplication.run(SpringBootExampleApplication.class, args);

		// JavaFxApplication doesn't exist yet,
		// we'll create it in the next step
		Application.launch(JavaFxApplication.class, args);
	}

}
