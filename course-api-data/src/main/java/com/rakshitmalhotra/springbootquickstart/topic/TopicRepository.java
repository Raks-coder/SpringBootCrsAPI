package com.rakshitmalhotra.springbootquickstart.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {

	
	
	//getAllTopics()
	//getTopic(String id)
	//updateTopic(Topic t,String id)
	//deleteTopic(String id)
	
}
