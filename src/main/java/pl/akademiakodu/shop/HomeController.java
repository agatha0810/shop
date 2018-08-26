package pl.akademiakodu.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {


    // adres url
// w przeglądarce wpisujemy główną ścieżkę serwera
// wywoływana jest następnie metoda hello z Controllera
    @GetMapping("/")
    public String hello() {
        // szukaj pliku html w resources/templates
        // o nazwie hello.html
        return "hello";
    }
/*
    ModelMap to jest klasa w Springu , która służy do przekazywania danych
    ona jest Mapą
    Map<String,String> map = new HashMap<String,String>();
    map.put("hello","witaj");
    map.put("do widzenia","bye");
 */

    // obsługa ścieżki /display
    @GetMapping("/display")
    public String showResult(
            @RequestParam String name, @RequestParam String description,
            ModelMap map
    ) {
        System.out.println("Nazwa to " + name + " a opis to " + description);
        Product product = new Product(name, description);
        map.put("result", product);
        // map.get("result");
        // result

        // oznacza, że Java ma wyświetlić plik resources/templates/display
        return "display";
    }




}
