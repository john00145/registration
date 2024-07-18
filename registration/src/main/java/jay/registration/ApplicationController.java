package jay.registration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/")
    public String dashboard(){
        return "views/backend/dashboard/index";
    }


}
