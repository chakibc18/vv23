import spoon.support.reflect.code.*;
import spoon.support.reflect.reference.*;
import spoon.support.reflect.declaration.*;
import spoon.reflect.declaration.CtElement;
 public class X_CtMethodImpl extends NODE{
CtMethodImpl i_element;
public X_CtMethodImpl (CtElement e, X_CtMethodImpl parent_method,X_CtConstructorImpl parent_constructor, X_CtClassImpl parent_class, X_CtInterfaceImpl parent_interface,X_CtPackageImpl parent_package, NODE  parent,String cls){
this.i_element=( CtMethodImpl)  e;
this.node_package= parent_package;
this.node_class= parent_class;
this.node_interface= parent_interface;
this.node_method=parent_method;
this.node_constructor=parent_constructor;
this.parent=parent;
this.node_name=cls;
super.i_element=e;
}
 
public void expand( MetaNode parent) {
	// TODO Auto-generated method stub
	MetaNode mn = new MetaNode(parent);
	
	for (NODE n : this.children) {
		mn.WQNodes.add(n);
		n.meta_parent=mn;
	}
parent.WQNodes.remove(0);
for( NODE n : parent.WQNodes) {
mn.WQNodes.add(n);
}
parent.NQMetaNodes.add(mn);
parent.changed=true;
	}

}
