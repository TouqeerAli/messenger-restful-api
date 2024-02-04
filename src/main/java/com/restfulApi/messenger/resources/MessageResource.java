package com.restfulApi.messenger.resources;

import com.restfulApi.messenger.model.Message;
import com.restfulApi.messenger.service.MessageService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import java.util.ArrayList;


@Path("/messages")
public class MessageResource {
	MessageService messageService = new MessageService();
	
	
	@GET
	@Path("/getMessage")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	public Message getMesssage(@PathParam("messageId") long id) {
		return messageService.getMessage(id);
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message) {
		return messageService.addMessage(message);
	}
	
}
