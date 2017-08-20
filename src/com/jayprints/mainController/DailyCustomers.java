package com.jayprints.mainController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jayprints.dao.CustDao;
import com.jayprints.dbEntity.Customer;

@Controller
@RequestMapping("/dailyCustomerInfo")

public class DailyCustomers {

	@Autowired
	private CustDao custDao;
	
	@RequestMapping("/listOfCustomer")
	public String listOfCustomer(Model md){
		
		List<Customer> lstOfCustomer = custDao.getCustomerDetails();
		
		md.addAttribute("customers",lstOfCustomer);
		
		return "listOfCustomer";
	}
}
