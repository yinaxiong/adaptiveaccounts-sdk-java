package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.aa.AccountIdentifierType;
import com.paypal.svcs.types.aa.NameType;
import com.paypal.svcs.types.aa.AddressType;
import com.paypal.svcs.types.aa.CardDateType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * This not considered when
 * financialProductCategory=PRE_PAID_CARD 
 */
public class AddPartnerFinancialProductRequest{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private AccountIdentifierType accountIdentifier;

	/**
	 * This not considered when
	 * financialProductCategory=PRE_PAID_CARD 	 
	 */ 
	private NameType nameOnCard;

	/**
	 * This not considered when
	 * financialProductCategory=PRE_PAID_CARD 	 
	 */ 
	private AddressType billingAddress;

	/**
	 * This not considered when
	 * financialProductCategory=PRE_PAID_CARD 	 
	 */ 
	private String cardOwnerDateOfBirth;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String cardNumber;

	/**
	 * Identify the kind of PayPal financial product. Possible
	 * value is : PRE_PAID_CARD 	  
	 *@Required	 
	 */ 
	private String financialProductCategory;

	/**
	 * expirationDate is mandatory when financialProductCategoy =
	 * PRE_PAID_CARD 	  
	 *@Required	 
	 */ 
	private CardDateType expirationDate;

	/**
	 * This not considered when
	 * financialProductCategory=PRE_PAID_CARD 	 
	 */ 
	private String cardVerificationNumber;

	/**
	 * This not considered when
	 * financialProductCategory=PRE_PAID_CARD 	 
	 */ 
	private CardDateType startDate;

	/**
	 * Up to 2 digit for Switch/Maestro cards. 	 
	 */ 
	private String issueNumber;

	

	/**
	 * Constructor with arguments
	 */
	public AddPartnerFinancialProductRequest (RequestEnvelope requestEnvelope, AccountIdentifierType accountIdentifier, String cardNumber, String financialProductCategory, CardDateType expirationDate){
		this.requestEnvelope = requestEnvelope;
		this.accountIdentifier = accountIdentifier;
		this.cardNumber = cardNumber;
		this.financialProductCategory = financialProductCategory;
		this.expirationDate = expirationDate;
	}	

	/**
	 * Default Constructor
	 */
	public AddPartnerFinancialProductRequest (){
	}	

	/**
	 * Getter for requestEnvelope
	 */
	 public RequestEnvelope getRequestEnvelope() {
	 	return requestEnvelope;
	 }
	 
	/**
	 * Setter for requestEnvelope
	 */
	 public void setRequestEnvelope(RequestEnvelope requestEnvelope) {
	 	this.requestEnvelope = requestEnvelope;
	 }
	 
	/**
	 * Getter for accountIdentifier
	 */
	 public AccountIdentifierType getAccountIdentifier() {
	 	return accountIdentifier;
	 }
	 
	/**
	 * Setter for accountIdentifier
	 */
	 public void setAccountIdentifier(AccountIdentifierType accountIdentifier) {
	 	this.accountIdentifier = accountIdentifier;
	 }
	 
	/**
	 * Getter for nameOnCard
	 */
	 public NameType getNameOnCard() {
	 	return nameOnCard;
	 }
	 
	/**
	 * Setter for nameOnCard
	 */
	 public void setNameOnCard(NameType nameOnCard) {
	 	this.nameOnCard = nameOnCard;
	 }
	 
	/**
	 * Getter for billingAddress
	 */
	 public AddressType getBillingAddress() {
	 	return billingAddress;
	 }
	 
	/**
	 * Setter for billingAddress
	 */
	 public void setBillingAddress(AddressType billingAddress) {
	 	this.billingAddress = billingAddress;
	 }
	 
	/**
	 * Getter for cardOwnerDateOfBirth
	 */
	 public String getCardOwnerDateOfBirth() {
	 	return cardOwnerDateOfBirth;
	 }
	 
