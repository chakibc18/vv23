package com.istic.VV1;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;

import spoon.Launcher;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.support.reflect.declaration.CtPackageImpl;

public class  PackageAnalysis{
	String path="";
	X_CtPackageImpl xpackage ;
	
 
	public  PackageAnalysis(String path) {
		this.path=path;
	    Launcher launcher = new Launcher();
	    launcher.getEnvironment().setAutoImports(true);
	    launcher.getEnvironment().setNoClasspath(true);
	    File inDir = new File(path);
	String p= inDir.getPath();
	    launcher.addInputResource(p);
	    launcher.buildModel();
		ArrayList<CtPackage> packages = new ArrayList<>();
		_PackageProcessor proc2= new _PackageProcessor(packages);
	    launcher.addProcessor(proc2);
	    launcher.process();
	 
	    //le package racine est le dernier de la liste retournée par _PackageProcessor :-/
 CtPackage rootpck= packages.get(packages.size()-1);
 xpackage = (X_CtPackageImpl) X_.create(rootpck, null,null,null,null,null,null);
 xpackage.path_npe_analysis=this.path;
 
	 //PHASE 0
	Class_X_Hydrator.hydrate_x(xpackage, xpackage);
	Class_X_RepresentationFiller.representation_x(xpackage);
	//PHASE 1 
	Class_X_RepresentationPrinter.print_x(xpackage);
	//PHASE 2		
//			L_Linearizer.scan_for_main (xpackage, L_Linearizer.meth_main_list);
//			for (X_CtMethodImpl m : L_Linearizer.meth_main_list) {
//				new L_Linearizer(m);
//			}
	M_Linearizer.scan_for_main (xpackage, M_Linearizer.meth_main_list);
	
	for (X_CtMethodImpl m : M_Linearizer.meth_main_list) {
		new M_Linearizer(m);
 	}
	}
	
	
	public static void main(String[] args) {
		PackageAnalysis a = new PackageAnalysis("/home/chak/Documents/VV/NPE/");

	}
	
}
