package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/commands")
public class GlacierController {
   @GetMapping("/timed_events")
    public String showGlacierFactsGet(){return "pages/timed-events";}

}
