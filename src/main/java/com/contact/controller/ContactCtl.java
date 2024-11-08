package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.contact.entity.Contact;
import com.contact.service.ContactService;
	@RestController
	@RequestMapping("/contact")
	public class ContactCtl {
		@Autowired
		private ContactService contactService;
		@GetMapping("/user/{userId}")
		public List<Contact> getName(@PathVariable("userId") Long userId) {
			return this.contactService.getContactsOfUser(userId);
		}
		@GetMapping("/user")
		public String getMessage(@RequestParam("message") String message) {
			return "Hello "+message;
		}

}
