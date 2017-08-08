package com.rahul.sp;


import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicControler {
	
	@Autowired	
	private TopicService topicservice;
  
    @RequestMapping("/topic")
	public List<Topics> gettop(){
		return topicservice.alltopics();		
	}
    
    @RequestMapping("/topic/{id}")
    public Topics getid(@PathVariable String id) {
    	return topicservice.getid(id);
    }
   
    @RequestMapping(method=RequestMethod.POST, value="/topic")
    public List<Topics> ss(@RequestBody Topics topic)
    {
    	return topicservice.updateid(topic);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/topic{id}")
    public List<Topics> updatetopic(@RequestBody Topics topic, @PathVariable String id)
    {
    	return topicservice.updateputid(topic, id);
    }
}
