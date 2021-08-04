package com.rakshitmalhotra.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	
	public List<Topic> getAllTopics()
	{
		//return topics;
		List<Topic>topicList=new ArrayList<>();
		topicRepository.findAll().forEach(topicList::add);
		return topicList;
	}
	
	public Topic getTopic(String id)
	{

		//Lambda way
		
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
		return topicRepository.findById(id).orElse(null);
	}
	
	public void addTopic(Topic topic)
	{
		topicRepository.save(topic);
	}
	
	public void updateTopic(Topic topic,String id)
	{
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topicRepository.deleteById(id);
	}
	
}
