package com.rahul.sp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topics>  alltopics = new ArrayList<Topics>(Arrays.asList(
			new Topics("1", "my new", "Rahul"),
			new Topics("2", "my baby", "Vanshu"),
            new Topics("3", "my wife", "Sowmya")));
      
	public Topics getid(String id) {
		return new Topics(id, "my new", "Rahul");
	}
	public List<Topics> alltopics()
	{
		return alltopics;
	}
	
	public List<Topics> updateid(Topics topic)
	{
		alltopics.add(topic);
		return alltopics;
	}
	
	public List<Topics> updateputid(Topics topic, String id)
	{
		for(int i=0; i<alltopics.size(); i++)
		{
			Topics top = alltopics.get(i);
			if(top.getId().equals(id))
			{
				alltopics.set(i, topic);
			}
			
		}
		return alltopics;
	}
	
}
