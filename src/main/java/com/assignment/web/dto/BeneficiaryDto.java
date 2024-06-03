/**
 * 
 */
package com.assignment.web.dto;

/**
 * 
 */
public class BeneficiaryDto {
	private String name;
    private String relationship;
    private int age;
    private String contactDetails;
    
    public BeneficiaryDto(){
	}
	
	public BeneficiaryDto(String name, String relationship, int age, String contactDetails) {
		super();
		this.name = name;
		this.relationship = relationship;
		this.age = age;
		this.contactDetails = contactDetails;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

}
