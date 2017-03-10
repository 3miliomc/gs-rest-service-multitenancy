package com.rpa.demo.tenancy;

public class Factura {
	 	private final long id;
	    private final String content;

	    public Factura(long id, String content) {
	        this.id = id;
	        this.content = content;
	    }

	    public long getId() {
	        return id;
	    }

	    public String getContent() {
	        return content;
	    }
}
