package com.telstra.taxpack;

import com.telstra.emppack.Employee;
import com.telstra.emppack.Manager;
import com.telstra.emppack.Programmer;

public class Tax {
	
	public  double calc_Tax(Employee emp)
	{
		 double taxAmt=0.0;
		if (emp instanceof Manager)
		{
			Manager m=(Manager) emp;
		}
		else
			if (emp instanceof Programmer)
			{
				
			}
			else
			{
				
			}
		
		
		return taxAmt;
	}

}
