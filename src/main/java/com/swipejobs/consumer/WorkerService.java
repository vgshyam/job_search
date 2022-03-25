package com.swipejobs.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.swipejobs.model.Job;
import com.swipejobs.model.Worker;

/**
 * @author shyam 25-Mar-2022 2:40:01 pm
 */

@Service
public class WorkerService {

	public List<Job> getWorkersDetail(Integer workerId) {

		List<Job> matchedJobs = new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		Worker wo = null;
		Worker[] data = restTemplate
				.exchange("https://test.swipejobs.com/api/workers", HttpMethod.GET, null, Worker[].class).getBody();

		for (Worker temp : data) {
			if (temp.getUserId() == workerId) {
				wo = temp;
				break;
			}
		}
		final Worker worker = wo;
		Job[] jobsArray = restTemplate
				.exchange("https://test.swipejobs.com/api/jobs", HttpMethod.GET, null, Job[].class).getBody();

		List<Job> jobs = Arrays.asList(jobsArray);

		for (Job job : jobs) {

			for (String certi : job.getRequiredCertificates()) {
				if (worker.getCertificates().contains(certi) && worker.getSkills().contains(job.getJobTitle())
						&& worker.getHasDriversLicense() == job.getDriverLicenseRequired()
						&& this.isWithinSearchLocation(job.getLocation(), worker.getJobSearchAddress()))
					matchedJobs.add(job);
			}
		}

		return matchedJobs.stream().limit(3).collect(Collectors.toList());
	}

	private boolean isWithinSearchLocation(Map<String, String> jobLocation, Map<String, String> workerPreferLocation) {

		float jobLongitude = Float.parseFloat(jobLocation.get("longitude"));
		float jobLatitude = Float.parseFloat(jobLocation.get("latitude"));
		float workerPreferLongitude = Float.parseFloat(workerPreferLocation.get("longitude"));
		float workerPreferLatitude = Float.parseFloat(workerPreferLocation.get("latitude"));
		int maxDiistance = Integer.parseInt(workerPreferLocation.get("maxJobDistance"));

		if (jobLongitude >= workerPreferLongitude - maxDiistance 
				&& jobLongitude <= workerPreferLongitude + maxDiistance
				&& jobLatitude >= workerPreferLatitude - maxDiistance
				&& jobLongitude <= workerPreferLatitude + maxDiistance) {
			return true;
		} else

		{
			return false;
		}
	}

}
