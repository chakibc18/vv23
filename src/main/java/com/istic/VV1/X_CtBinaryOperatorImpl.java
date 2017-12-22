import spoon.support.reflect.code.*;
import spoon.support.reflect.reference.*;
import spoon.support.reflect.declaration.*;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.declaration.CtElement;
 public class X_CtBinaryOperatorImpl extends NODE{
CtBinaryOperatorImpl i_element;
public BinaryOperatorKind op_type;
public X_CtBinaryOperatorImpl (CtElement e, X_CtMethodImpl parent_method,X_CtConstructorImpl parent_constructor, X_CtClassImpl parent_class, X_CtInterfaceImpl parent_interface,X_CtPackageImpl parent_package, NODE  parent,String cls){
this.i_element=( CtBinaryOperatorImpl)  e;
this.node_package= parent_package;
this.node_class= parent_class;
this.node_interface= parent_interface;
this.node_method=parent_method;
this.node_constructor=parent_constructor;
this.parent=parent;
this.node_name=cls;
super.i_element=e;
Class_X_Hydrator.hydrate(this);
}
}
