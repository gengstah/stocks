package org.cognoscenti.stocks.web;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.inject.Inject;

import org.springframework.scheduling.support.CronSequenceGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/schedule")
public class CronJobsController {
	
	@Inject
	private DateFormat schedulesDateFormat;
	
	public CronJobsController() { }
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(date.getTime());
		Date nextSchedule = new CronSequenceGenerator("0/10 * 9-11,13-14 ? * MON-FRI", TimeZone.getTimeZone("Asia/Singapore")).next(cal.getTime());
		model.addAttribute("marketSnapshotNextSchedule", schedulesDateFormat.format(nextSchedule) + ":00");
		
		return "schedule";
	}
	
}