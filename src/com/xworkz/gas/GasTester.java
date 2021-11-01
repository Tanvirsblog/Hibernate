package com.xworkz.gas;

import com.xworkz.gas.dao.GasCylinderDAOImpl;
import com.xworkz.gas.entity.GasCylinderEntity;

public class GasTester {
  public static void main(String[] args) {
	GasCylinderDAOImpl gasCylinderDAOImpl = new GasCylinderDAOImpl();
	
	//gasCylinderDAOImpl.saveGasCylinderEntity();
	
	//gasCylinderDAOImpl.getGasCylinderEntity();
	
	//gasCylinderDAOImpl.updateGasCylinderEntity();
	
	gasCylinderDAOImpl.deleteGasCylinderEntity();
}
	
}

