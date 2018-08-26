package pl.akademiakodu.shop;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {



    @GetMapping("/user")
    public String addUser(){
        return "user";
        // w pliku user.html w templatees
        // będziemy mieć formularz do dodawania użytkownika
    }

    @PostMapping("/user")
    public String show(@RequestParam String username,
                       @RequestParam String email,
                       ModelMap map){
        // tworzymy obiekt z danym z formularza
        User user = new User(username,email);
        map.put("user",user); // przekazanie zmiennej user do widoku html
        // która będzie pod nazwą user
        return "show"; // zwraca plik html:
        // resources/templates/user.html
    }

}