	/**
	 * Setter for cardOwnerDateOfBirth
	 */
	 public void setCardOwnerDateOfBirth(String cardOwnerDateOfBirth) {
	 	this.cardOwnerDateOfBirth = cardOwnerDateOfBirth;
	 }
	 
	/**
	 * Getter for cardNumber
	 */
	 public String getCardNumber() {
	 	return cardNumber;
	 }
	 
	/**
	 * Setter for cardNumber
	 */
	 public void setCardNumber(String cardNumber) {
	 	this.cardNumber = cardNumber;
	 }
	 
	/**
	 * Getter for financialProductCategory
	 */
	 public String getFinancialProductCategory() {
	 	return financialProductCategory;
	 }
	 
	/**
	 * Setter for financialProductCategory
	 */
	 public void setFinancialProductCategory(String financialProductCategory) {
	 	this.financialProductCategory = financialProductCategory;
	 }
	 
	/**
	 * Getter for expirationDate
	 */
	 public CardDateType getExpirationDate() {
	 	return expirationDate;
	 }
	 
	/**
	 * Setter for expirationDate
	 */
	 public void setExpirationDate(CardDateType expirationDate) {
	 	this.expirationDate = expirationDate;
	 }
	 
	/**
	 * Getter for cardVerificationNumber
	 */
	 public String getCardVerificationNumber() {
	 	return cardVerificationNumber;
	 }
	 
	/**
	 * Setter for cardVerificationNumber
	 */
	 public void setCardVerificationNumber(String cardVerificationNumber) {
	 	this.cardVerificationNumber = cardVerificationNumber;
	 }
	 
	/**
	 * Getter for startDate
	 */
	 public CardDateType getStartDate() {
	 	return startDate;
	 }
	 
	/**
	 * Setter for startDate
	 */
	 public void setStartDate(CardDateType startDate) {
	 	this.startDate = startDate;
	 }
	 
	/**
	 * Getter for issueNumber
	 */
	 public String getIssueNumber() {
	 	return issueNumber;
	 }
	 
	/**
	 * Setter for issueNumber
	 */
	 public void setIssueNumber(String issueNumber) {
	 	this.issueNumber = issueNumber;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.requestEnvelope != null) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(this.requestEnvelope.toNVPString(newPrefix));
		}
		if (this.accountIdentifier != null) {
			String newPrefix = prefix + "accountIdentifier.";
			sb.append(this.accountIdentifier.toNVPString(newPrefix));
		}
		if (this.nameOnCard != null) {
			String newPrefix = prefix + "nameOnCard.";
			sb.append(this.nameOnCard.toNVPString(newPrefix));
		}
		if (this.billingAddress != null) {
			String newPrefix = prefix + "billingAddress.";
			sb.append(this.billingAddress.toNVPString(newPrefix));
		}
		if (this.cardOwnerDateOfBirth != null) {
			sb.append(prefix).append("cardOwnerDateOfBirth=").append(NVPUtil.encodeUrl(this.cardOwnerDateOfBirth));
			sb.append("&");
		}
		if (this.cardNumber != null) {
			sb.append(prefix).append("cardNumber=").append(NVPUtil.encodeUrl(this.cardNumber));
			sb.append("&");
		}
		if (this.financialProductCategory != null) {
			sb.append(prefix).append("financialProductCategory=").append(NVPUtil.encodeUrl(this.financialProductCategory));
			sb.append("&");
		}
		if (this.expirationDate != null) {
			String newPrefix = prefix + "expirationDate.";
			sb.append(this.expirationDate.toNVPString(newPrefix));
		}
		if (this.cardVerificationNumber != null) {
			sb.append(prefix).append("cardVerificationNumber=").append(NVPUtil.encodeUrl(this.cardVerificationNumber));
			sb.append("&");
		}
		if (this.startDate != null) {
			String newPrefix = prefix + "startDate.";
			sb.append(this.startDate.toNVPString(newPrefix));
		}
		if (this.issueNumber != null) {
			sb.append(prefix).append("issueNumber=").append(NVPUtil.encodeUrl(this.issueNumber));
			sb.append("&");
		}
		return sb.toString();
	}

}