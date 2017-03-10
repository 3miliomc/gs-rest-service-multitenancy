package com.rpa.demo.tenancy;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacturaController {
	  	private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();

	    @RequestMapping(value = "factura/{facturaId}", method = RequestMethod.GET)
	    @ResponseBody public Factura getFactura(@PathVariable final Long facturaId) {
	        return new Factura(counter.incrementAndGet(),
	                            String.format(template, facturaId));
	    }
}
