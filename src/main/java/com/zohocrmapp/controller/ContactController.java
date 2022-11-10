package com.zohocrmapp.controller;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zohocrmapp.entity.Contact;
import com.zohocrmapp.services.ContactService;

@Controller
public class ContactController {

private ContactService contactService;
	
public ContactController(ContactService contactService) {
	
	this.contactService = contactService;
}

@RequestMapping("/listallcontacts")
public String listAllLeads(Model model) {
	
	List<Contact> contacts=contactService.getAllContacts();
	
	model.addAttribute("contacts",contacts);
	return "list_contacts";
}


	









}