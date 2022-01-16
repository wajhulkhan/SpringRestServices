package com.org.restservices;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.postmethod.PostData;
import com.org.postmethod.PostDataResponse;

@RestController
public class PostWebController {

	@RequestMapping(value = "/postdata", method=RequestMethod.POST)
	
	public PostDataResponse Test(@RequestBody PostData p) {
		PostDataResponse p1 = new  PostDataResponse();
		p1.setName("Hello "+p.getName());
		p1.setPhoneNo(p.getPhoneNo());
		p1.setProjectName("Working on project");
		
		return p1;
	}
}
