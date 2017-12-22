import spoon.reflect.declaration.CtElement;
public class X_ {
	static NODE create_fast  ( CtElement e, NODE  parent ) { 
return create(e, parent.node_method, parent.node_constructor,parent.node_class, parent.node_interface,
		parent.node_package, parent);
	}
	
	static NODE create  ( CtElement e, X_CtMethodImpl parent_method,X_CtConstructorImpl parent_constructor, X_CtClassImpl parent_class, X_CtInterfaceImpl parent_interface,X_CtPackageImpl parent_package, NODE  parent ) { 
if (e==null) return new X_NONE();
String cls=ClassUtil.getElementClass(e); 
 if( cls.compareTo("CtArrayAccessImpl")==0 ) {
return new X_CtArrayAccessImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtArrayReadImpl")==0 ) {
return new X_CtArrayReadImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtArrayTypeReferenceImpl")==0 ) {
return new X_CtArrayTypeReferenceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtArrayWriteImpl")==0 ) {
return new X_CtArrayWriteImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtAssertImpl")==0 ) {
return new X_CtAssertImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtAssignmentImpl")==0 ) {
return new X_CtAssignmentImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtBinaryOperatorImpl")==0 ) {
return new X_CtBinaryOperatorImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtBlockImpl")==0 ) {
return new X_CtBlockImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtBreakImpl")==0 ) {
return new X_CtBreakImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtCaseImpl")==0 ) {
return new X_CtCaseImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtCatchImpl")==0 ) {
return new X_CtCatchImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtCatchVariableImpl")==0 ) {
return new X_CtCatchVariableImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtCatchVariableReferenceImpl")==0 ) {
return new X_CtCatchVariableReferenceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtClassImpl")==0 ) {
return new X_CtClassImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtCodeElementImpl")==0 ) {
return new X_CtCodeElementImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtCodeSnippetExpressionImpl")==0 ) {
return new X_CtCodeSnippetExpressionImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtCodeSnippetStatementImpl")==0 ) {
return new X_CtCodeSnippetStatementImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtCommentImpl")==0 ) {
return new X_CtCommentImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtConditionalImpl")==0 ) {
return new X_CtConditionalImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtConstructorCallImpl")==0 ) {
return new X_CtConstructorCallImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtConstructorImpl")==0 ) {
return new X_CtConstructorImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtContinueImpl")==0 ) {
return new X_CtContinueImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtDoImpl")==0 ) {
return new X_CtDoImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtElementImpl")==0 ) {
return new X_CtElementImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtEnumImpl")==0 ) {
return new X_CtEnumImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtEnumValueImpl")==0 ) {
return new X_CtEnumValueImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtExecutableImpl")==0 ) {
return new X_CtExecutableImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtExecutableReferenceExpressionImpl")==0 ) {
return new X_CtExecutableReferenceExpressionImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtExecutableReferenceImpl")==0 ) {
return new X_CtExecutableReferenceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtExpressionImpl")==0 ) {
return new X_CtExpressionImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtFieldAccessImpl")==0 ) {
return new X_CtFieldAccessImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtFieldImpl")==0 ) {
return new X_CtFieldImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtFieldReadImpl")==0 ) {
return new X_CtFieldReadImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtFieldReferenceImpl")==0 ) {
return new X_CtFieldReferenceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtFieldWriteImpl")==0 ) {
return new X_CtFieldWriteImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtForEachImpl")==0 ) {
return new X_CtForEachImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtForImpl")==0 ) {
return new X_CtForImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtIfImpl")==0 ) {
return new X_CtIfImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtInterfaceImpl")==0 ) {
return new X_CtInterfaceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtIntersectionTypeReferenceImpl")==0 ) {
return new X_CtIntersectionTypeReferenceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtInvocationImpl")==0 ) {
return new X_CtInvocationImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtJavaDocImpl")==0 ) {
return new X_CtJavaDocImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtJavaDocTagImpl")==0 ) {
return new X_CtJavaDocTagImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtLambdaImpl")==0 ) {
return new X_CtLambdaImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtLiteralImpl")==0 ) {
return new X_CtLiteralImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtLocalVariableImpl")==0 ) {
return new X_CtLocalVariableImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtLocalVariableReferenceImpl")==0 ) {
return new X_CtLocalVariableReferenceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtLoopImpl")==0 ) {
return new X_CtLoopImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtMethodImpl")==0 ) {
return new X_CtMethodImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtNamedElementImpl")==0 ) {
return new X_CtNamedElementImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtNewArrayImpl")==0 ) {
return new X_CtNewArrayImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtNewClassImpl")==0 ) {
return new X_CtNewClassImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtOperatorAssignmentImpl")==0 ) {
return new X_CtOperatorAssignmentImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtPackageImpl")==0 ) {
return new X_CtPackageImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtPackageReferenceImpl")==0 ) {
return new X_CtPackageReferenceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtParameterImpl")==0 ) {
return new X_CtParameterImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtParameterReferenceImpl")==0 ) {
return new X_CtParameterReferenceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtReferenceImpl")==0 ) {
return new X_CtReferenceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtReturnImpl")==0 ) {
return new X_CtReturnImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtStatementImpl")==0 ) {
return new X_CtStatementImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtStatementListImpl")==0 ) {
return new X_CtStatementListImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtSuperAccessImpl")==0 ) {
return new X_CtSuperAccessImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtSwitchImpl")==0 ) {
return new X_CtSwitchImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtSynchronizedImpl")==0 ) {
return new X_CtSynchronizedImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtTargetedExpressionImpl")==0 ) {
return new X_CtTargetedExpressionImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtThisAccessImpl")==0 ) {
return new X_CtThisAccessImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtThrowImpl")==0 ) {
return new X_CtThrowImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtTryImpl")==0 ) {
return new X_CtTryImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtTryWithResourceImpl")==0 ) {
return new X_CtTryWithResourceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtTypeAccessImpl")==0 ) {
return new X_CtTypeAccessImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtTypeImpl")==0 ) {
return new X_CtTypeImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtTypeParameterImpl")==0 ) {
return new X_CtTypeParameterImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtTypeParameterReferenceImpl")==0 ) {
return new X_CtTypeParameterReferenceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtTypeReferenceImpl")==0 ) {
return new X_CtTypeReferenceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtUnaryOperatorImpl")==0 ) {
return new X_CtUnaryOperatorImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtUnboundVariableReferenceImpl")==0 ) {
return new X_CtUnboundVariableReferenceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtVariableAccessImpl")==0 ) {
return new X_CtVariableAccessImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtVariableReadImpl")==0 ) {
return new X_CtVariableReadImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtVariableReferenceImpl")==0 ) {
return new X_CtVariableReferenceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtVariableWriteImpl")==0 ) {
return new X_CtVariableWriteImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtWhileImpl")==0 ) {
return new X_CtWhileImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 if( cls.compareTo("CtWildcardReferenceImpl")==0 ) {
return new X_CtWildcardReferenceImpl(e, parent_method, parent_constructor, parent_class, parent_interface,parent_package, parent, cls);
}
 System.out.println("unknown element"); System.exit(0);return null;
}
}
