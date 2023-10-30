package com.app.core;

public enum ServicePlan {
   SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	
	private double ServiceCharges;

	private ServicePlan(double serviceCharges) {
		ServiceCharges = serviceCharges;
	}

	public double getServiceCharges() {
		return ServiceCharges;
	}

	public void setServiceCharges(double serviceCharges) {
		ServiceCharges = serviceCharges;
	}
   @Override
   public String toString()
   {
	   return "Service Charges are: "+ServiceCharges;
   }


	
	 
	
}
