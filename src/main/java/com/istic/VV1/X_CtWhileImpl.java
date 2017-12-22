import spoon.support.reflect.code.*;
import spoon.support.reflect.reference.*;
import spoon.support.reflect.declaration.*;
import spoon.reflect.declaration.CtElement;
 public class X_CtWhileImpl extends NODE{
CtWhileImpl i_element;
public NODE while_condition;
public NODE while_block;
public X_CtWhileImpl (CtElement e, X_CtMethodImpl parent_method,X_CtConstructorImpl parent_constructor, X_CtClassImpl parent_class, X_CtInterfaceImpl parent_interface,X_CtPackageImpl parent_package, NODE  parent,String cls){
this.i_element=( CtWhileImpl)  e;
this.node_package= parent_package;
this.node_class= parent_class;
this.node_interface= parent_interface;
this.node_method=parent_method;
this.node_constructor=parent_constructor;
this.parent=parent;
this.node_name=cls;
super.i_element=e;
}

}
