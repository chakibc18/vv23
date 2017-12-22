package com.istic.VV1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.IOUtils;

import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtFieldReference;
import spoon.support.reflect.code.*;
import spoon.support.reflect.reference.*;
import spoon.support.reflect.declaration.*;
import spoon.reflect.declaration.CtElement;

public class Class_X_Hydrator {
	

static void hydrate (NODE entry) {}
static void hydrate_x (NODE entry, NODE root) {
	if (entry==null || entry.i_element==null) {
//		System.out.println("i null for");
		return ;
	}
	entry.node_string=entry.i_element.toString();
	entry.node_short_descr= entry.i_element.getShortRepresentation();
	entry.node_src_code= ClassUtil.get_code_source(entry.i_element);
	entry.node_line_number= ClassUtil.getLineNUmber(entry.i_element);
	entry.node_root=(X_CtPackageImpl) root;
	hydrate_switch(entry,root);
	   for (NODE x : entry.children)
		   Class_X_Hydrator.hydrate_x(x, root);

}
  static void hydrate_switch(NODE nX, NODE root) {
		 
	   if(nX instanceof X_CtPackageImpl) {
		  X_CtPackageImpl n=(X_CtPackageImpl) nX;
		  Set<CtPackage> pcks= n.i_element.getPackages();
		  for (CtPackage pck : pcks) {
			  NODE x = X_.create(pck, null, null,null, null, n, n);
			  n.children.add(x);
		  }
			Set<CtType<?>> classes_interfaces =  n.i_element.getTypes();
			for  (CtType t : classes_interfaces) {
				NODE x = X_.create(t, null, null,null, null, (X_CtPackageImpl) n, n);
				n.children.add(x);
			}
		  }
	   if(nX instanceof X_CtClassImpl) {
			  X_CtClassImpl n=(X_CtClassImpl) nX;
			  n.super_class= n.i_element.getSuperclass();
			  n.node_simple_name= n.i_element.getSimpleName();
				List<CtFieldReference> fields =n.i_element.getAllFields();
				for (CtFieldReference f :fields) {
		NODE x = X_.create(f,null,null,n,null,n.node_package,n);
//		System.out.println(x.node_line_number+" "+x.node_name+f.getQualifiedName());

		n.children.add(x);
				}
				Set<CtExecutable>  i_methodes=  n.i_element.getConstructors();
				for (CtExecutable i_method: i_methodes) {
					NODE x = X_.create(i_method,null,null,n,null,n.node_package,n);
					n.children.add(x);
				}
				i_methodes= n.i_element.getMethods();
				for (CtExecutable i_method: i_methodes) {
					NODE x = X_.create(i_method,null,null,n,null,n.node_package,n);
					n.children.add(x);
				}
			  
			  
			  }
	   if(nX instanceof X_CtInterfaceImpl) {
	  X_CtInterfaceImpl n=(X_CtInterfaceImpl) nX;
	  n.node_simple_name= n.i_element.getSimpleName();
	  Set<CtExecutable>  i_methodes= n.i_element.getMethods();
			for (CtExecutable i_method: i_methodes) {
				NODE x = X_.create(i_method,null,null,null,n,n.node_package,n);
				n.children.add(x);
			}
		  
	  }
	   if(nX instanceof X_CtFieldReferenceImpl) {
	  X_CtFieldReferenceImpl n=(X_CtFieldReferenceImpl) nX;
	  
	  NODE x = X_.create_fast(n.i_element.getDeclaration(), n);
//		System.out.println(x.node_line_number+" "+x.node_name+"----------------------------");

	  n.children.add(x);
	  }
	   if(nX instanceof X_CtAssignmentImpl) {
		  X_CtAssignmentImpl n=(X_CtAssignmentImpl) nX;
		  NODE x = X_.create_fast(n.i_element.getAssigned(), n);
		  n.children.add(x);
		  n.assigned=x;
//			System.out.println(x.node_line_number+" "+x.node_name+"zzzzzzzzzz");

		    x = X_.create_fast(n.i_element.getAssignment(),  n);
		    n.assignment=x;
		  n.children.add(n.assignment);
//			System.out.println(x.node_line_number+" "+x.node_name+"zzzzzzzzzzzz");

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
	
		   if(nX instanceof X_CtBinaryOperatorImpl) {
		  X_CtBinaryOperatorImpl n=(X_CtBinaryOperatorImpl) nX;
		    n.op_type= n.i_element.getKind();
			  NODE x = X_.create_fast(n.i_element.getLeftHandOperand(),n);
			  n.children.add(x);
			  x = X_.create_fast(n.i_element.getRightHandOperand(), n);
			  n.children.add(x);
		  
		  }
		   if(nX instanceof X_CtBlockImpl) {
		  X_CtBlockImpl n=(X_CtBlockImpl) nX;
			 List<CtStatement> meth_st= n.i_element.getStatements();
		  for (CtStatement i_st: meth_st) {
			 	NODE x = X_.create_fast(i_st, n);
			 	n.children.add(x );
			 }
		  
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
		 NODE  x = X_.create(n.i_element.getExecutable(), null,null, n.node_class, null, n.node_package, n);
		  n.children.add(x);	  
		  
		  }
		   if(nX instanceof X_CtConstructorImpl) {
		  X_CtConstructorImpl n=(X_CtConstructorImpl) nX;
		  
			List<CtParameter> param_st= n.i_element.getParameters();
			for (CtParameter i_st: param_st) {
				 NODE  x = X_.create(i_st, null, n,n.node_class, null, n.node_package, n);
				  n.children.add(x);

			}
	List<CtStatement> meth_st= n.i_element.getBody().getStatements();
 
	  for (CtStatement i_st: meth_st) {
		  NODE x= X_.create(i_st, null,n, n.node_class, n.node_interface, n.node_package, n);
			n.children.add(x);
	  }	
	
	
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
		  
		  NODE x = X_.create_fast(n.i_element.getAssignment(),  n);
		  n.children.add(x);
		  }
		   if(nX instanceof X_CtFieldReadImpl) {
		  X_CtFieldReadImpl n=(X_CtFieldReadImpl) nX;
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
		   n.if_condition=   X_.create_fast(n.i_element.getCondition() ,n);
		   n.children.add(n.if_condition);
		   n.then_block=  X_.create_fast(n.i_element.getThenStatement() ,n);
		   n.children.add(n.then_block);
		   n.else_block= X_.create_fast(n.i_element.getElseStatement() ,n);
		   n.children.add(n.else_block);
		  }

		   if(nX instanceof X_CtIntersectionTypeReferenceImpl) {
		  X_CtIntersectionTypeReferenceImpl n=(X_CtIntersectionTypeReferenceImpl) nX;
		  }
		   if(nX instanceof X_CtInvocationImpl) {
		  X_CtInvocationImpl n=(X_CtInvocationImpl) nX;
			CtExecutableReferenceImpl ie = (CtExecutableReferenceImpl) n.i_element.getExecutable() ;
			 List<CtExpression> i_args=  n.i_element.getArguments();
				for (CtExpression arrg: i_args) {
					NODE x =X_.create_fast(arrg,  n);
					n.children.add(x);
				}		  }
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
		  NODE x= X_.create_fast(n.i_element.getReference(),   n);
			n.children.add(x);
			 x= X_.create_fast(n.i_element.getAssignment(),   n);
				n.children.add(x);

			
				 }
		   if(nX instanceof X_CtLocalVariableReferenceImpl) {
		  X_CtLocalVariableReferenceImpl n=(X_CtLocalVariableReferenceImpl) nX;
		  }
		   if(nX instanceof X_CtLoopImpl) {
		  X_CtLoopImpl n=(X_CtLoopImpl) nX;
		  }
		   if(nX instanceof X_CtMethodImpl) {
		  X_CtMethodImpl n=(X_CtMethodImpl) nX;
		  if (n.parent instanceof X_CtInterfaceImpl) return;
		  List<CtStatement> meth_st= n.i_element.getBody().getStatements();
		  for (CtStatement i_st: meth_st) {
			  NODE x= X_.create(i_st, n, null,n.node_class, n.node_interface, n.node_package, n);
				n.children.add(x);
		  }		 
		  
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
		  NODE x= X_.create_fast(n.i_element.getType(), n);
			n.children.add(x);
			    x= X_.create_fast(n.i_element.getReference(), n);
				n.children.add(x);
		  
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
		 n.ref_class=n.i_element.getActualClass();
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
		   n.while_condition=   X_.create_fast(n.i_element.getLoopingExpression() ,n);
		   n.children.add(n.while_condition);
		   n.while_block=  X_.create_fast(n.i_element.getBody(),n);
		   n.children.add(n.while_block);
		  }
		   if(nX instanceof X_CtWildcardReferenceImpl) {
		  X_CtWildcardReferenceImpl n=(X_CtWildcardReferenceImpl) nX;
		  }
  }

}

