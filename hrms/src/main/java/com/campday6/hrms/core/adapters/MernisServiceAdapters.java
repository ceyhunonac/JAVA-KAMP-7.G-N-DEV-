package com.campday6.hrms.core.adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import com.campday6.hrms.entities.concretes.JobSeekers;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements MernisService{

	@Override
	public boolean checkIfRealPerson(JobSeekers jobSeekers) {
		 
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {result=proxy.TCKimlikNoDogrula(Long.parseLong(jobSeekers.getTrNu()), 
				jobSeekers.getFirstName().toUpperCase(new Locale("tr")),
				jobSeekers.getLastName().toUpperCase(new Locale("tr")),
				jobSeekers.getBirthYear());
		}catch(RemoteException e){
			e.printStackTrace();
		}		
		return result;
	}


}