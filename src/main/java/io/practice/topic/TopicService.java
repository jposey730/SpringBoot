package io.practice.topic;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//business service 
@Service 
public class TopicService {

	//creates a list to later be converted to JSON format by Spring
	private java.util.List<Types> teams= new ArrayList<>( Arrays.asList(
				new Types("Braves","Atlanta Braves", "Baseball Team" ),
				new Types("Falcons","Atlanta Falcons", "Football Team" ),
				new Types("Hawks","Atlanta Hawks", "Basketball Team" ),
				new Types("Packers","Green Bay Packers", "Football Team" )
));
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
	//allows you to add a team
	public void addTeam(Types ty) {
		teams.add(ty);
		
	}


}

