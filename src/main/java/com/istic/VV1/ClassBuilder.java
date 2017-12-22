package com.istic.VV1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;

import org.apache.commons.io.IOUtils;

import spoon.reflect.declaration.CtElement;
import spoon.support.reflect.declaration.CtClassImpl;
import spoon.support.reflect.declaration.CtInterfaceImpl;
import spoon.support.reflect.declaration.CtMethodImpl;
import spoon.support.reflect.declaration.CtPackageImpl;

public class ClassBuilder {
static String pathtosrc="/home/chak/Documents/VV/test/src/";

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//String p =pathtosrc+"src/CtElements.java";
//FileInputStream inputStream = null;
//String everything =null;
//try {
//inputStream = new FileInputStream(p);
//} catch (FileNotFoundException e) {
//// TODO Auto-generated catch block
//e.printStackTrace();
//}    
//try {
//	  everything = IOUtils.toString(inputStream);
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//System.out.println(everything);
//reset();
//build_filter(everything.split("\n"));
//build_classes(everything.split("\n"));
////build_x_filter(everything.split("\n"));
//}
static void build_x_filter( String [] ctelements) {
	PrintWriter writer = null ;
	String p =pathtosrc+"src/Filter2.java";

	try {
	writer=	new PrintWriter(p,
			"UTF-8");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	writer.println("/*");
	for(String s: ctelements) {
		if (s.startsWith("Ct")) {
writer.println(" if(nX instanceof X_"+s+") {");
writer.println("X_"+s+" n=(X_"+s+") nX;");
writer.println("return  ;");
writer.println("}");
		}
	}
	writer.println("*/");
writer.close();
}
	static void build_classes (String [] ctelements) {
for(String s: ctelements) {
	if (s.startsWith("Ct")) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(pathtosrc+"src/X_"+s+".java", "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		writer.println("import spoon.support.reflect.code."+s+";");
//		writer.println("import spoon.support.declaration.code."+s+";");
		writer.println("import spoon.support.reflect.code.*;");
		writer.println("import spoon.support.reflect.reference.*;");
		writer.println("import spoon.support.reflect.declaration.*;");
writer.println("import spoon.reflect.declaration.CtElement;");
		writer.println(" public class X_"+s+ " extends NODE{");
		writer.println(s+" i_element;");
		
		writer.println("public X_"+s+" (CtElement e, X_CtMethodImpl parent_method,X_CtConstructorImpl parent_constructor, X_CtClassImpl parent_class, X_CtInterfaceImpl parent_interface,X_CtPackageImpl parent_package, NODE  parent,String cls){");
		writer.println("this.i_element=( "+s+")  e;");
		writer.println("this.node_package= parent_package;\n" + 
				"this.node_class= parent_class;\n" + 
				"this.node_interface= parent_interface;\n" + 
				"this.node_method=parent_method;\n" + 
				"this.node_constructor=parent_constructor;\n" + 
				"this.parent=parent;\n" + 
				"this.node_name=cls;\n" +
				"super.i_element=e;\n"+
				"Class_X_Hydrator.hydrate(this);");
		
		writer.println("}");
		writer.println("}");
		writer.close();
}
	}
	}
	static void build_filter(String [] ctelements) {
		PrintWriter writer = null ;
		String p =pathtosrc+"src/X_.java";

		try {
		writer=	new PrintWriter(p,
				"UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.println("import spoon.reflect.declaration.CtElement;");
		writer.println("public class X_ {");
			writer.println("	static NODE create  ( CtElement e, X_CtMethodImpl parent_method,X_CtConstructorImpl parent_constructor, X_CtClassImpl parent_class, X_CtInterfaceImpl parent_interface,X_CtPackageImpl parent_package, NODE  parent ) { " );
			writer.println("if (e==null) return null;");
			writer.println("String cls=ClassUtil.getElementClass(e); ");
			for(String s: ctelements) {
				if (s.startsWith("Ct")) {
writer.println(" if( cls.compareTo(\""+s+"\")==0 ) {");

writer.println("return new "+"X_"+s+"(e, parent_method, parent_constructor, parent_class, parent_interface,"
		+ "parent_package, parent, cls);");
writer.println("}");
		}
			}
			
			writer.println(" System.out.println(\"unknown element\"); System.exit(0);return null;");
		writer.println("}");
		
		writer.println("}");
		writer.close();
	}
static void reset() {
	File dir = new File(pathtosrc+"src/");
	File[] filesList = dir.listFiles();
	String tmp="";
	for (File file : filesList) {
	    if (file.isFile()) {
	    	tmp= file.getName();
	    	int pos= tmp.indexOf(".java");
	    	if (pos>=0) {
	    	tmp= tmp.substring(0, pos);
//	    	if (tmp.compareTo(tmp.toUpperCase())==0) {
	    	if (tmp.startsWith("X_") ) {

	        System.out.println("deleting" +tmp);
file.delete();
}
	    	}else System.out.println(tmp +"not");
	    }
	}
}
}
