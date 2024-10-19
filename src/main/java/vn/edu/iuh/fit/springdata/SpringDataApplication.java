package vn.edu.iuh.fit.springdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vn.edu.iuh.fit.springdata.config.DataBaseConfig;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Old way to get DataSource
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(DataBaseConfig.class);
//        DataSource ds = ctx.getBean(DataSource.class);

//        New way to get DataSource
        DataSource ds = new DataBaseConfig().dataSource();

        Connection connection = ds.getConnection();

//        String sql = "INSERT INTO candidates (first_name, middle_name ,last_name, dob, email, phone) VALUES (?, ?, ?, ?, ?, ?)";

//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString();

    }
}
