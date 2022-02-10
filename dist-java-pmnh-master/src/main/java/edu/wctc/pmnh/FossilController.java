package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/commands")
public class FossilController {
    @RequestMapping("/jump_scares")
    public String showTriloFacts() {
        return "pages/jump-scares";
    }

    @RequestMapping("/custom_mobs")
    public String showFossilFacts() {
        return "pages/custom-mobs";
    }
}
