package com.vikas.test.mavenaws.api.model.request;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vikas.test.mavenaws.api.model.constant.CustomerType;

import io.swagger.annotations.ApiModelProperty;

/**
 * UserSignupRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-05T17:29:07.890+05:30[Asia/Calcutta]")

public class UserSignupRequest {
	@JsonProperty("customer")
	private String customer;

	@JsonProperty("username")
	private String username;

	@JsonProperty("password")
	private String password;

	@JsonProperty("email")
	private String email;

	@JsonProperty("contactnumber")
	private String contactnumber;

	@JsonProperty("address")
	private String address;

	@JsonProperty("UserType")
	private CustomerType userType = null;

	public UserSignupRequest customer(String customer) {
		this.customer = customer;
		return this;
	}

	/**
	 * Get customer
	 * 
	 * @return customer
	 */
	@ApiModelProperty(value = "")

	@Size(min = 1, max = 50)
	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public UserSignupRequest username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get username
	 * 
	 * @return username
	 */
	@ApiModelProperty(value = "")

	@Size(min = 1, max = 50)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserSignupRequest password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get password
	 * 
	 * @return password
	 */
	@ApiModelProperty(value = "")

	@Size(min = 1, max = 50)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserSignupRequest email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Get email
	 * 
	 * @return email
	 */
	@ApiModelProperty(value = "")

	@Size(min = 1, max = 50)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserSignupRequest contactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
		return this;
	}

	/**
	 * Get contactnumber
	 * 
	 * @return contactnumber
	 */
	@ApiModelProperty(value = "")

	@Size(min = 1, max = 50)
	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public UserSignupRequest address(String address) {
		this.address = address;
		return this;
	}

	/**
	 * Get address
	 * 
	 * @return address
	 */
	@ApiModelProperty(value = "")

	@Size(min = 1, max = 255)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public UserSignupRequest userType(CustomerType userType) {
		this.userType = userType;
		return this;
	}

	/**
	 * Get userType
	 * 
	 * @return userType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public CustomerType getUserType() {
		return userType;
	}

	public void setUserType(CustomerType userType) {
		this.userType = userType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UserSignupRequest userSignupRequest = (UserSignupRequest) o;
		return Objects.equals(this.customer, userSignupRequest.customer)
				&& Objects.equals(this.username, userSignupRequest.username)
				&& Objects.equals(this.password, userSignupRequest.password)
				&& Objects.equals(this.email, userSignupRequest.email)
				&& Objects.equals(this.contactnumber, userSignupRequest.contactnumber)
				&& Objects.equals(this.address, userSignupRequest.address)
				&& Objects.equals(this.userType, userSignupRequest.userType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer, username, password, email, contactnumber, address, userType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UserSignupRequest {\n");

		sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    contactnumber: ").append(toIndentedString(contactnumber)).append("\n");
		sb.append("    address: ").append(toIndentedString(address)).append("\n");
		sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
