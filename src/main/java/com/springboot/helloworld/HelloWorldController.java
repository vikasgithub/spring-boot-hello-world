package com.springboot.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloWorldController
{

    @RequestMapping(value="/{name}", method = RequestMethod.GET)
    public Message sayHello(@PathVariable("name") String name) {
        return new Message(name, "Hello World");
    }
}

class Message {
    private String name;
    private String message;

    public Message(String name, String message)
    {
        this.name = name;
        this.message = message;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}