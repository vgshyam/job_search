package com.swipejobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swipejobs.consumer.WorkerService;
import com.swipejobs.model.Job;

/**
 * @author shyam 25-Mar-2022 2:37:25 pm
 */

@RestController
@RequestMapping("/api")
public class SearchJobController {

	@Autowired
	WorkerService workerService;

	@GetMapping("/match/{workerId}")
	public List<Job> bestMatchJobs(@PathVariable Integer workerId) {

		return workerService.getWorkersDetail(workerId);
	}
}
