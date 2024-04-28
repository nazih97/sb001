package dz.ibnrochd.master14;

import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
@EnableJdbcRepositories
public class Sb001Application implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(Sb001Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT * FROM wilaya");

       
        for (Map<String, Object> row : result) {
            for (Map.Entry<String, Object> entry : row.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println(); 
        }
    }
}