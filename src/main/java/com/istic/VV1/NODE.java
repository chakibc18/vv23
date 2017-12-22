package com.istic.VV1;

import java.util.ArrayList;

import spoon.reflect.declaration.CtElement;
import spoon.support.reflect.declaration.CtClassImpl;
import spoon.support.reflect.declaration.CtInterfaceImpl;
import spoon.support.reflect.declaration.CtMethodImpl;
import spoon.support.reflect.declaration.CtPackageImpl;

public class NODE {
	X_CtMethodImpl node_method;
	X_CtConstructorImpl node_constructor;
	X_CtClassImpl node_class;
	X_CtInterfaceImpl node_interface;
	X_CtPackageImpl node_package;
	X_CtPackageImpl node_root;
	
NODE parent;
MetaNode meta_parent;
public CtElement i_element;
ArrayList<NODE> children = new ArrayList<>();

public String node_name="";
 public int node_line_number=-1;
public String node_string="";
public String node_short_descr="";
public String node_src_code="";
public String node_file_src_code="";
public String node_representation="";
String path_npe_analysis="";
String resource_path="";



public void expand(MetaNode parent ) {
parent.changed=true;
	parent.WQNodes.remove(this);
parent.LQNodes.add(this);
}
}
 