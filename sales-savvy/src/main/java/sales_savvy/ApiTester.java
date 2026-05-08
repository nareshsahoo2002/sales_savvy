package sales_savvy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTester {

    @GetMapping("/api/test")
    public String apiTester() {
    	return "Api is working, Go ahead!";
    }
}
