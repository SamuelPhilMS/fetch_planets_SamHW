package org.launchcode.codingevents.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping("events")
public class EventController {

   // private static List<String> events = new ArrayList<>();
    private static HashMap<String, String>  events = new HashMap<>();
@GetMapping
    public String eventHandler(Model model){
    events.put("Code With Pride", "A coding event for queer and genderquestioning coders.");
    events.put("WWDC", "World Wide Developers' Conference");
    events.put("Code Til' Dawn", "Coders coding til' the morning light.");
    model.addAttribute("title", "All Events");
    model.addAttribute("events", events);
    return "events/index";
}

@GetMapping("create")
public String renderCreateEventForm(){
    return "events/create";
}

@PostMapping("create")
public String createNewEvent(@RequestParam String eventName, String eventDescription){
    events.put(eventName, eventDescription);
    return "redirect:/events";
}

}
