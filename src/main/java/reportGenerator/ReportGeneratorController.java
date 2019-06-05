package reportGenerator;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ReportGeneratorController {

    @RequestMapping("/")
    public String index() {
        return "<h1>Report generator index!<h1>";
    }

    @RequestMapping("/health")
    public String health() {
        return "ok";
    }

}
