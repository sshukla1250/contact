package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	//fake list of contacts
	List<Contact>list=List.of(
			new Contact(1L,"vinay@gmail.com","vinay",1211L),
			new Contact(2L,"raj@gmail.com","raj",1212L),
			new Contact(3L,"shiva@gmail.com","shiva",1214L),
			new Contact(6L,"ashish@gmail.com","ashish",1211L),
			new Contact(7L,"ashutosh@gmail.com","ashutosh",1212L),
			new Contact(8L,"rana@gmail.com","rana",1214L)
			);
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
