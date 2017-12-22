package com.istic.VV1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

import spoon.reflect.declaration.CtElement;

public class ClassUtil {

static  String get_code_source (CtElement e) {
//	System.out.println(e.getShortRepresentation());
	return e.toString();
}
static int getLineNUmber(CtElement e) {
return e.getPosition().getLine();
}
static public String getElementClass(CtElement e) {
	String res= e.getShortRepresentation();
	int pos_at= res.lastIndexOf("@");
	int pos_pt= res.lastIndexOf(".");
	return res.substring(pos_pt+1, pos_at) ;
	
}
static int 		get_nb_classes(X_CtPackageImpl xpck) {
	int j=0;
	for (NODE x : xpck.children) {
	  if (x instanceof X_CtClassImpl) j++;
}return j;
}
static int get_nb_interfaces(X_CtPackageImpl xpck) {
	int j=0;
	for (NODE x : xpck.children) {
	  if (x instanceof X_CtInterfaceImpl) j++;
}
	return j;
}
static int get_nb_packages(X_CtPackageImpl xpck) {
	int j=0;
	for (NODE x : xpck.children) {
	  if (x instanceof X_CtPackageImpl) j++;
}
	return j;
}



 private static void get_file_src_code_(X_CtClassImpl c) {
	c.node_file_src_code= get_source_code_from_file(c.i_element.getQualifiedName(), c.parent.node_string, 
			c.node_root.path_npe_analysis);
}
 private  static void get_file_src_code_(X_CtInterfaceImpl c) {
	c.node_file_src_code= get_source_code_from_file(c.i_element.getQualifiedName(), c.parent.node_string ,
			c.node_root.path_npe_analysis );
}
static void split_classe_src_code ( X_CtClassImpl c) {
	get_file_src_code_(c);
	   String [] lines= c.node_file_src_code.split("\n");
	   for (String s : lines) {
			c.code_lines.add(s+"@@");
	   }
	  }
static void split_classe_src_code ( X_CtInterfaceImpl c) {
	get_file_src_code_(c);
	   String [] lines= c.node_file_src_code.split("\n");
	   for (String s : lines) {
			c.code_lines.add(s+"@@");
	   }
	  }
private static String get_source_code_from_file(String classe, String path,String root ) {
 
	classe= classe.replace(".", "/");
	classe=classe.substring(classe.indexOf("/"));
String p=root+classe+".java"; 
	 FileInputStream inputStream = null;
		String everything =null;
	try {
		inputStream = new FileInputStream(p);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}    
	    try {
			  everything = IOUtils.toString(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // do something with everything string
	return everything;
}


static void set_comment (NODE n, X_CtClassImpl c) {
	int ligne = n.node_line_number;
	String cmt= n.node_name;
	int l = ligne -1;
	if (l<0) return;
	String s = c.code_lines.get(l);
	s=s.substring(0, s.indexOf("@@"));
	s+="@@ "+cmt;
	c.code_lines.set(l,s);
}
static void add_comment (NODE n, X_CtClassImpl c) {
	int ligne = n.node_line_number;
	String cmt= n.node_name;
	if (n.children.size()==0 || n instanceof X_CtFieldImpl) {
		cmt+= "-"+n.node_src_code;
	}
//	System.out.println("at l "+ligne+" "+cmt+" in "+ c.node_simple_name);
	int l = ligne -1;
	if (l<0 || l>=c.code_lines.size()-1) {
//		System.out.println(n.node_name+" out of line");
//System.exit(0);	
return;
	}
	String s = c.code_lines.get(l);
	s+=" "+cmt;
	c.code_lines.set(l,s);
}
static String linearize_code_lines(X_CtClassImpl c) {
	String res="";
	for (String s : c.code_lines) {
		if (s.compareTo("@@")!=0)
		res+=s+"\n";
	}
	return res+"\n";
}

static void set_comment (NODE n, X_CtInterfaceImpl c) {
	int ligne = n.node_line_number;
	String cmt= n.node_name;
	int l = ligne -1;
	if (l<0) return;
	String s = c.code_lines.get(l);
	s=s.substring(0, s.indexOf("@@"));
	s+="@@ "+cmt;
	c.code_lines.set(l,s);
}
static void add_comment (NODE n, X_CtInterfaceImpl c) {
	int ligne = n.node_line_number;
	String cmt= n.node_name;
	if (n.children.size()==0 || n instanceof X_CtFieldImpl) {
		cmt+= "-"+n.node_src_code;
	}
//	System.out.println("at l "+ligne+" "+cmt+" in "+ c.node_simple_name);
	int l = ligne -1;
	if (l<0 || l>=c.code_lines.size()-1) {
//		System.out.println(n.node_name+" out of line");
return;
	}
	String s = c.code_lines.get(l);
	s+=" "+cmt;
	c.code_lines.set(l,s);
}
static String linearize_code_lines(X_CtInterfaceImpl c) {
	String res="";
	for (String s : c.code_lines) {
		if (s.compareTo("@@")!=0)
		res+=s+"\n";
	}
	return res+"\n";
}

 


}
