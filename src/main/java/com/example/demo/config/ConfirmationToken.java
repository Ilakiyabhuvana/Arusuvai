//package com.example.demo.config;
//
//import java.util.Date;
//
//import com.example.demo.entity.UserLogin;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Temporal;
//import jakarta.persistence.TemporalType;
//@Entity
//public class ConfirmationToken {
//	 private UserLogin user;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="token_id")
//    private Long tokenId;
//
//    @Column(name="confirmation_token")
//    private String confirmationToken;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdDate;
//
//	public ConfirmationToken(Long tokenId, String confirmationToken, Date createdDate) {
//		super();
//		this.tokenId = tokenId;
//		this.confirmationToken = confirmationToken;
//		this.createdDate = createdDate;
//	}
//
//	public ConfirmationToken(UserLogin user) {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Long getTokenId() {
//		return tokenId;
//	}
//
//	public void setTokenId(Long tokenId) {
//		this.tokenId = tokenId;
//	}
//
//	public String getConfirmationToken() {
//		return confirmationToken;
//	}
//
//	public void setConfirmationToken(String confirmationToken) {
//		this.confirmationToken = confirmationToken;
//	}
//
//	public Date getCreatedDate() {
//		return createdDate;
//	}
//
//	public void setCreatedDate(Date createdDate) {
//		this.createdDate = createdDate;
//	}
//
//	public UserLogin getUserEntity() {
//		// TODO Auto-generated method stub
//		return user;
//	}
//
//}
