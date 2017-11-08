package com.mathologic.projects.mongo.models;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mathologic.projects.models.SubRole;


/**
 * santosh
 */

@SuppressWarnings("unused")
@Document(collection = "Roles")
public class Role implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
    private String id;

    
    private String name;
    
    
   // private List<SubRole> subRoles=new LinkedList<SubRole>();
    
    @DBRef
    private List<User> users = new LinkedList<User>();
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//	public List<SubRole> getSubRoles() {
//		return subRoles;
//	}
//
//	public void setSubRoles(List<SubRole> subRoles) {
//		this.subRoles = subRoles;
//	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
