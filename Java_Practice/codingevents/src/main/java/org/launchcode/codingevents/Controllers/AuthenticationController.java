package org.launchcode.codingevents.Controllers;

import org.launchcode.codingevents.Data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthenticationController {
    @Autowired
    UserRepository userRepository;
}
