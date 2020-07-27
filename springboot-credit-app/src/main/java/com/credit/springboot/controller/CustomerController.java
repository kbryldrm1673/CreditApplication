package com.credit.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.credit.springboot.model.Contact;
import com.credit.springboot.model.Customer;
import com.credit.springboot.service.ContactService;
import com.credit.springboot.service.CustomerService;


@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private ContactService contactService;

	
	@GetMapping("/")
	public String getAllPersonalList(Model model) {
		
        model.addAttribute("customerInfo", customerService.getAllPersonalInfo());
		return "index";	
		//return findPaginated(1, model);
	}
	
	@GetMapping("/customerPersonalInformationForm")
	public String showNewCustomerPersonalInformationForm(Model model) {
		Customer customer=new Customer();
		model.addAttribute("customer", customer);
		return "customer_personal_form";		
	}
	
	@PostMapping("saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveCustomerPersonelInfo(customer);
		return "redirect:/";		
	}
	
	@GetMapping("/customerContactForm")
	public String showCustomerContactInformationForm(Model model) {
		Contact contact=new Contact();
		model.addAttribute("contact", contact);
		return "customer_contact_form";
	}
	
	
	@PostMapping("saveContact")
	public String saveContactInfo(@ModelAttribute("contact") Contact contact) {
		contactService.saveCustomerContactInfo(contact);
		return "redirect:/";
		
	}
	
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo,Model model) {
		int pageSize=3;
		
		Page<Customer> page= customerService.findPaginated(pageNo, pageSize);
		List<Customer> listCustomer = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		model.addAttribute("listCustomer",listCustomer);
		
		return "index";
		
	}
		
}
