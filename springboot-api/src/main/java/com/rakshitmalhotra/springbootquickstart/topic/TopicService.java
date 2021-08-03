package com.rakshitmalhotra.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("Spr","Spring","Java Framework"),
			new Topic("Jav","Java","Programming lang"),
			new Topic("Ans","Ansible","Devops")
			));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		//Conventional way of doing this
/*		
		for(Topic t:topics)
		{
			if(t.getId().equals(id))
			{
				return t;
			}
		}
		return null;
*/
		//Lambda way
		
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic)
	{
		topics.add(topic);
	}
	
	public void updateTopic(Topic topic,String id)
	{
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i,topic);
			}
		}
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId().equals(id))
			{
				topics.remove(i);
			}
		}
	}
	
}
