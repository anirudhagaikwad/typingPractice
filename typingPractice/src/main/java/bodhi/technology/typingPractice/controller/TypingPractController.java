package bodhi.technology.typingPractice.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TypingPractController {
	@GetMapping("/testOne")
    private String testOne(Model model) {
              	// Load the text to be displayed
                String text = "Hello, World!";
                model.addAttribute("text1", text);
            	return "layout/base";
    } // end testOne()
	
}//end TypingPractController
