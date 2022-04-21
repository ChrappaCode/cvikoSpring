package sk.stuba.fei.uim.oop.cviko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class AhojKontroler {

    @Autowired
    private IAhojkyServise servise;

    private int pocitadlo = 0;

    @GetMapping(value = "/ahoj" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AhojOdozva> ahoj(){
        return new ResponseEntity<>(new AhojOdozva(this.pocitadlo++,"Alojz Gec"), HttpStatus.OK);
    }

    @GetMapping(value = "/param")
    public String ahojParameter(@RequestParam(name = "name" , defaultValue = "skap") String meno){

        return "ahoj " + meno;

    }

    @GetMapping(value = "/path/{name}")
    public String ahojPathParameter(@PathVariable("name") String meno){

        return "ahoj " + meno;

    }

    @PostMapping("/telo")
    public String telo(@RequestBody AhojRequestTelo telo){
        return servise.urobOdpoved(telo);
    }

}
