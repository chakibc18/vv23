import spoon.support.reflect.code.*;
import spoon.support.reflect.reference.*;
import spoon.support.reflect.declaration.*;

import java.util.ArrayList;

import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;
 public class X_CtClassImpl extends NODE{
CtClassImpl i_element;
public CtTypeReference super_class;
public String node_simple_name;
ArrayList<String> code_lines = new ArrayList<>();
public X_CtClassImpl (CtElement e, X_CtMethodImpl parent_method,X_CtConstructorImpl parent_constructor, X_CtClassImpl parent_class, X_CtInterfaceImpl parent_interface,X_CtPackageImpl parent_package, NODE  parent,String cls){
this.i_element=( CtClassImpl)  e;
this.node_package= parent_package;
this.node_class= parent_class;
this.node_interface= parent_interface;
this.node_method=parent_method;
this.node_constructor=parent_constructor;
this.parent=parent;
this.node_name=cls;
super.i_element=e;
this.resource_path=this.i_element.getQualifiedName();
Class_X_Hydrator.hydrate(this);
}
 public void add_comment(String string, int node_line_number) {
	int ligne = node_line_number;
	String cmt= string;
	int l = ligne -1;
	if (l<0 || l>this.code_lines.size()-1) {
return;
	}
	String s = this.code_lines.get(l);
	s+=" "+cmt;
	this.code_lines.set(l,s);	
}
public void set_comment(String string, int node_line_number) {
	int ligne = node_line_number;
	String cmt=string;
	int l = ligne -1;
	if (l<0 || l>this.code_lines.size()-1) {
		return;
			}
	String s = this.code_lines.get(l);
	s=s.substring(0, s.indexOf("@@"));
	s+="@@ "+cmt;
	this.code_lines.set(l,s);	
}
public void reset_comment() {
	for (int i=1; i< this.code_lines.size();i++) {
		set_comment("", i);
	}
}
public String toString() {
	String res="";
	for (String s : this.code_lines) {
		if (s.compareTo("@@")!=0)
		res+=s+"\n";
	}
	return res+"\n";
}
}
