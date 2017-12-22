package com.istic.VV1;

import java.util.ArrayList;
import java.util.Set;

import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;

//detect and return all packages
public class _PackageProcessor extends AbstractProcessor<CtPackage> {
    ArrayList<CtPackage> proc_elements;
  public _PackageProcessor(  ArrayList<CtPackage> liste) {
	proc_elements= liste;	
}
	public void process(CtPackage arg0) {
		if (arg0.getQualifiedName().compareTo("")!=0) {
		proc_elements.add(arg0);
 		}
 }
	@Override
	public void processingDone() {

 	}
}
