package org.destinystone.login.login.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("LoginController")
public class LoginController {

    @RequestMapping("loginCheck")
    @ResponseBody
    public String  loginCheck(){
        return "223";
    }
}
