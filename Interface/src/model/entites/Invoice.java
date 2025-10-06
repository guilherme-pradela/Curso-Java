package model.entites;

public class Invoice {
	
  private Double BasicPayment;
  private Double Tax;
  
  private Invoice() {
  }
  
  
  public Invoice(Double basicPayment, Double tax) {
	BasicPayment = basicPayment;
	Tax = tax;
}


public Double getBasicPayment() {
	return BasicPayment;
}


public void setBasicPayment(Double basicPayment) {
	BasicPayment = basicPayment;
}


public Double getTax() {
	return Tax;
}


public void setTax(Double tax) {
	Tax = tax;
}


public Double getTotalPayment() {
	  return getBasicPayment() + getTax();
  }
}
