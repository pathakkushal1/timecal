package com.bbd.timespend.hourcalculator.resource;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.bbd.timespend.hourcalculator.model.Emp;

@RestController
@RequestMapping("/time/update")
public class HoursResource {

	@PostMapping("/TimeCal")
	public String getLeaveTime(@RequestBody final Emp emp) {
		emp.calLdateAfterLunch();
		System.out.println("Emp : "+emp);
		return "You Can leave by "+emp.getLdate()+" PM";
	}
	
	@PostMapping("/lunchTime")
	public String getLeaveTimeAfterLunch(@RequestBody final Emp emp) {
		emp.calLdateAfterLunch();
		System.out.println("Emp : "+emp);
		return emp.getLdate();
	}
	@GetMapping("/start")
	public String sayHello() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
		        .getRequest();

		String ip = request.getRemoteAddr();
		System.out.println("We have on user now "+ip);
		return "Hello Emp";
	}
}
