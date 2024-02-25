package com.example.Controller;

import com.example.Modelo.persona;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensaje")
public class ControllerMensaje {

    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public persona getXml() {
        return new persona(1, "Edu", 23, 76.5);
    }

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public persona getJson() {
        return new persona(2, "Sara", 24, 60.8);
    }


}
