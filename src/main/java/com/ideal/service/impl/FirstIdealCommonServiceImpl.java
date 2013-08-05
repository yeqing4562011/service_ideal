package com.ideal.service.impl;

import com.ideal.common.service.interf.IFirstIdealCommonService;
import com.ideal.common.service.interf.RMIObject;

/**
 * @ClassName: FirstIdealCommonImpl
 * @Description: TODO
 * @author yq
 * @date 2013年8月4日 下午9:29:50
 * 
 */

public class FirstIdealCommonServiceImpl implements IFirstIdealCommonService{
	
	public String firstHessianServicesRMI() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This first rmi to service by hessian.");
		return null;
	}

	/* (非 Javadoc) 
	* <p>Title: rmiObject</p> 
	* <p>Description: </p> 
	* @param rmiObject
	* @return
	* @throws Exception 
	* @see com.ideal.common.service.interf.IFirstIdealCommonService#rmiObject(com.ideal.common.service.interf.RMIObject) 
	*/ 
	
	
	public RMIObject rmiObject(RMIObject rmiObject) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(rmiObject.getName());
		RMIObject object = new RMIObject();
		object.setName("web");
		return object;
	}

}
