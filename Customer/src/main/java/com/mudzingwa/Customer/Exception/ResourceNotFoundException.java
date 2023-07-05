package com.mudzingwa.Customer.Exception;

public class ResourceNotFoundException extends RuntimeException{
    private String resourcename;
    private String userid;
    private  long id;

    public ResourceNotFoundException( String resourcename, String userid, long id) {
        super(String.format("%s not found  with %s of %s",resourcename,userid,id));
        this.resourcename = resourcename;
        this.userid = userid;
        this.id = id;
    }
}
