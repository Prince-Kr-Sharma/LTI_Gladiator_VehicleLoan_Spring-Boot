package com.lti.myproj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.myproj.model.BankDetails;
import com.lti.myproj.model.EmploymentDetails;
import com.lti.myproj.model.IdentityDetails;
import com.lti.myproj.model.PersonalDetails;
import com.lti.myproj.model.User;
import com.lti.myproj.model.VehicleDetails;
import com.lti.myproj.service.AdminService;
import com.lti.myproj.service.BankDetailsService;
import com.lti.myproj.service.EmploymentDetailsService;
import com.lti.myproj.service.IdentityDetailsService;
import com.lti.myproj.service.PersonalDetailsService;
import com.lti.myproj.service.RegistraionService;
import com.lti.myproj.service.VehicleDetailsService;


@RestController
@RequestMapping(value="/api") 
@CrossOrigin(origins = "http://localhost:4200")
public class mainController {
	
	
	@Autowired
	BankDetailsService bankService;
	
	@Autowired
	PersonalDetailsService personalDetailsService;
	
	@Autowired
	EmploymentDetailsService employmentDetailsService;
	
	@Autowired
	VehicleDetailsService vehicleDetailsService;
	
	@Autowired
	IdentityDetailsService identityDetailsService;
	
	//@Autowired
	//AdminService aservice;
	
	@Autowired
	private RegistraionService rservice;
	
	
	//@RequestMapping("/adminLogin")
	
	
	@PostMapping("/registeruser")
	public User registerUser(@RequestBody User user) throws Exception 
	{   
		String tempEmailId = user.getEmailId();
		int tempId = user.getId();
		if((tempEmailId!=null && !"".equals(tempEmailId)))
		{
		User userobj = rservice.fetchUserByEmailId(tempEmailId);
			if(userobj != null)
				throw new Exception("User with this "+ tempEmailId+"already exists");
			
			 
		}
		
		if(tempId != '\0')
		{
			User u = rservice.fetchUserById(tempId);
			if(u != null)
					throw new Exception("User with this "+ tempId+"already exists");
		}
		
		
		
		
		
		User userobj = null;
		rservice.saveUser(user);
		return userobj;
	}
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception
	{
		String tempEmailId = user.getEmailId();
		String tempPass=user.getPassword();
		User userObj =null;
		if(tempEmailId!=null && tempPass!=null )
		{
		userObj  = rservice.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
		}
		if(userObj==null)
		{
			throw new Exception("bad credentials");
		}
		return userObj;
	}


	@GetMapping("/bankdetails")
	public List<BankDetails> getAll()
	{
		return bankService.getBankDetails();
		
	}
					

	
	@PostMapping("/addbankdetails")
	public boolean addBankDetails(@RequestBody BankDetails bankdetails)
	{
		return bankService.addBankDetails(bankdetails);
	
	}
	
	@GetMapping("/personaldetails")
	public List<PersonalDetails> getAllPersonalDetails()
	{
		return personalDetailsService.getPersonalDetails();
		
	}
					

	
	@PostMapping("/addpersonaldetails")
	public boolean addPersonalDetails(@RequestBody PersonalDetails personalDetails)
	{
		return personalDetailsService.addPersonalDetails(personalDetails);
	
	}
	
	@GetMapping("/employmentdetails")
	public List<EmploymentDetails> getAllEmploymentDetails()
	{
		return employmentDetailsService.getEmploymentDetails();
		
	}
					

	
	@PostMapping("/addemploymentdetails")
	public boolean addEmploymentDetails(@RequestBody EmploymentDetails employmentDetails)
	{
		return employmentDetailsService.addEmploymentDetails(employmentDetails);
	
	}
	
	@GetMapping("/vehicledetails")
	public List<VehicleDetails> getAllVehicleDetails()
	{
		return vehicleDetailsService.getVehicleDetails();
		
	}
					

	
	@PostMapping("/addvehicledetails")
	public boolean addVehicleDetails(@RequestBody VehicleDetails vehicleDetails)
	{
		return vehicleDetailsService.addVehicleDetails(vehicleDetails);
	
	}
	
	@GetMapping("/identitydetails")
	public List<IdentityDetails> getAllIdentityDetails()
	{
		return identityDetailsService.getIdentityDetails();
		
	}
					

	
	@PostMapping("/addidentitydetails")
	public boolean addIdentityDetails(@RequestBody IdentityDetails identityDetails)
	{
		return identityDetailsService.addIdentityDetails(identityDetails);
	
	}

}
