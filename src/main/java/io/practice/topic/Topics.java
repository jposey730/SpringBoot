package io.practice.topic;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Topics {
	
	@Autowired 
	private TopicService ts;
	
	//return all teams in JSON format
	@RequestMapping(method=RequestMethod.GET, value="/teams")
	public java.util.List<Types> getTopic() {
		return ts.getTopiclist();
	}
	//binds the /teams + the team name to the URL
	@RequestMapping("/teams/{id}")
	public Types getTopic(@PathVariable String id) {
		return ts.getTopic(id);
	}
//	@RequestMapping("/topics/{name}")
//	public Types getTopic1(@PathVariable String name) {
//		return ts.getTopic1(name);
//	}
//	@RequestMapping("/topics/{description}")
//	public Types getTopic2(@PathVariable String description) {
//		return ts.getTopic2(description);
//	}
	@RequestMapping(method=RequestMethod.POST, value="/teams")
	public void addTopic(@RequestBody Types ty) {
		ts.addTeam(ty);
		
		
	}
	
}
