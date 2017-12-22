package com.istic.VV1;

import java.util.Set;

import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class Class_X_RepresentationFiller {
	 
	static void representation_x (NODE entry) {
		  if (entry ==null) return ;

		representation_switch(entry);
//			entry.node_representation="ROOT FOLDER " +entry.path_npe_analysis ;
		   for (NODE x : entry.children)
			   Class_X_RepresentationFiller.representation_x(x) ;

	}
	  static void representation_switch(NODE nX) {
		  String res="";
		  if(nX instanceof X_CtPackageImpl) {
				 X_CtPackageImpl n=(X_CtPackageImpl) nX;
					res=n.node_string+"->"+ClassUtil.get_nb_classes((X_CtPackageImpl) n)+" classes and";
					res+=" "+ClassUtil.get_nb_interfaces((X_CtPackageImpl) n)+" interfaces"+
					" "+ClassUtil.get_nb_packages(n)+" sub packages";
					n.node_representation=res;
				 return  ;
		  }
		  if(nX instanceof X_CtClassImpl) {
			  X_CtClassImpl n=(X_CtClassImpl) nX;
			  ClassUtil.split_classe_src_code(n);
			  return  ;
			  }
		  if(nX instanceof X_CtInterfaceImpl) {
			  X_CtInterfaceImpl n=(X_CtInterfaceImpl) nX;
			  ClassUtil.split_classe_src_code(n);
			  return  ;
			  }
if (nX.node_class != null) {
		 ClassUtil.add_comment(nX, nX.node_class);
		  return;
}
if (nX.node_interface != null) {
	 ClassUtil.add_comment(nX, nX.node_interface);
	  return;
}
		  if(nX instanceof X_CtArrayAccessImpl) {
			  X_CtArrayAccessImpl n=(X_CtArrayAccessImpl) nX;
			  }
			   if(nX instanceof X_CtArrayReadImpl) {
			  X_CtArrayReadImpl n=(X_CtArrayReadImpl) nX;
			  }
			   if(nX instanceof X_CtArrayTypeReferenceImpl) {
			  X_CtArrayTypeReferenceImpl n=(X_CtArrayTypeReferenceImpl) nX;
			  }
			   if(nX instanceof X_CtArrayWriteImpl) {
			  X_CtArrayWriteImpl n=(X_CtArrayWriteImpl) nX;
			  }
			   if(nX instanceof X_CtAssertImpl) {
			  X_CtAssertImpl n=(X_CtAssertImpl) nX;
			  }
			   if(nX instanceof X_CtAssignmentImpl) {
			  X_CtAssignmentImpl n=(X_CtAssignmentImpl) nX;
			  }
			   if(nX instanceof X_CtBinaryOperatorImpl) {
			  X_CtBinaryOperatorImpl n=(X_CtBinaryOperatorImpl) nX;
			  }
			   if(nX instanceof X_CtBlockImpl) {
			  X_CtBlockImpl n=(X_CtBlockImpl) nX;
			  }
			   if(nX instanceof X_CtBreakImpl) {
			  X_CtBreakImpl n=(X_CtBreakImpl) nX;
			  }
			   if(nX instanceof X_CtCaseImpl) {
			  X_CtCaseImpl n=(X_CtCaseImpl) nX;
			  }
			   if(nX instanceof X_CtCatchImpl) {
			  X_CtCatchImpl n=(X_CtCatchImpl) nX;
			  }
			   if(nX instanceof X_CtCatchVariableImpl) {
			  X_CtCatchVariableImpl n=(X_CtCatchVariableImpl) nX;
			  }
			   if(nX instanceof X_CtCatchVariableReferenceImpl) {
			  X_CtCatchVariableReferenceImpl n=(X_CtCatchVariableReferenceImpl) nX;
			  }
			
			   if(nX instanceof X_CtCodeElementImpl) {
			  X_CtCodeElementImpl n=(X_CtCodeElementImpl) nX;
			  }
			   if(nX instanceof X_CtCodeSnippetExpressionImpl) {
			  X_CtCodeSnippetExpressionImpl n=(X_CtCodeSnippetExpressionImpl) nX;
			  }
			   if(nX instanceof X_CtCodeSnippetStatementImpl) {
			  X_CtCodeSnippetStatementImpl n=(X_CtCodeSnippetStatementImpl) nX;
			  }
			   if(nX instanceof X_CtCommentImpl) {
			  X_CtCommentImpl n=(X_CtCommentImpl) nX;
			  }
			   if(nX instanceof X_CtConditionalImpl) {
			  X_CtConditionalImpl n=(X_CtConditionalImpl) nX;
			  }
			   if(nX instanceof X_CtConstructorCallImpl) {
			  X_CtConstructorCallImpl n=(X_CtConstructorCallImpl) nX;
			  }
			   if(nX instanceof X_CtConstructorImpl) {
			  X_CtConstructorImpl n=(X_CtConstructorImpl) nX;
			  }
			   if(nX instanceof X_CtContinueImpl) {
			  X_CtContinueImpl n=(X_CtContinueImpl) nX;
			  }
			   if(nX instanceof X_CtDoImpl) {
			  X_CtDoImpl n=(X_CtDoImpl) nX;
			  }
			   if(nX instanceof X_CtElementImpl) {
			  X_CtElementImpl n=(X_CtElementImpl) nX;
			  }
			   if(nX instanceof X_CtEnumImpl) {
			  X_CtEnumImpl n=(X_CtEnumImpl) nX;
			  }
			   if(nX instanceof X_CtEnumValueImpl) {
			  X_CtEnumValueImpl n=(X_CtEnumValueImpl) nX;
			  }
			   if(nX instanceof X_CtExecutableImpl) {
			  X_CtExecutableImpl n=(X_CtExecutableImpl) nX;
			  }
			   if(nX instanceof X_CtExecutableReferenceExpressionImpl) {
			  X_CtExecutableReferenceExpressionImpl n=(X_CtExecutableReferenceExpressionImpl) nX;
			  }
			   if(nX instanceof X_CtExecutableReferenceImpl) {
			  X_CtExecutableReferenceImpl n=(X_CtExecutableReferenceImpl) nX;
			  }
			   if(nX instanceof X_CtExpressionImpl) {
			  X_CtExpressionImpl n=(X_CtExpressionImpl) nX;
			  }
			   if(nX instanceof X_CtFieldAccessImpl) {
			  X_CtFieldAccessImpl n=(X_CtFieldAccessImpl) nX;
			  }
			   if(nX instanceof X_CtFieldImpl) {
			  X_CtFieldImpl n=(X_CtFieldImpl) nX;
			  }
			   if(nX instanceof X_CtFieldReadImpl) {
			  X_CtFieldReadImpl n=(X_CtFieldReadImpl) nX;
			  }
			   if(nX instanceof X_CtFieldReferenceImpl) {
			  X_CtFieldReferenceImpl n=(X_CtFieldReferenceImpl) nX;
			  }
			   if(nX instanceof X_CtFieldWriteImpl) {
			  X_CtFieldWriteImpl n=(X_CtFieldWriteImpl) nX;
			  }
			   if(nX instanceof X_CtForEachImpl) {
			  X_CtForEachImpl n=(X_CtForEachImpl) nX;
			  }
			   if(nX instanceof X_CtForImpl) {
			  X_CtForImpl n=(X_CtForImpl) nX;
			  }
			   if(nX instanceof X_CtIfImpl) {
			  X_CtIfImpl n=(X_CtIfImpl) nX;
			  }

			   if(nX instanceof X_CtIntersectionTypeReferenceImpl) {
			  X_CtIntersectionTypeReferenceImpl n=(X_CtIntersectionTypeReferenceImpl) nX;
			  }
			   if(nX instanceof X_CtInvocationImpl) {
			  X_CtInvocationImpl n=(X_CtInvocationImpl) nX;
			  }
			   if(nX instanceof X_CtJavaDocImpl) {
			  X_CtJavaDocImpl n=(X_CtJavaDocImpl) nX;
			  }
			   if(nX instanceof X_CtJavaDocTagImpl) {
			  X_CtJavaDocTagImpl n=(X_CtJavaDocTagImpl) nX;
			  }
			   if(nX instanceof X_CtLambdaImpl) {
			  X_CtLambdaImpl n=(X_CtLambdaImpl) nX;
			  }
			   if(nX instanceof X_CtLiteralImpl) {
			  X_CtLiteralImpl n=(X_CtLiteralImpl) nX;
			  }
			   if(nX instanceof X_CtLocalVariableImpl) {
			  X_CtLocalVariableImpl n=(X_CtLocalVariableImpl) nX;
			  }
			   if(nX instanceof X_CtLocalVariableReferenceImpl) {
			  X_CtLocalVariableReferenceImpl n=(X_CtLocalVariableReferenceImpl) nX;
			  }
			   if(nX instanceof X_CtLoopImpl) {
			  X_CtLoopImpl n=(X_CtLoopImpl) nX;
			  }
			   if(nX instanceof X_CtMethodImpl) {
			  X_CtMethodImpl n=(X_CtMethodImpl) nX;
			  }
			   if(nX instanceof X_CtNamedElementImpl) {
			  X_CtNamedElementImpl n=(X_CtNamedElementImpl) nX;
			  }
			   if(nX instanceof X_CtNewArrayImpl) {
			  X_CtNewArrayImpl n=(X_CtNewArrayImpl) nX;
			  }
			   if(nX instanceof X_CtNewClassImpl) {
			  X_CtNewClassImpl n=(X_CtNewClassImpl) nX;
			  }
			   if(nX instanceof X_CtOperatorAssignmentImpl) {
			  X_CtOperatorAssignmentImpl n=(X_CtOperatorAssignmentImpl) nX;
			  }
		
			   if(nX instanceof X_CtPackageReferenceImpl) {
			  X_CtPackageReferenceImpl n=(X_CtPackageReferenceImpl) nX;
			  }
			   if(nX instanceof X_CtParameterImpl) {
			  X_CtParameterImpl n=(X_CtParameterImpl) nX;
			  }
			   if(nX instanceof X_CtParameterReferenceImpl) {
			  X_CtParameterReferenceImpl n=(X_CtParameterReferenceImpl) nX;
			  }
			   if(nX instanceof X_CtReferenceImpl) {
			  X_CtReferenceImpl n=(X_CtReferenceImpl) nX;
			  }
			   if(nX instanceof X_CtReturnImpl) {
			  X_CtReturnImpl n=(X_CtReturnImpl) nX;
			  }
			   if(nX instanceof X_CtStatementImpl) {
			  X_CtStatementImpl n=(X_CtStatementImpl) nX;
			  }
			   if(nX instanceof X_CtStatementListImpl) {
			  X_CtStatementListImpl n=(X_CtStatementListImpl) nX;
			  }
			   if(nX instanceof X_CtSuperAccessImpl) {
			  X_CtSuperAccessImpl n=(X_CtSuperAccessImpl) nX;
			  }
			   if(nX instanceof X_CtSwitchImpl) {
			  X_CtSwitchImpl n=(X_CtSwitchImpl) nX;
			  }
			   if(nX instanceof X_CtSynchronizedImpl) {
			  X_CtSynchronizedImpl n=(X_CtSynchronizedImpl) nX;
			  }
			   if(nX instanceof X_CtTargetedExpressionImpl) {
			  X_CtTargetedExpressionImpl n=(X_CtTargetedExpressionImpl) nX;
			  }
			   if(nX instanceof X_CtThisAccessImpl) {
			  X_CtThisAccessImpl n=(X_CtThisAccessImpl) nX;
			  }
			   if(nX instanceof X_CtThrowImpl) {
			  X_CtThrowImpl n=(X_CtThrowImpl) nX;
			  }
			   if(nX instanceof X_CtTryImpl) {
			  X_CtTryImpl n=(X_CtTryImpl) nX;
			  }
			   if(nX instanceof X_CtTryWithResourceImpl) {
			  X_CtTryWithResourceImpl n=(X_CtTryWithResourceImpl) nX;
			  }
			   if(nX instanceof X_CtTypeAccessImpl) {
			  X_CtTypeAccessImpl n=(X_CtTypeAccessImpl) nX;
			  }
			   if(nX instanceof X_CtTypeImpl) {
			  X_CtTypeImpl n=(X_CtTypeImpl) nX;
			  }
			   if(nX instanceof X_CtTypeParameterImpl) {
			  X_CtTypeParameterImpl n=(X_CtTypeParameterImpl) nX;
			  }
			   if(nX instanceof X_CtTypeParameterReferenceImpl) {
			  X_CtTypeParameterReferenceImpl n=(X_CtTypeParameterReferenceImpl) nX;
			  }
			   if(nX instanceof X_CtTypeReferenceImpl) {
			  X_CtTypeReferenceImpl n=(X_CtTypeReferenceImpl) nX;
			  }
			   if(nX instanceof X_CtUnaryOperatorImpl) {
			  X_CtUnaryOperatorImpl n=(X_CtUnaryOperatorImpl) nX;
			  }
			   if(nX instanceof X_CtUnboundVariableReferenceImpl) {
			  X_CtUnboundVariableReferenceImpl n=(X_CtUnboundVariableReferenceImpl) nX;
			  }
			   if(nX instanceof X_CtVariableAccessImpl) {
			  X_CtVariableAccessImpl n=(X_CtVariableAccessImpl) nX;
			  }
			   if(nX instanceof X_CtVariableReadImpl) {
			  X_CtVariableReadImpl n=(X_CtVariableReadImpl) nX;
			  }
			   if(nX instanceof X_CtVariableReferenceImpl) {
			  X_CtVariableReferenceImpl n=(X_CtVariableReferenceImpl) nX;
			  }
			   if(nX instanceof X_CtVariableWriteImpl) {
			  X_CtVariableWriteImpl n=(X_CtVariableWriteImpl) nX;
			  }
			   if(nX instanceof X_CtWhileImpl) {
			  X_CtWhileImpl n=(X_CtWhileImpl) nX;
			  }
			   if(nX instanceof X_CtWildcardReferenceImpl) {
			  X_CtWildcardReferenceImpl n=(X_CtWildcardReferenceImpl) nX;
			  }
	  }

	}

