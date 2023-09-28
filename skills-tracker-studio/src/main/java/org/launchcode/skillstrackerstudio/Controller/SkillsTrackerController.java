package org.launchcode.skillstrackerstudio.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsTrackerController {
    @RequestMapping
public String landingPage(){
    return "<html>" +
            "<h1>Skills Tracker</h1>" +
            "<h2><em>We have a few skills we would like to learn. Here's a list!</em></h2>" +
            "<body>" +
            "<ol>" +
            "<option>Java</option>" +
            "<option>JavaScript</option>" +
            "<option>Python</option>" +
            "</ol>" +
            "</body>" +
            "</html>";
}

@GetMapping("form")
    public String skillsForm(){
        return "<html>" +
                "<body>" +
                "<form action='form-submit' method='get'>" +
                "<h2>Name: </h2>" +
                    "<input type='text'name = 'name'>\n" +
                "<h3>My favorite language: </h3>" +
                    "<select name='faveLang1' id = 'codeLang'>" +
                         "<option>Java</option>" +
                         "<option>JavaScript</option>" +
                         "<option>Python</option>" +
                "   </select>\n" +
                "<h3>My second favorite language: </h3>" +
                " <select name='faveLang2' id = 'codeLang'>" +
                " <option>Java</option>" +
                " <option>JavaScript</option>" +
                " <option>Python</option>" +
                " </select>\n" +
                "<h3>My third favorite language: </h3>" +
                "  <select name='faveLang3' id = 'codeLang'>" +
                "     <option>Java</option>" +
                "     <option>JavaScript</option>" +
                "      <option>Python</option>" +
                "   </select>\n" +
                "\n<input type='submit' value = 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
}

@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "form-submit")
    public String formSubmitted(@RequestParam String name, @RequestParam String faveLang1, @RequestParam String faveLang2, @RequestParam String faveLang3){
    return createMessage(name, faveLang1, faveLang2, faveLang3);
}

public static String createMessage(String name, String faveLang1, String faveLang2, String faveLang3){
        return "<html>" +
                "<h1>"+ name + "</h1>\n" +
                "<body>" +
                "<ol>" +
                "<option> 1. "+ faveLang1 +"</option>" +
                "<option> 2. " + faveLang2 + "</option>" +
                "<option> 3. " + faveLang3 + "</option>"+
                "</body>" +
                "</html>";
}

}
