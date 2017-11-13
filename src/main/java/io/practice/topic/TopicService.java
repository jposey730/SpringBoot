package io.practice.topic;

import java.util.Arrays;

import org.springframework.stereotype.Service;

//business service 
@Service 
public class TopicService {

	//creates a list to later be converted to JSON format by Spring
	private java.util.List<Types> teams= Arrays.asList(
				new Types("Braves","Atlanta Braves", "Baseball Team" ),
				new Types("Falcons","Atlanta Falcons", "Football Team" ),
				new Types("Hawks","Atlanta Hawks", "Basketball Team" ),
				new Types("Packers","Green Bay Packers", "Football Team" )
);
//returns teams
	public java.util.List<Types> getTopiclist() {
		return teams;
	}
//returns a specific team 
	public Types getTopic(String id) {
		return teams.stream().filter(t -> t.getID().equals(id)).findFirst().get();
	}
//	public Types getTopic1(String name) {
//		return teams.stream().filter(t -> t.getName().equals(name)).findFirst().get();
//	}
//	public Types getTopic2(String description) {
//		return teams.stream().filter(t -> t.getDescription().equals(description)).findFirst().get();
//	}

	//allows you to POST a new team
	public void addTopic(Types ty) {
		teams.add(ty);	
}
}

