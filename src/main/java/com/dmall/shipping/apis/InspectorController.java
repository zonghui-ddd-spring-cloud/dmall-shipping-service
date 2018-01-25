package com.dmall.shipping.apis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/inspector")
public class InspectorController {

    @Value( "${server.port}" )
    private String port;

    @GetMapping
    public Map getPort() {
        Map result = new HashMap();
        result.put("port", port);

        return result;
    }
}
